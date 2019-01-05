package com.ygzc.dao.model.ygzc;

import java.io.Serializable;
import java.util.Date;

public class UserTerminalGrade implements Serializable {
    /**
     * 用户权限表id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String id;

    /**
     * 应用id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String applicationId;

    /**
     * 0无网关应用
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String applicationGatewayId;

    /**
     * 节点id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String applicationNodeId;

    private String applicationTerminalId;

    private String applicationPlaceId;

    /**
     * 用户id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String uid;

    /**
     * 权限级别
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer level;

    /**
     * 是否超级用户
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer isAdmin;

    /**
     * 是否限时0不限时
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer limitTime;

    private Date begin;

    private Date end;

    private String createUser;

    private String createDate;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId == null ? null : applicationId.trim();
    }

    public String getApplicationGatewayId() {
        return applicationGatewayId;
    }

    public void setApplicationGatewayId(String applicationGatewayId) {
        this.applicationGatewayId = applicationGatewayId == null ? null : applicationGatewayId.trim();
    }

    public String getApplicationNodeId() {
        return applicationNodeId;
    }

    public void setApplicationNodeId(String applicationNodeId) {
        this.applicationNodeId = applicationNodeId == null ? null : applicationNodeId.trim();
    }

    public String getApplicationTerminalId() {
        return applicationTerminalId;
    }

    public void setApplicationTerminalId(String applicationTerminalId) {
        this.applicationTerminalId = applicationTerminalId == null ? null : applicationTerminalId.trim();
    }

    public String getApplicationPlaceId() {
        return applicationPlaceId;
    }

    public void setApplicationPlaceId(String applicationPlaceId) {
        this.applicationPlaceId = applicationPlaceId == null ? null : applicationPlaceId.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Integer isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Integer getLimitTime() {
        return limitTime;
    }

    public void setLimitTime(Integer limitTime) {
        this.limitTime = limitTime;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", applicationId=").append(applicationId);
        sb.append(", applicationGatewayId=").append(applicationGatewayId);
        sb.append(", applicationNodeId=").append(applicationNodeId);
        sb.append(", applicationTerminalId=").append(applicationTerminalId);
        sb.append(", applicationPlaceId=").append(applicationPlaceId);
        sb.append(", uid=").append(uid);
        sb.append(", level=").append(level);
        sb.append(", isAdmin=").append(isAdmin);
        sb.append(", limitTime=").append(limitTime);
        sb.append(", begin=").append(begin);
        sb.append(", end=").append(end);
        sb.append(", createUser=").append(createUser);
        sb.append(", createDate=").append(createDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}