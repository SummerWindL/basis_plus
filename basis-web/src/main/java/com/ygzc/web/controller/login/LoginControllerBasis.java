package com.ygzc.web.controller.login;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ygzc.api.persistence.DelegateService;
import com.ygzc.api.user.UserService;
import com.ygzc.common.constant.CommonEnums;
import com.ygzc.common.support.BaseSupport;
import com.ygzc.core.annotation.LogInject;
import com.ygzc.core.bean.Result;
import com.ygzc.core.controller.BaseController;
import com.ygzc.core.util.ValidateUtils;
import com.ygzc.core.util.rsa.Base64;
import com.ygzc.core.util.rsa.RSAEncrypt;
import com.ygzc.dao.mapper.ygzc.UserMapper;
import com.ygzc.dao.model.dto.UserInfoDto;
import com.ygzc.dao.model.login.LoginModel;
import com.ygzc.dao.model.ygzc.User;
import com.ygzc.web.controller.regist.RegistController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("/auth/login")
@Api(value = "/auth/login", tags = "登录接口")
public class LoginControllerBasis extends BaseController{

	@LogInject
	private static Logger log;
	
	@Autowired
    private DelegateService delegateService;
	
	@Autowired
	private UserService userService;
	
	/**
	 * 登录方法
	 * @param phoneNum   用户名称（手机号）
	 * @param password   密码
	 * @param device     设备id
	 * @param iosId      iosid
	 * @param devicetype 设备类型 （0-Android，1-IOS，2-web）
	 * @return
	 */
	@PostMapping
	@ResponseBody
	@ApiOperation(value = "登录方法", notes = "登录方法", httpMethod = "POST", response = LoginControllerBasis.class)
	public Result login(String phoneNum,String password,String device,String iosId,String devicetype/*@Validated @PathVariable User user,BindingResult error*/) {
		log.info("login Method start");
		String filepath = LoginControllerBasis.class.getClassLoader().getResource("secretKey").getPath();
		Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("phoneNum", phoneNum);
        
//        paramMap.put("password", password);
        //带查询的单个对象
        try {
        	if(StringUtils.isEmpty(phoneNum)||StringUtils.isEmpty(password)) {
            	return Result.error("手机、密码为空！");
            }else {
            	if(!ValidateUtils.isMobile(phoneNum)) {
            		return Result.error("手机格式不正确");
            	}else if(password.length()<8) {
            		return Result.error("密码长度不够");
            	}else {
            		User user2 = userService.getByMobileNumber(phoneNum);
            		// 私钥加密过程
    				byte[] cipherData = RSAEncrypt.encrypt(RSAEncrypt.loadPrivateKeyByStr(RSAEncrypt.loadPrivateKeyByFile(filepath)),
    						password.getBytes());
    				String cipher = Base64.encode(cipherData);
    				System.out.println(cipher);
    				paramMap.put("password", cipher);
//            		User user = delegateService.selectOne("com.ygzc.dao.mapper.UserMapper.getByMobileNumber", phoneNum);
            		//通过phoneNum，password获取getLoginUser，user对象
            		User loginUser = delegateService.selectOne("com.ygzc.dao.mapper.ygzc.UserMapper.getLoginUser", paramMap);
            		if(StringUtils.isEmpty(loginUser)) {
                    	return Result.error("账号或密码错误！");
                    }
            		//存在用户，密码校验
            		// 公钥解密过程
            		byte[] res = RSAEncrypt.decrypt(RSAEncrypt.loadPublicKeyByStr(RSAEncrypt.loadPublicKeyByFile(filepath)),
            				Base64.decode(user2.getPassword()));
            		String rest = new String(res);
            		//设置返回对象
            		Map<String,Object> map = new HashMap<String, Object>();
            		UserInfoDto dto = userService.getByPhoneNum(phoneNum);
            		//将phoneNum作为key token作为value expireTime作为过期时间，存入redis
            		redisTemplate.opsForValue().set(phoneNum, dto.getToken());
            		//设置过期时间
            		log.info("~~~~~~~~~~~~~~~~~"+dto.getExpirTime());
            		redisTemplate.expireAt(phoneNum, dto.getExpirTime());//timestamp
//            		redisTemplate.expire(phoneNum, dto.getExpirTime().getSeconds(),TimeUnit.SECONDS);//设置过期时间为秒
            		if(password.equals(rest)) {
            			if(dto==null) {
            				return Result.error("102","不存在的账号！",map);//102 不存在的账号
                		}else {
	            			//登录成功存取token
	            			map.put("uid", loginUser.getUid());
	            			map.put("token", dto.getToken());
	            			map.put("nickname", dto.getNickname());
	            			map.put("phoneNum", dto.getPhoneNum());
	            			map.put("password", dto.getPassword());
	            			map.put("avatar", loginUser.getAvatar());//头像
	            			map.put("sex", loginUser.getGender());//性别
	            			map.put("url", loginUser.getUrl());//url
	            			map.put("info", loginUser.getInfo());//信息
	            			map.put("email", loginUser.getEmail());//email
	            			log.info("login Method end");
	            			return Result.success("301","登录成功！",map);
                		}
            		}else {
            			return Result.error("103","密码错误！",map);
            		}
            		/*System.out.println("Basis -> Log 输出：" + loginUser);*/
            		
            		/*Subject subject = SecurityUtils.getSubject();
            		if(!subject.isAuthenticated()) {//当前用户是否已经通过身份验证
            			UsernamePasswordToken token = new UsernamePasswordToken(phoneNum,password);
            			// 使用 shiro 来验证
                        subject.login(token);//验证角色和权限
                        this.getSession().setAttribute("user", loginUser);
            		}
            		
            		return Result.success("登陆成功！");*/
            	}
            }
		} catch (Exception e) {
			e.printStackTrace();
			return Result.error("302","系统异常",e);
		}
	}
}
