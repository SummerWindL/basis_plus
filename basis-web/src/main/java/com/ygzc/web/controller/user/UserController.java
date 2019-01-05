package com.ygzc.web.controller.user;

import com.ygzc.api.user.SysUserService;
import com.ygzc.api.user.UserRoleRelService;
import com.ygzc.api.user.UserService;
import com.ygzc.common.constant.CommonEnums;
import com.ygzc.common.constant.SmsBean;
import com.ygzc.common.model.MsgModel;
import com.ygzc.common.model.PageModel;
import com.ygzc.core.admin.Result;
import com.ygzc.core.controller.BaseController;
import com.ygzc.core.util.StringUtils;
import com.ygzc.core.util.ValidateUtils;
import com.ygzc.core.util.redis.RedisUtils;
import com.ygzc.core.util.rsa.Base64;
import com.ygzc.core.util.rsa.RSAEncrypt;
import com.ygzc.dao.model.user.SysUser;
import com.ygzc.dao.model.user.SysUserExample;
import com.ygzc.dao.model.user.UserRoleRel;
import com.ygzc.dao.model.user.UserRoleRelExample;
import com.ygzc.dao.model.ygzc.User;
import com.ygzc.web.controller.login.LoginControllerBasis;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

/**
 * 名称：UserController<br>
 * <p>
 * 描述：用户管理模块<br>
 *
 * @author yanl<br>
 * 时间：<br>
 * 2017-09-07 15:43:05<br>
 * 版权：<br>
 * Copyright 2017 <a href="" target="_blank"></a>. All rights reserved.
 */
@Controller
@RequestMapping("/common/user")
@Api(value = "/common/user",tags = "用户接口")
public class UserController extends BaseController {

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private UserService userService;
    
    @Autowired
    private UserRoleRelService userRoleRelService;

    @RequestMapping("/manage")
    public String manage() {
        return "common/user/manage";
    }
    
    /**
     * 根据手机号删除用户
     * @param phoneNum
     * @return
     */
    @DeleteMapping("/deleteUser")
    @ResponseBody
    @ApiOperation(value = "/basis-web/common/user/deleteUser",notes ="",httpMethod = "DELETE",response = UserController.class)
    public Result deleteUser(String phoneNum) {
    	Result r = new Result();
    	try {
			if(StringUtils.isBlank(phoneNum)) {
				commonEnums = CommonEnums.PARAMETER_ERROR;//300参数错误
			}else {
				User user = userService.getByMobileNumber(phoneNum);
				if(user==null) {
					commonEnums = CommonEnums.NOT_EXIST_ACCOUNT;//102不存在的账号
				}else {
					userService.deleteUser(phoneNum);//删除用户
					commonEnums = CommonEnums.SUCCESS;//301成功
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			commonEnums = CommonEnums.SYSTEM_ERROR;//302系统错误
		} finally {
			r.setMessage(commonEnums.getLabel());
			r.setStatus(commonEnums.getValue());
		}
    	
    	return r;
    }

    /**
     * update
     * 
     * 更新密码
     * @param phoneNum
     * @param password
     * @param code
     * @return
     */
    @PutMapping("/updatePwd")
    @ResponseBody
    @ApiOperation(value = "/basis-web/common/user/updatePwd", notes = "修改密码方法", httpMethod = "POST", response = UserController.class)
    public Result updatePwd(String phoneNum,String password,String code) {
    	String filepath = UserController.class.getClassLoader().getResource("secretKey").getPath();
    	Result r = new Result();
    	try {
    		User user = userService.getByMobileNumber(phoneNum);
			if(StringUtils.isBlank(phoneNum)||StringUtils.isBlank(password)||StringUtils.isBlank(code)) {
				commonEnums = CommonEnums.PARAMETER_ERROR;//300 参数错误
				
			}else {
				String codestr = RedisUtils.getValue(phoneNum + SmsBean.SMS_TYPE_FIND_PWD); // 获取缓存中的验证码
				if(StringUtils.isBlank(codestr)) {
					commonEnums = CommonEnums.CODE_PAST_DUE;//309 验证码已过期
				}else {
					if(!code.equals(codestr)) {
						commonEnums = CommonEnums.CODE_ERROR;//305 验证码错误
					}else {
						if(password.length()<8) {
							commonEnums = CommonEnums.PWD_LENGTH_NOT_ENOUGH; // 307 密码长度不够
						}else {
							if(!ValidateUtils.isMobile(phoneNum)) {
								commonEnums = CommonEnums.MOBILE_ERROR;//303 手机号码格式不正确
							}else if(user==null){
								commonEnums = CommonEnums.NOT_EXIST_ACCOUNT;//102 不存在的账号
							}else {
								//密码加密，修改密码
								// 私钥加密过程
			    				byte[] cipherData = RSAEncrypt.encrypt(RSAEncrypt.loadPrivateKeyByStr(RSAEncrypt.loadPrivateKeyByFile(filepath)),
			    						password.getBytes());
			    				String cipher = Base64.encode(cipherData);
			    				System.out.println(cipher);
			    				userService.updatePwd(phoneNum, cipher);
			    				commonEnums = CommonEnums.SUCCESS; // 301 成功
							}
						}
					}
				}
			}
    		
		} catch (Exception e) {
			e.printStackTrace();
			commonEnums = CommonEnums.SYSTEM_ERROR;//302 系统错误
		} finally {
			r.setMessage(commonEnums.getLabel());
			r.setStatus(commonEnums.getValue());
		}
    	return r;
    }
    
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public PageModel<SysUser> list(int offset, int limit, String search, String sort, String order) {
        SysUserExample example = new SysUserExample();
        PageModel<SysUser> pageModel = sysUserService.selectByExampleForOffsetPage(example, offset, limit);
        return pageModel;
    }

    /**
     * 用户对应角色保存方法<br>
     *
     * @param userId  用户Id
     * @param roleStr 角色列表字符串
     * @return MsgModel 消息模型
     */
    @RequestMapping(value = "/roleSave", method = RequestMethod.POST)
    @ResponseBody
    public MsgModel roleSave(String userId, String roleStr) {
        List<String> roleIds = Arrays.asList(roleStr.split(","));

        // 先清除历史数据
        UserRoleRelExample example = new UserRoleRelExample();
        example.createCriteria().andUserIdEqualTo(userId);
        userRoleRelService.deleteByExample(example);

        // 添加
        for (String roleId : roleIds) {
            if (!this.isNull(roleId.trim())) {
                UserRoleRel userRoleRel = new UserRoleRel();
                userRoleRel.setRelId(this.getUUID());
                userRoleRel.setUserId(userId);
                userRoleRel.setRoleId(roleId);
                userRoleRelService.insertSelective(userRoleRel);
            }
        }
        return this.resultMsg("保存成功");
    }

    @RequestMapping("/upload")
    @ResponseBody
    public String upload(HttpServletRequest request) {
        List<String> fileNames = this.fileUpLoad(request);
        System.out.println(fileNames);
        return "success";
    }

}
