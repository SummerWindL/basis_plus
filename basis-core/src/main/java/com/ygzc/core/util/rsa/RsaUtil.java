package com.ygzc.core.util.rsa;

/**
 * @Author: yanl.fu
 * @Description:
 * @Date: Create in 19:11 2017/11/21
 */
public class RsaUtil {

    /**
     *
     * 私钥加密
     *
     * @param str 需要加密的字符串
     * @return
     */
    public static String priEncrypt(String filepath,String str) throws Exception {
        byte[] cipherData = RSAEncrypt.encrypt(RSAEncrypt.loadPrivateKeyByStr(RSAEncrypt.loadPrivateKeyByFile(filepath)),
                str.getBytes());
        String cipher = Base64.encode(cipherData);
        return cipher;
    }

}