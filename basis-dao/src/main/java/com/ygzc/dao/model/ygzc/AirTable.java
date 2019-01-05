package com.ygzc.dao.model.ygzc;

import java.io.Serializable;

public class AirTable implements Serializable {
    private Integer id;

    /**
     * 序号
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer serial;

    /**
     * 中文品牌
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String brandCn;

    /**
     * 英文品牌
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String brandEn;

    /**
     * 型号
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String model;

    /**
     * 拼音
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String pinyin;

    /**
     * 码库
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
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