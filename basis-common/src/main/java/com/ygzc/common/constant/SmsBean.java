package com.ygzc.common.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yanl.fu
 *
 */
public class SmsBean {


    public static final String SMS_TYPE_REGISTER = "1"; // 注册

    public static final  String SMS_TYPE_FIND_PWD = "2"; // 找回密码

    public static final String SMS_TYPE_LOGIN = "3"; // 登录

    public static final String SMS_KEY = "YGZC_SMS_CHUSHENDUOJIN"; // 需要给安卓、ios的key

    public static String contentTem = "你的验证码是：@。如非本人操作，请忽略本短信。该验证码将在10分钟后失效。"; //; 模板内容


    private static final String userid = "451";
    private static final String account = "wyHY";
    private static final String password = "123456";
    public static final String strUrl = "http://119.23.249.213:8888/sms.aspx";
    
    public static final String uid ="ygzc1666";//用户名
    public static final String key ="d41d8cd98f00b204e980";//接口密钥

    public static Map<String, Object> getSmsMap(String mobile,String content) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("action", "send");
        map.put("userid", userid);
        map.put("account", account);
        map.put("password", password);
        map.put("mobile", mobile);
        map.put("content",content);
        map.put("sendTime", "");
        map.put("extno", "");
        return map;
    }

}