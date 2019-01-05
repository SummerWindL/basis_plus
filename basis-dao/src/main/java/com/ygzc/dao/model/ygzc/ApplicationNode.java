package com.ygzc.dao.model.ygzc;

import java.io.Serializable;
import java.util.Date;

public class ApplicationNode implements Serializable {
    /**
     * 设备终端id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String id;

    private String uniqId;

    /**
     * 节点对应intelligent_hardware的id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String hardNodeId;

    private String applicationId;

    /**
     * 0代表没有网关,直接连接服务器
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String applicationGatewayId;

    /**
     * 设备类型id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer typeId;

    /**
     * 设备系列id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer seriesId;

    /**
     * 最大连接数
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer maxNum;

    /**
     * 终端名字
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String nodeName;

    /**
     * 保留字段
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer isFlag;

    private String applicationPlaceId;

    private String createUser;

    private Date createDate;

    private String updateUser;

    private Date updateDate;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUniqId() {
        return uniqId;
    }

    public void setUniqId(String uniqId) {
        this.uniqId = uniqId == null ? null : uniqId.trim();
    }

    public String getHardNodeId() {
        return hardNodeId;
    }

    public void setHardNodeId(String hardNodeId) {
        this.hardNodeId = hardNodeId == null ? null : hardNodeId.trim();
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

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
    }

    public Integer getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName == null ? null : nodeName.trim();
    }

    public Integer getIsFlag() {
        return isFlag;
    }

    public void setIsFlag(Integer isFlag) {
        this.isFlag = isFlag;
    }

    public String getApplicationPlaceId() {
        return applicationPlaceId;
    }

    public void setApplicationPlaceId(String applicationPlaceId) {
        this.applicationPlaceId = applicationPlaceId == null ? null : applicationPlaceId.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
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
        sb.append(", uniqId=").append(uniqId);
        sb.append(", hardNodeId=").append(hardNodeId);
        sb.append(", applicationId=").append(applicationId);
        sb.append(", applicationGatewayId=").append(applicationGatewayId);
        sb.append(", typeId=").append(typeId);
        sb.append(", seriesId=").append(seriesId);
        sb.append(", maxNum=").append(maxNum);
        sb.append(", nodeName=").append(nodeName);
        sb.append(", isFlag=").append(isFlag);
        sb.append(", applicationPlaceId=").append(applicationPlaceId);
        sb.append(", createUser=").append(createUser);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}