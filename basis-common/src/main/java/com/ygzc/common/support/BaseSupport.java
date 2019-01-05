package com.ygzc.common.support;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.UUID;

public abstract class BaseSupport {

	/**
	 * 判断对象是否为nul,或空
	 * 
	 * @param obj 需要进行判断的对象
	 * @return boolean 为null或空返回true，否则返回false
	 */
	public boolean isNull(Object obj) {
		if(null == obj) 
			return true;
		if(obj instanceof List) {
			List<?> list = (List<?>) obj;
			return list.isEmpty() ? true : false;
		}
		if(obj instanceof Map) {
			Map<?,?> map = (Map<?, ?>) obj;
			return map.isEmpty() ? true : false;
		}
		if(obj instanceof Set) {
			Set<?> set = (Set<?>) obj;
			return set.isEmpty() ? true : false;
		}
		if(obj instanceof String) {
			String str = (String) obj;
			return str.isEmpty() ? true : false;
		}
		return false;
	}
	
	/**
	 * 对象转换为String，通常用于获取Map 集合中的对象时使用
	 * 
	 * @param obj 需要转化的对象
 	 * @return String 对象的值（为null则返回""）
	 */
	public String obj2str(Object obj) {
		return null == obj ?"" : obj.toString();
	}
	
	/**
	 * 生成uuid 主键，长度为32位，且为大写模式
	 * 
	 * @return String 32位主键字符串
	 */
	public String getUUID() {
		return UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
	}
	
	/**
	 * 对字符串进行base64 编码
	 * 
	 * @param str 需要进行编码的字符串
	 * @return String 进行编码后的结果字符串
	 */
	public String base64Encoder(String str) {
		if(this.isNull(str)) {
			return null;
		}
		return Base64.getUrlEncoder().encodeToString(str.getBytes(StandardCharsets.UTF_8));
	}
	
	/**
	 * 对字符串进行base64 解码
	 * 
	 * @param str 已进行base64 编码的编码字符串
	 * @return String 解码后的原字符串
	 */
	public String base64Decoder(String str) {
		if(this.isNull(str)) {
			return null;
		}
		return new String(Base64.getUrlDecoder().decode(str), StandardCharsets.UTF_8);
	}
	
	/**
	 * 对字符串进行md5 加密算法
	 * 
	 * @param str 需要进行md5加密的字符串
	 * @return String 加密后的结果
	 */
	public String md5(String str) {
		if(this.isNull(str)) {
			return null;
		}
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(str.getBytes());
			return new BigInteger(1,md.digest()).toString(16).toUpperCase();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 获取系统当前时间
	 * 
	 * @param pattern 获取系统时间的格式,如：yyyy-MM-dd HH:mm:ss
	 * @return String 返回格式化后的当前时间
	 */
	public String currentDate(String pattern) {
		if(this.isNull(pattern)) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(new Date());
	}
	
	/**
	 * 时间戳转换成日期
	 * 
	 * @param timestamp 需要进行转换的时间戳
	 * @param pattern 转换后的格式
	 * @return String 格式化后的日期
	 */
	public String timeStamp2Date(String timestamp,String pattern) {
		if(this.isNull(timestamp) || this.isNull(pattern)) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(new Date(Long.valueOf(timestamp)));
	}
	
	/**
	 * 日期转换为时间戳
	 * 
	 * @param dataStr 需要进行转换的日期字符串
	 * @param pattern 日期的格式
	 * @return String 转换后的时间戳
	 */
	public String data2TimeStamp(String dataStr,String pattern) {
		if(this.isNull(dataStr) || this.isNull(pattern)) {
			return null;
		}
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			return String.valueOf(sdf.parse(dataStr).getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 从指定文件中读取文件内容
	 * 
	 * @param filePath 文件路径（绝对路径）
	 * @return String 读取的文件内容
	 */
	public String readFormFile(String filePath) {
		if(this.isNull(filePath)) {
			return null;
		}
		try {
			StringBuffer stringBuffer = new StringBuffer();
			File file = new File(filePath);//指定要读取的文件
			FileReader reader = new FileReader(file);//获取该文件的输入流
			char[] bb = new char[1024];//用来保存每次读取到的字符
			int n;//每次读取到的字符长度
			while((n = reader.read(bb)) != -1) {
				stringBuffer.append(new String(bb , 0 , n));
			}
			reader.close();//关闭输入流，释放连接
			return stringBuffer.toString(); 
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
     * 从指定文件中读取文件内容<br>
     *
     * @param filePath 文件路径（绝对路径）
     * @return String 读取的文件内容
     */
    public String readFromFile(String filePath) {
        if (this.isNull(filePath))
            return null;
        try {
            StringBuffer stringBuffer = new StringBuffer();
            File file = new File(filePath);// 指定要读取的文件
            FileReader reader = new FileReader(file);// 获取该文件的输入流
            char[] bb = new char[1024];// 用来保存每次读取到的字符
            int n;// 每次读取到的字符长度
            while ((n = reader.read(bb)) != -1) {
                stringBuffer.append(new String(bb, 0, n));
            }
            reader.close();// 关闭输入流，释放连接
            return stringBuffer.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
	
	/**
	 * 将内容写入到指定文件中（写入会覆盖文件原有内容，建议先读取，在写入，将读取的内容与需要写入的内容并在一起进行写入）
	 * 
	 * @param content  需要写入文件中的内容
	 * @param filePath 文件路径（绝对路径）
	 */
	public void writeToFile(String content,String filePath) {
		if(!this.isNull(content) && !this.isNull(filePath)) {
			try {
				generatePath(filePath);
				File file = new File(filePath);//要写入的文本文件
				FileWriter writer = new FileWriter(file);//获取该文件的输出流
				writer.write(content);//写内容
				writer.flush();//清空缓冲区，立即将输入流里的内容写到文件里
				writer.close();//关闭输出流，释放资源
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 生成指定路径文件夹，先进行判断文件夹是否存在啊，若不存在则创建对应目录的文件夹，若存在则不进行任何操作
	 * 
	 * @param path 文件夹路径（绝对路径）
	 */
	public void generatePath(String path) {
		if(!this.isNull(path)) {
			File file = new File(path);
			if(!file.exists() && !file.isDirectory()) {
				file.mkdirs();
			}
		}
	}
	
	/**
	 * 生成指定路径的文件，先进行判断文件是否存在，若不存在啊则进行创建文件，若存在则不进行任何操作
	 * 
	 * @param path 文件路径（绝对路径）
	 */
	public void generateFile(String path) {
		if(!this.isNull(path)) {
			File file = new File(path);
			if(!file.exists()) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * 读取配properties 文件中的值，读取classpath 下/properties/setting.properties 配置文件
	 * 
	 * @param key 资源文件中的key 值
	 * @return String 读取到的key 对应的value 值
	 */
	public String propertiesValue(String key) {
		if(this.isNull(key)) {
			return null;
		}
		try {
			//获取需要读取的properties文件路径
			Properties prop = new Properties();
			InputStream inputStream = this.getClass().getResourceAsStream("/properties/setting.properties");
			prop.load(inputStream);
			return prop.getProperty(key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 读取指定路径properties 文件中的值，会从 classpath 路径下进行查找资源文件
	 * 
	 * @param resource 资源文件路径（对应classpath中的路径）
	 * @param key      资源文件中的key值
	 * @return String  读取到的key 对应的value值
	 */
	public String propertiesValue(String resource,String key) {
		if(this.isNull(resource) || this.isNull(key)) {
			return null;
		}
		try {
			//获取需要读取的properties文件路径
			Properties prop = new Properties();
			InputStream inputStream = this.getClass().getResourceAsStream(resource);
			prop.load(inputStream);
			return prop.getProperty(key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}
