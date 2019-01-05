package com.ygzc.dao.model.ygzc;

import java.io.Serializable;
import java.util.Date;

public class ApplicationGateway implements Serializable {
    /**
     * 应用网关id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String id;

    /**
     * 用户id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String uid;

    /**
     * 设备初始化（intelligent_hardware）id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String hardGatewayId;

    /**
     * 二维码
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String uniqId;

    /**
     * 网关名称
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String gatewayName;

    /**
     * 在线标准 0 不在线  1  在线
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer online;

    /**
     * 应用id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String applicationId;

    /**
     * 0代表未分区
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String applicationPlaceId;

    private Date createDate;

    private String createUser;

    private Date updateDate;

    private String updateUser;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getHardGatewayId() {
        return hardGatewayId;
    }

    public void setHardGatewayId(String hardGatewayId) {
        this.hardGatewayId = hardGatewayId == null ? null : hardGatewayId.trim();
    }

    public String getUniqId() {
        return uniqId;
    }

    public void setUniqId(String uniqId) {
        this.uniqId = uniqId == null ? null : uniqId.trim();
    }

    public String getGatewayName() {
        return gatewayName;
    }

    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName == null ? null : gatewayName.trim();
    }

    public Integer getOnline() {
        return online;
    }

    public void setOnline(Integer online) {
        this.online = online;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId == null ? null : applicationId.trim();
    }

    public String getApplicationPlaceId() {
        return applicationPlaceId;
    }

    public void setApplicationPlaceId(String applicationPlaceId) {
        this.applicationPlaceId = applicationPlaceId == null ? null : applicationPlaceId.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uid=").append(uid);
        sb.append(", hardGatewayId=").append(hardGatewayId);
        sb.append(", uniqId=").append(uniqId);
        sb.append(", gatewayName=").append(gatewayName);
        sb.append(", online=").append(online);
        sb.append(", applicationId=").append(applicationId);
        sb.append(", applicationPlaceId=").append(applicationPlaceId);
        sb.append(", createDate=").append(createDate);
        sb.append(", createUser=").append(createUser);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}