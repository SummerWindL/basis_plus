package com.ygzc.dao.model.ygzc;

import java.io.Serializable;
import java.util.Date;

public class OtherLogin implements Serializable {
    /**
     * 第三方户用id GUID
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String id;

    private Integer typeLogin;

    private String otherName;

    /**
     * 用户id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String uid;

    private String otherAccount;

    private Integer otherCity;

    private String otherGender;

    private Date createDate;

    private Date updateDate;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getTypeLogin() {
        return typeLogin;
    }

    public void setTypeLogin(Integer typeLogin) {
        this.typeLogin = typeLogin;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName == null ? null : otherName.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getOtherAccount() {
        return otherAccount;
    }

    public void setOtherAccount(String otherAccount) {
        this.otherAccount = otherAccount == null ? null : otherAccount.trim();
    }

    public Integer getOtherCity() {
        return otherCity;
    }

    public void setOtherCity(Integer otherCity) {
        this.otherCity = otherCity;
    }

    public String getOtherGender() {
        return otherGender;
    }

    public void setOtherGender(String otherGender) {
        this.otherGender = otherGender == null ? null : otherGender.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", typeLogin=").append(typeLogin);
        sb.append(", otherName=").append(otherName);
        sb.append(", uid=").append(uid);
        sb.append(", otherAccount=").append(otherAccount);
        sb.append(", otherCity=").append(otherCity);
        sb.append(", otherGender=").append(otherGender);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}