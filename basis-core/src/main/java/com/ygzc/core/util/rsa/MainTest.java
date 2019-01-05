package com.ygzc.core.util.rsa;

public class MainTest {
	public static void main(String[] args) throws Exception {
		String filepath = MainTest.class.getClassLoader().getResource("secretKey").getPath();

//		RSAEncrypt.genKeyPair(filepath);

		System.out.println("--------------私钥加密公钥解密过程-------------------");
		String plainText = "这是测试数据";
		// 私钥加密过程
		byte[] cipherData = RSAEncrypt.encrypt(RSAEncrypt.loadPrivateKeyByStr(RSAEncrypt.loadPrivateKeyByFile(filepath)),
				plainText.getBytes());
		String cipher = Base64.encode(cipherData);
		// 公钥解密过程
		byte[] res = RSAEncrypt.decrypt(RSAEncrypt.loadPublicKeyByStr(RSAEncrypt.loadPublicKeyByFile(filepath)),
				Base64.decode(cipher));
		String restr = new String(res);
		System.out.println("原文：" + plainText);
		System.out.println("加密：" + cipher);
		System.out.println("解密：" + restr);
		System.out.println();


	}
}
