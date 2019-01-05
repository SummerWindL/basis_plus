/**
 * 
 */
package com.ygzc.web.controller.user.sms;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ygzc.api.persistence.DelegateService;
import com.ygzc.common.constant.CommonEnums;
import com.ygzc.common.constant.SmsBean;
import com.ygzc.common.util.HttpClientUtil;
import com.ygzc.core.admin.Result;
import com.ygzc.core.controller.BaseController;
import com.ygzc.core.util.RandomUtils;
import com.ygzc.core.util.StringUtils;
import com.ygzc.core.util.ValidateUtils;
import com.ygzc.core.util.redis.RedisUtils;
import com.ygzc.dao.model.ygzc.User;
import com.ygzc.web.controller.user.sms.redis.RedisBaiseTakes;
import com.ygzc.web.controller.user.sms.redis.RedisCacheUtil;


/**
 * 短信服务控制类
 * @author yanl.fu
 *
 */
@Controller
@RequestMapping("/sms")
public class SmsController extends BaseController{
	
	private Logger logger = LoggerFactory.getLogger(SmsController.class);
	@Autowired
	private DelegateService delegateService;
	
	/*@Resource(name="seeUserRedisTakes")
    private RedisBaiseTakes seeUserRedisTakes;*/
	
	/*@Resource(name="redisTemplate")
    private RedisTemplate redisTemplate;*/
	
	/*@Autowired
	@Qualifier("redisTemplate")
	private RedisTemplate<String,Object> redisTemplate;*/
	
	/*@Autowired
	private RedisCacheUtil<Object> redisCache;*/
	
	/**
	 * 发送短信
	 * @param phoneNum 手机号码
	 * @param smsType  短信类型（1：注册短信；2：找回密码短信；3：登录短信）
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@PostMapping("/send")
	@ResponseBody
	public Result send(String phoneNum,Integer smsType) {
		Result r = new Result();
		try {
			
			if(StringUtils.isBlank(phoneNum)||smsType == null||(smsType != 1 && smsType !=2 && smsType != 3)) {
				commonEnums = CommonEnums.PARAMETER_ERROR;//300 参数错误
			}else {
				if(!ValidateUtils.isMobile(phoneNum)) {
					commonEnums = CommonEnums.MOBILE_ERROR;//303手机号码格式不正确
				}else {
					//判断数据库中该手机号码是否注册
					//未注册发送短信进行注册，否则返回手机号码已被注册
					Map<String, Object> param = new HashMap<String,Object>();
					param.put("phoneNum", phoneNum);
					User user = delegateService.selectOne("com.ygzc.dao.mapper.ygzc.UserMapper.getByMobileNumber", param);
					String smsBeanType = "";
					if(smsType == 1) {//注册
						if(user != null) {
							commonEnums = CommonEnums.REGISTER_ACCOUNT_EXIST;//100 该手机号码已注册，请勿重新注册
							return r;
						}
						smsBeanType = SmsBean.SMS_TYPE_REGISTER;
					}else if(smsType == 2) {//找回密码，确定账号已经存在
						if(user == null) {
							commonEnums = CommonEnums.NOT_EXIST_ACCOUNT;//102 不存在的账号
							return r;
						}
						smsBeanType = SmsBean.SMS_TYPE_FIND_PWD;	
					}else{
						if(user == null) {
							commonEnums = CommonEnums.NOT_EXIST_ACCOUNT;//102 不存在的账号
							return r;
						}
						smsBeanType = SmsBean.SMS_TYPE_LOGIN;
					}
					
					String code = RandomUtils.generateNum();//短信校验码
					//添加到redis缓存 - 1、使用RedisUtils工具类
//					RedisUtils.addValue(phoneNum+smsBeanType, code);
//					RedisUtils.disableTime(phoneNum+smsBeanType, 600);//600秒后过期
					
					//2、使用RedisCacheUtil工具类
//					RedisCacheUtil<Object> rsu = new RedisCacheUtil<Object>();//redis缓存工具类
//					rsu.setCacheObject(phoneNum+smsBeanType, code);
//					rsu.expired(phoneNum+smsBeanType, 600);//600秒后过期
//				    long ttl = rsu.ttl(phoneNum+smsBeanType);
//				    System.out.println("redis过期时间============="+ttl);
					 
					
					//3、使用redisTemplate操作redis缓存
					/**
					 * 注意：使用redisTemplate操作redis存储的String数据格式为    "\"468351\""
					 */
					if(redisTemplate == null) {
						commonEnums = CommonEnums.REDIS_ERROR;//311 redis异常
						logger.warn("redisTemplate 实例化失败");
						return r;
					}else {
						redisTemplate.opsForValue().set(phoneNum+smsBeanType, code);
						Boolean expire = redisTemplate.expire(phoneNum+smsBeanType, 600, TimeUnit.SECONDS);
						System.out.println(expire);
					}
					
				    //4、使用seeUserRedisTakes工具缓存
					/*if(seeUserRedisTakes == null) {
						commonEnums = CommonEnums.REDIS_ERROR;//311 redis异常
						logger.warn("seeUserRedisTakes 实例化失败");
						return r;
					}else {
						seeUserRedisTakes.add(phoneNum+smsBeanType, code);
					}*/
					//短信内容
					String smsContent = SmsBean.contentTem.replace("@", code);
					HttpClientUtil client = HttpClientUtil.getInstance();
//					client.sendMsgGbk(SmsBean.uid,SmsBean.key, smsContent, phoneNum);//发送短信
					commonEnums = CommonEnums.SUCCESS;//301 成功
				}
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
}





















