package com.ygzc.api.user;

import com.ygzc.dao.model.dto.UserInfoDto;
import com.ygzc.dao.model.ygzc.User;
import com.ygzc.dao.model.ygzc.UserTokens;

/**
 * 用户tokens表
 * @author yanl.fu
 *
 */
public interface UserTokensService {

	/**
	 * 获取用户登录成功后的信息
	 * 
	 * @param user
	 * @return
	 */
	public UserInfoDto getUserInfoDto(User user);
	
	/**
	 * 获取最新的tonken
	 * 
	 * @param uid 用户id
	 * @return
	 */
	public String getTokenByUid(String uid);
	
	/**
	 * 插入记录
	 * @param token
	 */
	public void insertSelective(UserTokens token);
	
	/**
	 * 删除用户token记录
	 * 
	 * @param uid 用户id
	 */
	public void deleteToken(String uid);
}
