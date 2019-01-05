package com.ygzc.service.user;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.ygzc.api.user.UserService;
import com.ygzc.api.user.UserTokensService;
import com.ygzc.common.constant.ConstantBean;
import com.ygzc.dao.mapper.ygzc.UserMapper;
import com.ygzc.dao.mapper.ygzc.UserProfileMapper;
import com.ygzc.dao.mapper.ygzc.UserTokensMapper;
import com.ygzc.dao.model.dto.UserInfoDto;
import com.ygzc.dao.model.ygzc.User;
import com.ygzc.dao.model.ygzc.UserProfile;
import com.ygzc.service.util.UuidGenUtils;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private UserProfileMapper userProfileMapper;
	
	@Autowired
	private UserTokensService userTokensService;
	
	@Override
	public User getByMobileNumber(String mobileNubmer) {
//		Map<String,Object> map = new HashMap<String, Object>();
//		map.put("phone_num", mobileNubmer);
		User user = userMapper.getByMobileNumber(mobileNubmer);
		return user;
	}

	@Override
	public User register(String phoneNum,String password) {
		//注册逻辑
		//插入用户信息
		String uid = UuidGenUtils.genUUID();
		User user = new User();
		user.setUid(uid);//用户id
		user.setRegionCode(null);//国家电话代码前缀（86-中国）
		user.setPhoneNum(phoneNum);//手机号码
		user.setEmail(null);//email
		user.setGender(null);//性别（0女生、1男生、3保密）
		user.setIdCode(null);//邀请码
		user.setInviteCode(null);//被邀请码
		user.setPoint(ConstantBean.SCORE_DEFAULT);//积分
		user.setNickName(null);//昵称
		user.setIp(null);//ip地址
		user.setCityId(0000);//城市id
		user.setDeviceId(null);//手机唯一id
		user.setDeviceIos(null);//IOS唯一id
		user.setAvatar(null);//头像
		user.setPassword(password);//密码
		user.setUrl(null);//url
		user.setCompany(null);//公司
		user.setLocation(null);//GPS定位
		user.setInfo(null);//个人信息
		user.setWeibo(null);//微博
		user.setWeixin(null);//微信
		user.setQq(null);//qq
		user.setIsActive(ConstantBean.IS_ACTIVE);//是否在线 0-否 1-是
		user.setRands(null);//密钥
		user.setOtherFlag(null);//其他Flag
		user.setCreateDate(new Date());//创建时间
		user.setUpdateDate(new Date());//更新时间
//		userMapper.insertSelective();
		userMapper.insert(user);
		//同时将uid存入userProfile中,之后实名认证需要
//		UserProfile userProfile = new UserProfile();
//		userProfile.setUid(uid);
//		userProfileMapper.insertSelective(userProfile);
		
		return user;
	}

	@Override
	public User get(String uid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateInfo(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insertSelective(User record) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PageInfo<Map<String, Object>> selectAllUser(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByuId(String uid) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 设置密码
	 */
	@Override
	public void updatePwd(String phoneNum, String password) {
		User user = getByMobileNumber(phoneNum);//根据电话号码获取用户信息
		user.setPassword(password);
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("phoneNum", phoneNum);
		params.put("password", password);
		System.out.println("Map========================="+params);
		this.userMapper.updatePwd(params);
	}

	/**
	 * 根据手机删除用户
	 */
	@Override
	public void deleteUser(String phoneNum) {
		userMapper.deleteByPhoneNum(phoneNum);
	}

	/**
	 * 获取登录成功后封装的UserInfoDto对象，以便通过dto获取用户token
	 */
	@Override
	public UserInfoDto getByPhoneNum(String phoneNum) {
		User user = getByMobileNumber(phoneNum);
		return userTokensService.getUserInfoDto(user);//返回用户登录信息
	}

}
