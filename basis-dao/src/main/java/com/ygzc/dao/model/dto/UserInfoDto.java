/**
 * 
 */
package com.ygzc.dao.model.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author yanl.fu
 *
 */
public class UserInfoDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4069893295218888327L;

	/**
	 * 用户id
	 */
	private String uid;
	
	/**
	 * 用户电话
	 */
	private String phoneNum;
	
	/**
	 * tonken凭证
	 */
	private String token;
	
	/**
	 * tonken过期时间
	 */
	private Date expirTime;
	
	/**
	 * 用户昵称
	 */
	private String nickname;
	
	/**
	 * 用户密码
	 */
	private String password;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getExpirTime() {
		return expirTime;
	}

	public void setExpirTime(Date expirTime) {
		this.expirTime = expirTime;
	}
	
}
