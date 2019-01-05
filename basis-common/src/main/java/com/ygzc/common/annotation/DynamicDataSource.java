package com.ygzc.common.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 动态数据源切换注解（默认切换扩展数据源）
 * @author yanl.fu
 *
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DynamicDataSource {

	/**
	 * 需要切换的数据源名称
	 * 
	 * @return DataSourceName
	 */
	String value() default "extendDataSource";
}
