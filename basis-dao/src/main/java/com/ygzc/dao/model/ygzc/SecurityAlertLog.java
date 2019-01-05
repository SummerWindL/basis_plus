package com.ygzc.dao.model.ygzc;

import java.io.Serializable;
import java.util.Date;

public class SecurityAlertLog implements Serializable {
    /**
     * 安防设备报警日志表
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Long id;

    private String applicationId;

    private String applicationGatewayId;

    private String applicationNodeId;

    private String applicationTerminalId;

    private Integer status;

    private Date createDate;

    /**
     * 报警说明
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getApplicationTerminalId() {
        return applicationTerminalId;
    }

    public void setApplicationTerminalId(String applicationTerminalId) {
        this.applicationTerminalId = applicationTerminalId == null ? null : applicationTerminalId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
        sb.append(", status=").append(status);
        sb.append(", createDate=").append(createDate);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}