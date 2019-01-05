package com.ygzc.dao.model.ygzc;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     * 户用id GUID
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String uid;

    /**
     * 家国代码
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String regionCode;

    /**
     * 话号码电
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String phoneNum;

    /**
     * 箱邮
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String email;

    /**
     * 性别
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String gender;

    /**
     * 邀请码
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String idCode;

    /**
     * 被邀请码
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String inviteCode;

    /**
     * 积分
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer point;

    /**
     * 昵称
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String nickName;

    private String ip;

    private Integer cityId;

    private String deviceId;

    private String deviceIos;

    /**
     * 头像
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String avatar;

    private String password;

    private String url;

    private String company;

    private String location;

    private String info;

    private String weibo;

    private String weixin;

    private String qq;

    /**
     * 否在线
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer isActive;

    /**
     * 密钥
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String rands;

    /**
     * 第三方登陆
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer otherFlag;

    private Date createDate;

    private Date updateDate;

    private static final long serialVersionUID = 1L;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode == null ? null : regionCode.trim();
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode == null ? null : idCode.trim();
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode == null ? null : inviteCode.trim();
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    public String getDeviceIos() {
        return deviceIos;
    }

    public void setDeviceIos(String deviceIos) {
        this.deviceIos = deviceIos == null ? null : deviceIos.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public String getWeibo() {
        return weibo;
    }

    public void setWeibo(String weibo) {
        this.weibo = weibo == null ? null : weibo.trim();
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public String getRands() {
        return rands;
    }

    public void setRands(String rands) {
        this.rands = rands == null ? null : rands.trim();
    }

    public Integer getOtherFlag() {
        return otherFlag;
    }

    public void setOtherFlag(Integer otherFlag) {
        this.otherFlag = otherFlag;
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
        sb.append(", uid=").append(uid);
        sb.append(", regionCode=").append(regionCode);
        sb.append(", phoneNum=").append(phoneNum);
        sb.append(", email=").append(email);
        sb.append(", gender=").append(gender);
        sb.append(", idCode=").append(idCode);
        sb.append(", inviteCode=").append(inviteCode);
        sb.append(", point=").append(point);
        sb.append(", nickName=").append(nickName);
        sb.append(", ip=").append(ip);
        sb.append(", cityId=").append(cityId);
        sb.append(", deviceId=").append(deviceId);
        sb.append(", deviceIos=").append(deviceIos);
        sb.append(", avatar=").append(avatar);
        sb.append(", password=").append(password);
        sb.append(", url=").append(url);
        sb.append(", company=").append(company);
        sb.append(", location=").append(location);
        sb.append(", info=").append(info);
        sb.append(", weibo=").append(weibo);
        sb.append(", weixin=").append(weixin);
        sb.append(", qq=").append(qq);
        sb.append(", isActive=").append(isActive);
        sb.append(", rands=").append(rands);
        sb.append(", otherFlag=").append(otherFlag);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}