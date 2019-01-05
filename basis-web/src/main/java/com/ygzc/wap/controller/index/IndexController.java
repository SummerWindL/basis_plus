package com.ygzc.wap.controller.index;

import java.util.List;
import java.util.Map;

import org.apache.shiro.web.session.HttpServletSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ygzc.api.persistence.DelegateService;
import com.ygzc.common.constant.CommonEnums;
import com.ygzc.core.admin.Result;
import com.ygzc.core.controller.BaseController;
import com.ygzc.dao.model.ygzc.ApplicationScene;
import com.ygzc.dao.model.ygzc.User;

/**
 * 首页接口控制器
 * @author yanl.fu
 *
 */
@Controller
@RequestMapping("/wap/index")
public class IndexController extends BaseController{

	@Autowired
	private DelegateService delegateService;
	
	/**
	 * 首页-情景展示
	 * user_application 关联 application_scene application_id
	 * @param phoneNum
	 * @return
	 */
	@GetMapping("/aScenesList")
	@ResponseBody
	public Result showScenes(String phoneNum,HttpServletSession session) {
		Result r = new Result();
		User user = (User) session.getAttribute("user");//获取当前登录用户
		/**
		 * app端从token获取当前登录用户
		 */
		User loginUser = delegateService.selectOne("com.ygzc.dao.mapper.ygzc.UserTokensMapper.getLoginUser");
		try {
//			if(StringUtils.isBlank(phoneNum)) {
//				commonEnums = CommonEnums.PARAMETER_ERROR;//300 参数错误
//			}else {
//				if(ValidateUtils.isMobile(phoneNum)) {
//					commonEnums = CommonEnums.MOBILE_ERROR;//303手机格式不正确
//				}else {
					List<ApplicationScene> asList = delegateService.selectList("com.ygzc.dao.mapper.ygzc.ApplicationSceneMapper."
							+ "getApplicationSceneList",phoneNum);
					
					commonEnums = CommonEnums.SUCCESS;//301成功
//					r.setData(asList);
//				}
//			}
			
		} catch (Exception e) {
			e.printStackTrace();
			commonEnums = CommonEnums.SYSTEM_ERROR;//302 系统错误
		} finally {
			r.setStatus(commonEnums.getValue());
			r.setMessage(commonEnums.getLabel());
		}
		return r;
	}
}
