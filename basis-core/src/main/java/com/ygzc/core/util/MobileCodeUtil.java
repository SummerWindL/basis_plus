package com.ygzc.core.util;

import com.ygzc.core.util.ehcache.EhCacheUtils;

/**
 *
 * 手机验证码缓存工具类
 * yanl.fu
 *
 */
public class MobileCodeUtil {
    public static final String UPLOAD_CONFIG_CACHE_NAME = "mobileCode";// uploadConfig缓存对象名


    public static boolean putEcache(String phoneNum,String code){
        EhCacheUtils.putInCache(UPLOAD_CONFIG_CACHE_NAME,phoneNum, code);
        return false;

    }

    public static String getCode(String phoneNum){

        String code = (String) EhCacheUtils.getFromCache(UPLOAD_CONFIG_CACHE_NAME,phoneNum);
        if(code==null||code.equals("")){
            return null;
        }
        return code;

    }

    public static void delCode(String phoneNum){


        EhCacheUtils.delInCache(UPLOAD_CONFIG_CACHE_NAME,phoneNum);
    }
}