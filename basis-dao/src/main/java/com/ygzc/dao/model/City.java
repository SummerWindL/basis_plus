package com.ygzc.dao.model;

import java.io.Serializable;

public class City implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.city_id
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    /**
     * 城市id
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    private Integer cityId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.nation_id
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    private Integer nationId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.provinces_id
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    private Integer provincesId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.city_code
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    private String cityCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.city_name
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    private String cityName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table city
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.city_id
     *
     * @return the value of city.city_id
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.city_id
     *
     * @param cityId the value for city.city_id
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.nation_id
     *
     * @return the value of city.nation_id
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public Integer getNationId() {
        return nationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.nation_id
     *
     * @param nationId the value for city.nation_id
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public void setNationId(Integer nationId) {
        this.nationId = nationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.provinces_id
     *
     * @return the value of city.provinces_id
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public Integer getProvincesId() {
        return provincesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.provinces_id
     *
     * @param provincesId the value for city.provinces_id
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public void setProvincesId(Integer provincesId) {
        this.provincesId = provincesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.city_code
     *
     * @return the value of city.city_code
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.city_code
     *
     * @param cityCode the value for city.city_code
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.city_name
     *
     * @return the value of city.city_name
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.city_name
     *
     * @param cityName the value for city.city_name
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cityId=").append(cityId);
        sb.append(", nationId=").append(nationId);
        sb.append(", provincesId=").append(provincesId);
        sb.append(", cityCode=").append(cityCode);
        sb.append(", cityName=").append(cityName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}