package com.ygzc.dao.model.ygzc;

import java.io.Serializable;

public class Nation implements Serializable {
    /**
     * 家国地区id  
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer nationId;

    /**
     * 编号
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String nationCode;

    /**
     * 国家地区名称
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String nationName;

    private static final long serialVersionUID = 1L;

    public Integer getNationId() {
        return nationId;
    }

    public void setNationId(Integer nationId) {
        this.nationId = nationId;
    }

    public String getNationCode() {
        return nationCode;
    }

    public void setNationCode(String nationCode) {
        this.nationCode = nationCode == null ? null : nationCode.trim();
    }

    public String getNationName() {
        return nationName;
    }

    public void setNationName(String nationName) {
        this.nationName = nationName == null ? null : nationName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", nationId=").append(nationId);
        sb.append(", nationCode=").append(nationCode);
        sb.append(", nationName=").append(nationName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}