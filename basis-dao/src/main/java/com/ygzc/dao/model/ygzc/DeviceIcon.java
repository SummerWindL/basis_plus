package com.ygzc.dao.model.ygzc;

import java.io.Serializable;
import java.util.Date;

public class DeviceIcon implements Serializable {
    private Integer id;

    private String deviceName;

    private String pictureName;

    private String url1;

    private String url2;

    private Integer height;

    private Integer width;

    private Integer ext;

    private Date created;

    private Integer state;

    private Integer security;

    private Integer common;

    private String securityMsg;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName == null ? null : pictureName.trim();
    }

    public String getUrl1() {
        return url1;
    }

    public void setUrl1(String url1) {
        this.url1 = url1 == null ? null : url1.trim();
    }

    public String getUrl2() {
        return url2;
    }

    public void setUrl2(String url2) {
        this.url2 = url2 == null ? null : url2.trim();
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getExt() {
        return ext;
    }

    public void setExt(Integer ext) {
        this.ext = ext;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getSecurity() {
        return security;
    }

    public void setSecurity(Integer security) {
        this.security = security;
    }

    public Integer getCommon() {
        return common;
    }

    public void setCommon(Integer common) {
        this.common = common;
    }

    public String getSecurityMsg() {
        return securityMsg;
    }

    public void setSecurityMsg(String securityMsg) {
        this.securityMsg = securityMsg == null ? null : securityMsg.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", deviceName=").append(deviceName);
        sb.append(", pictureName=").append(pictureName);
        sb.append(", url1=").append(url1);
        sb.append(", url2=").append(url2);
        sb.append(", height=").append(height);
        sb.append(", width=").append(width);
        sb.append(", ext=").append(ext);
        sb.append(", created=").append(created);
        sb.append(", state=").append(state);
        sb.append(", security=").append(security);
        sb.append(", common=").append(common);
        sb.append(", securityMsg=").append(securityMsg);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}