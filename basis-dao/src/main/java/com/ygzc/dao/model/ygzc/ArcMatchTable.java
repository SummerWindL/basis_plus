package com.ygzc.dao.model.ygzc;

import java.io.Serializable;

public class ArcMatchTable implements Serializable {
    private Integer id;

    private Integer serial;

    private String brandCn;

    private String brandEn;

    private String model;

    private String pinyin;

    private String code;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    public String getBrandCn() {
        return brandCn;
    }

    public void setBrandCn(String brandCn) {
        this.brandCn = brandCn == null ? null : brandCn.trim();
    }

    public String getBrandEn() {
        return brandEn;
    }

    public void setBrandEn(String brandEn) {
        this.brandEn = brandEn == null ? null : brandEn.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin == null ? null : pinyin.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", serial=").append(serial);
        sb.append(", brandCn=").append(brandCn);
        sb.append(", brandEn=").append(brandEn);
        sb.append(", model=").append(model);
        sb.append(", pinyin=").append(pinyin);
        sb.append(", code=").append(code);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}