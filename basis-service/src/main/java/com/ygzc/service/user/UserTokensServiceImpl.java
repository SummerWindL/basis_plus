/**
 * 
 */
package com.ygzc.service.user;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.rpc.protocol.redis.RedisProtocol;
import com.ygzc.api.user.UserTokensService;
import com.ygzc.dao.mapper.ygzc.UserTokensMapper;
import com.ygzc.dao.model.dto.UserInfoDto;
import com.ygzc.dao.model.ygzc.User;
import com.ygzc.dao.model.ygzc.UserTokens;

/**
 * @author yanl.fu
 *
 */
@Service("userTokensService")
public class UserTokensServiceImpl implements UserTokensService {

	@Autowired
	private UserTokensMapper userTokensMapper;
	
	/**
	 * 获取用户登录成功后信息
	 */
	@Override
	public UserInfoDto getUserInfoDto(User user) {
		UserInfoDto userInfoDto = new UserInfoDto();
		userInfoDto.setNickname(user.getNickName());
		userInfoDto.setPhoneNum(user.getPhoneNum());
		userInfoDto.setUid(user.getUid());
		userInfoDto.setPassword(user.getPassword());
		//每次登录成功先清除之前的token
		userTokensMapper.emptyToken(user.getUid());//根据uid清除token
		String token = RandomStringUtils.randomNumeric(6);//生成6位随机数
		userInfoDto.setToken(token);
		UserTokens userToken = new UserTokens();
		userToken.setUid(user.getUid());
		userToken.setToken(token);
		//获取当前时间后十天
		long AftenTenDay = getPreAfterDate(new Date(),10).getTime();
		userToken.setExpiretime(new Date(AftenTenDay));//10天后过期
		//将过期时间刷新到redis缓存中
		userInfoDto.setExpirTime(new Date(AftenTenDay));//将过期时间放入dto对象
		userTokensMapper.insertSelective(userToken);
		return userInfoDto;
	}
	
	/**
	 * 获取传入日期的前或后 几天
	 * @param date
	 * @return
	 */
	public Date getPreAfterDate(Date date, int num) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.DAY_OF_MONTH, num);
		return c.getTime();
	}

	/***
	 * 获取最新的token
	 */
	@Override
	public String getTokenByUid(String uid) {
		UserTokens token = this.userTokensMapper.selectByUid(uid);
		if(token!=null) {
			return token.getToken();
		}
		return null;
	}

	/**
	 * 插入记录
	 */
	@Override
	public void insertSelective(UserTokens token) {
		this.userTokensMapper.insertSelective(token);
	}

	/**
	 * 删除用户token记录
	 */
	@Override
	public void deleteToken(String uid) {
		this.userTokensMapper.emptyToken(uid);
	}

	

}
