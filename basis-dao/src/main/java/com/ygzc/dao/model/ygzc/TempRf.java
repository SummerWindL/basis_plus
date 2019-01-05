package com.ygzc.dao.model.ygzc;

import java.io.Serializable;

public class TempRf implements Serializable {
    /**
     * rf临时表id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer id;

    private String applicationId;

    private String applicationGatewayId;

    private String applicationNodeId;

    /**
     * 设备序号
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer devNum;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getDevNum() {
        return devNum;
    }

    public void setDevNum(Integer devNum) {
        this.devNum = devNum;
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
        sb.append(", devNum=").append(devNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}