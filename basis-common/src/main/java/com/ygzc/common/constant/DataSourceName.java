package com.ygzc.common.constant;

public enum DataSourceName {

	/**
	 * 默认数据源
	 */
	DEFAULT("defaultDataSource"),
	
	EXTEND("extendDataSource");
	
	/**
     * 数据源名称<br>
     */
    private String name;

    /**
     * 构造方法<br>
     *
     * @param name 数据源名称
     */
    DataSourceName(String name) {
        this.name = name;
    }

    /**
     * 获取名称的 get 方法 <br>
     *
     * @return String 数据源真实名称
     */
    public String getName() {
        return name;
    }
}
