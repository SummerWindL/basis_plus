package com.ygzc.dao.model;

import java.io.Serializable;

public class Provinces implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column provinces.provinces_id
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    /**
     * 省id 
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    private Integer provincesId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column provinces.nation_id
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    /**
     * 国家id
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    private Integer nationId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column provinces.provinces_code
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    private String provincesCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column provinces.provinces_name
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    private String provincesName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column provinces.chara
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    /**
     * 字母匹配
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    private String chara;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table provinces
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column provinces.provinces_id
     *
     * @return the value of provinces.provinces_id
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public Integer getProvincesId() {
        return provincesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column provinces.provinces_id
     *
     * @param provincesId the value for provinces.provinces_id
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public void setProvincesId(Integer provincesId) {
        this.provincesId = provincesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column provinces.nation_id
     *
     * @return the value of provinces.nation_id
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public Integer getNationId() {
        return nationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column provinces.nation_id
     *
     * @param nationId the value for provinces.nation_id
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public void setNationId(Integer nationId) {
        this.nationId = nationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column provinces.provinces_code
     *
     * @return the value of provinces.provinces_code
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public String getProvincesCode() {
        return provincesCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column provinces.provinces_code
     *
     * @param provincesCode the value for provinces.provinces_code
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public void setProvincesCode(String provincesCode) {
        this.provincesCode = provincesCode == null ? null : provincesCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column provinces.provinces_name
     *
     * @return the value of provinces.provinces_name
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public String getProvincesName() {
        return provincesName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column provinces.provinces_name
     *
     * @param provincesName the value for provinces.provinces_name
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public void setProvincesName(String provincesName) {
        this.provincesName = provincesName == null ? null : provincesName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column provinces.chara
     *
     * @return the value of provinces.chara
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public String getChara() {
        return chara;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column provinces.chara
     *
     * @param chara the value for provinces.chara
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public void setChara(String chara) {
        this.chara = chara == null ? null : chara.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table provinces
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", provincesId=").append(provincesId);
        sb.append(", nationId=").append(nationId);
        sb.append(", provincesCode=").append(provincesCode);
        sb.append(", provincesName=").append(provincesName);
        sb.append(", chara=").append(chara);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}