package com.ygzc.common.spring;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DataSourceContextHolder extends AbstractRoutingDataSource{

	private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

	/**
	 * 抽象方法查找数据源标示
	 */
	@Override
	protected Object determineCurrentLookupKey() {
		return getDataSource();
	}
	
	/**
	 * 设置数据源名称<br>
	 *
	 * @param dataSource 数据源名称
	 */
	public static void setDataSource(String dataSource) {
		contextHolder.set(dataSource);
	}
	
	/**
	 * 获取数据源
	 * @return String 数据源名称
	 */
	public static String getDataSource() {
		return ((String) contextHolder.get());
	}
	
	/**
	 * 清理数据源（恢复默认数据源）
	 */
	public static void clearDataSource() {
		contextHolder.remove();
	}
}
