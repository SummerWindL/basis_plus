package com.ygzc.dao.model.ygzc;

import java.io.Serializable;

public class Provinces implements Serializable {
    /**
     * 省id 
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer provincesId;

    /**
     * 国家id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer nationId;

    private String provincesCode;

    private String provincesName;

    /**
     * 字母匹配
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String chara;

    private static final long serialVersionUID = 1L;

    public Integer getProvincesId() {
        return provincesId;
    }

    public void setProvincesId(Integer provincesId) {
        this.provincesId = provincesId;
    }

    public Integer getNationId() {
        return nationId;
    }

    public void setNationId(Integer nationId) {
        this.nationId = nationId;
    }

    public String getProvincesCode() {
        return provincesCode;
    }

    public void setProvincesCode(String provincesCode) {
        this.provincesCode = provincesCode == null ? null : provincesCode.trim();
    }

    public String getProvincesName() {
        return provincesName;
    }

    public void setProvincesName(String provincesName) {
        this.provincesName = provincesName == null ? null : provincesName.trim();
    }

    public String getChara() {
        return chara;
    }

    public void setChara(String chara) {
        this.chara = chara == null ? null : chara.trim();
    }

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