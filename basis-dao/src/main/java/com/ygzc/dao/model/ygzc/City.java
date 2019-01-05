package com.ygzc.dao.model.ygzc;

import java.io.Serializable;

public class City implements Serializable {
    /**
     * 主键
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer cityId;

    /**
     * 编码
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String key;

    /**
     * 城市名称
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String cityName;

    /**
     * 邮编
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String zipCode;

    /**
     * 省id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer provinceId;

    private static final long serialVersionUID = 1L;

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cityId=").append(cityId);
        sb.append(", key=").append(key);
        sb.append(", cityName=").append(cityName);
        sb.append(", zipCode=").append(zipCode);
        sb.append(", provinceId=").append(provinceId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}