package com.ygzc.api.user;

import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.ygzc.dao.model.dto.UserInfoDto;
import com.ygzc.dao.model.ygzc.User;

/**
 * 用户操作接口
 * @author yanl.fu
 *
 */
public interface UserService {

	
	/**
	 * 通过手机号码删除用户
	 * @param phoneNum
	 */
	public void deleteUser(String phoneNum);
	
	/**
    *
    * 通过手机号码获取用户信息
    *
    * @param mobileNubmer 手机号码
    * @return
    */
   public User getByMobileNumber(String mobileNubmer);
   
   /**
    *	通过手机号码获取用户信息
	 * @param phoneNum
	 * @return
	 */
	public UserInfoDto getByPhoneNum(String phoneNum);
   
   /**
     * 设置密码
	 * @param phoneNum
	 * @param password
	 */
   public void updatePwd(String phoneNum,String password);

   /**
    *
    * 用户注册
    *
    * @param record
    */
   public User register(String phoneNum,String password);

   /**
    *
    * 获取用户信息
    *
    * @param uid
    * @return
    */
   public User get(String uid);


   /**
    *
    * 更新用户信息
    *
    * @param user
    */
   public int updateInfo(User user);


   /**
    *
    * 插入数据
    *
    * @param record
    */
   public void insertSelective(User record);

   /**
    *
    * 登录授权
    *
    * @param loginType 登录类型（1：手机号码和密码登录；2：微信登录；3：qq登录；4：微博登录，5：手机加验证码）
    * @param loginIdentifier 登录标识（比如：手机号码）
    * @param loginCredential 登录凭证（比如：登录密码），如果是密码，则长度限制为6-16，密码暂时使用md5
    * @param mobileNumber 手机号码
    * @return
    */
//   public User createAuths(String loginType,String loginIdentifier,String loginCredential, String mobileNumber);

   /**
    *
    * 通过账号id获取用户信息
    *
    * @param uid 账号id（唯一性）
    * @return
    */
   public User getUserByuId(String uid);

   /**
    * 查询所有用户
    * @return
    */
   public PageInfo<Map<String, Object>> selectAllUser(Map<String, Object> map);

  
  /**
   * 用户充值
  * @param userInfoId
  * @param payType
  * @param equipmentStatus
  * @param orderAmount
  * @return void
  */
//  public String addOrderUserRecharge(String userInfoId, String payType, String equipmentStatus, double payPrice);

  /**
   * 支付订单
   * @param price
   * @return
   */
//  public Map<String, String> payForOrder(double price,String ordGoodsId,String payType);
}
