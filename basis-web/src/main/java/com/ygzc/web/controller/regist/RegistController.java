package com.ygzc.web.controller.regist;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ygzc.api.persistence.DelegateService;
import com.ygzc.api.user.UserService;
import com.ygzc.common.constant.CommonEnums;
import com.ygzc.common.constant.SmsBean;
import com.ygzc.core.admin.Result;
import com.ygzc.core.controller.BaseController;
import com.ygzc.core.util.MD5Util;
import com.ygzc.core.util.MobileCodeUtil;
import com.ygzc.core.util.ValidateUtils;
import com.ygzc.core.util.redis.RedisUtils;
import com.ygzc.core.util.rsa.Base64;
import com.ygzc.core.util.rsa.RSAEncrypt;
import com.ygzc.dao.model.ygzc.User;

@Controller
@RequestMapping("/auth/regist")
public class RegistController extends BaseController{

	@Autowired
	private DelegateService delegateService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	@Qualifier("redisTemplate")
	private RedisTemplate<String,Object> redisTemplate;
	/**
	 * 避免多线程写入变量值可以对保证线程之间的透明性
	 */
	private volatile boolean flag = true;
	/**
	 * 检查是否存在
	 * @param phoneNum  手机号
	 * @param password  密码
	 * @param nickName  昵称
	 * @param device_id 手机唯一id
	 * @return
	 */
	@PostMapping("/checkIsExist")
	@ResponseBody
	public Result doRegist(String phoneNum,String password,String nickName,String device_id) {
		Result result = new Result();
		Map<String,Object> param = new HashMap<>();
		param.put("phone_num", phoneNum);
		try {
			//带条件查询，查询数据库中是否存在该手机号
			User user = delegateService.selectOne("com.ygzc.dao.mapper.ygzc.UserMapper.getByMobileNumber", param);
			if(StringUtils.isEmpty(password)||StringUtils.isEmpty(phoneNum)) {
				commonEnums = CommonEnums.PARAMETER_ERROR;//参数错误
				this.flag = false;
//				result.setStatus(commonEnums.getValue());
//				result.setMessage(commonEnums.getLabel());
//				return result;
			}
			if(!ValidateUtils.isMobile(phoneNum)) {
				commonEnums = CommonEnums.MOBILE_ERROR;//303手机号码格式不正确
				this.flag = false;
			}
			if(password.length() < 8) {
				commonEnums = CommonEnums.PWD_LENGTH_NOT_ENOUGH; // 307 密码长度不够
				this.flag = false;
			}
			if(!StringUtils.isEmpty(user)) {//用户已经存在
				commonEnums = CommonEnums.REGISTER_ACCOUNT_EXIST; // 100 该手机号码已注册，不能重新注册
				this.flag = false;
			}
			if(this.flag) {
				commonEnums = CommonEnums.SUCCESS;//301成功
			}
		} catch (Exception e) {
			e.printStackTrace();
			commonEnums = CommonEnums.SYSTEM_ERROR;//302系统错误
		} finally {
			
			result.setStatus(commonEnums.getValue());
			result.setMessage(commonEnums.getLabel());
		}
		
		return result;
	}
	
	/**
	 * 保存注册信息
	 * @param phoneNum 手机号码
	 * @param password 密码
	 * @param code     验证码
	 * @return
	 */
	@PostMapping("/saveUser")
	@ResponseBody
	public Result saveUser(String phoneNum,String password,String code) {
		Result r = new Result();
		try {
			if(StringUtils.isEmpty(phoneNum)||StringUtils.isEmpty(password)||StringUtils.isEmpty(code)) {
				commonEnums = CommonEnums.PARAMETER_ERROR;//300 参数错误
				this.flag = false;
			}
			if(!ValidateUtils.isMobile(phoneNum)) {
				commonEnums = CommonEnums.MOBILE_ERROR;//303手机号码格式不正确
				this.flag = false;
			}
			//获取手机验证码
//			String codeStr = MobileCodeUtil.getCode(phoneNum+SmsBean.SMS_TYPE_REGISTER);
//			String codeStr = RedisUtils.getValue(phoneNum+SmsBean.SMS_TYPE_REGISTER);
			String codeStr = (String) redisTemplate.opsForValue().get(phoneNum+SmsBean.SMS_TYPE_REGISTER);
			if(StringUtils.isEmpty(codeStr)||!codeStr.equals(code)) {
				commonEnums = CommonEnums.CODE_ERROR;//306验证码错误
				this.flag = false;
			}
			if(password.length()<8) {
				commonEnums = CommonEnums.PWD_LENGTH_NOT_ENOUGH;//307密码长度不足
				this.flag = false;
			}
//			Map<String,Object> param = new HashMap<String,Object>();
//			param.put("phone_num", phoneNum);
			//带条件查询，查询数据库中是否存在该手机号
//			User user = delegateService.selectOne("com.ygzc.dao.mapper.UserMapper.getByMobileNumber", param);
			User user = userService.getByMobileNumber(phoneNum);
			if(user != null) {
				commonEnums = CommonEnums.REGISTER_ACCOUNT_EXIST;//100该手机号已注册，不能重新注册
				this.flag = false;
			}
			if(this.flag) {
				//密码加盐处理 ---->改用RAS+Base64加密 2018.6.8
//				String md5password = MD5Util.MD5Encode(password);
				// 私钥加密过程
				String filepath = RegistController.class.getClassLoader().getResource("secretKey").getPath();
				byte[] cipherData = RSAEncrypt.encrypt(RSAEncrypt.loadPrivateKeyByStr(RSAEncrypt.loadPrivateKeyByFile(filepath)),
						password.getBytes());
				String cipher = Base64.encode(cipherData);
				System.out.println(cipher);
				
				user = userService.register(phoneNum,cipher);
				commonEnums = CommonEnums.SUCCESS;//301成功
				r.setData(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
			commonEnums = CommonEnums.SYSTEM_ERROR;//302系统错误
		} finally {
			r.setStatus(commonEnums.getValue());
			r.setMessage(commonEnums.getLabel());
		}
		return r;
	}
	
	/**
    *
    * 注册时候校验验证码
    *
    * @param phoneNum 手机号码
    * @param code 验证码
    * @return
    */
   @PostMapping("/checkCode")
   @ResponseBody
   public Result checkCode(String phoneNum,String code,String password) {

       Result r = new Result();
       try {
           if (StringUtils.isEmpty(phoneNum) || StringUtils.isEmpty(code)) {
               commonEnums = CommonEnums.PARAMETER_ERROR; // 300 参数错误
           } else  {
               if (!ValidateUtils.isMobile(phoneNum)) {
                   commonEnums = CommonEnums.MOBILE_ERROR; // 303 手机号码格式不正确
               } else {
//                   String codeStr = MobileCodeUtil.getCode(phoneNum + SmsBean.SMS_TYPE_REGISTER); // 获取缓存中的验证码
                   //获取redis中的验证码
                   String codeStr = RedisUtils.getValue(phoneNum + SmsBean.SMS_TYPE_REGISTER);
                   if (StringUtils.isEmpty(codeStr)) {
                       commonEnums = CommonEnums.CODE_PAST_DUE; // 309 验证码已过期
                   } else {
                       if (!codeStr.equals(code)) {
                           commonEnums = CommonEnums.CODE_ERROR; // 306 验证码错误
                       } else {
                    	   	 Map<String, Object> param = new HashMap<String, Object>();
                    	     param.put("phone_num", phoneNum);
                    	   	 User user = delegateService.selectOne("com.ygzc.dao.mapper.ygzc.UserMapper.getByMobileNumber",param);
                           if (user != null) {
                               commonEnums = CommonEnums.REGISTER_ACCOUNT_EXIST; // 100 该手机号码已注册，不能重新注册
                           } else {
//                               userInfo = userAuthsService.addRegister(mobileNumber);
//                               UserInfoDto userInfoDto = userTokenService.getUserInfoDto(userInfo);
//                               r.setData(userInfoDto);
                        	   //注册
                        	   	User userR = userService.register(phoneNum, password);
//                        	   userService.register(phoneNum);
                               commonEnums = CommonEnums.SUCCESS; // 301 成功
                           }
                       }
                   }
               }
           }

       } catch (Exception e) {
           e.printStackTrace();
           commonEnums = CommonEnums.SYSTEM_ERROR; // 302 系统错误
       } finally {
           r.setStatus(commonEnums.getValue());
           r.setMessage(commonEnums.getLabel());
       }
       return r;
   }
	
}
