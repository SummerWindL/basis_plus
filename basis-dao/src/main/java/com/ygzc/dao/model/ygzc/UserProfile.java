package com.ygzc.dao.model.ygzc;

import java.io.Serializable;
import java.util.Date;

public class UserProfile implements Serializable {
    /**
     * 用户介绍
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String pid;

    /**
     * 用户id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String uid;

    /**
     * 全名
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String fullName;

    private Date birthday;

    /**
     * 教育程度
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String education;

    /**
     * 职业
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String vocation;

    /**
     * 经度
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Float longitude;

    /**
     * 维度
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Float latitude;

    /**
     * 份身认证类型
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String identityType;

    /**
     * 身份证号码
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String identityCode;

    /**
     * 身份证照片正面 外键
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String identityImageFront;

    private String identityImgFrontUrl;

    /**
     * 身份证背面 外键
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String identityImageBack;

    private String identityImgBackUrl;

    /**
     * 审批状态
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer checkState;

    /**
     * 个人介绍
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String introduction;

    private Date createDate;

    private Date updateDate;

    private static final long serialVersionUID = 1L;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getVocation() {
        return vocation;
    }

    public void setVocation(String vocation) {
        this.vocation = vocation == null ? null : vocation.trim();
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public String getIdentityType() {
        return identityType;
    }

    public void setIdentityType(String identityType) {
        this.identityType = identityType == null ? null : identityType.trim();
    }

    public String getIdentityCode() {
        return identityCode;
    }

    public void setIdentityCode(String identityCode) {
        this.identityCode = identityCode == null ? null : identityCode.trim();
    }

    public String getIdentityImageFront() {
        return identityImageFront;
    }

    public void setIdentityImageFront(String identityImageFront) {
        this.identityImageFront = identityImageFront == null ? null : identityImageFront.trim();
    }

    public String getIdentityImgFrontUrl() {
        return identityImgFrontUrl;
    }

    public void setIdentityImgFrontUrl(String identityImgFrontUrl) {
        this.identityImgFrontUrl = identityImgFrontUrl == null ? null : identityImgFrontUrl.trim();
    }

    public String getIdentityImageBack() {
        return identityImageBack;
    }

    public void setIdentityImageBack(String identityImageBack) {
        this.identityImageBack = identityImageBack == null ? null : identityImageBack.trim();
    }

    public String getIdentityImgBackUrl() {
        return identityImgBackUrl;
    }

    public void setIdentityImgBackUrl(String identityImgBackUrl) {
        this.identityImgBackUrl = identityImgBackUrl == null ? null : identityImgBackUrl.trim();
    }

    public Integer getCheckState() {
        return checkState;
    }

    public void setCheckState(Integer checkState) {
        this.checkState = checkState;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
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
        sb.append(", pid=").append(pid);
        sb.append(", uid=").append(uid);
        sb.append(", fullName=").append(fullName);
        sb.append(", birthday=").append(birthday);
        sb.append(", education=").append(education);
        sb.append(", vocation=").append(vocation);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", identityType=").append(identityType);
        sb.append(", identityCode=").append(identityCode);
        sb.append(", identityImageFront=").append(identityImageFront);
        sb.append(", identityImgFrontUrl=").append(identityImgFrontUrl);
        sb.append(", identityImageBack=").append(identityImageBack);
        sb.append(", identityImgBackUrl=").append(identityImgBackUrl);
        sb.append(", checkState=").append(checkState);
        sb.append(", introduction=").append(introduction);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}