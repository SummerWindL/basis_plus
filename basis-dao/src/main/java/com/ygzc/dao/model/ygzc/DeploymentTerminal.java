package com.ygzc.dao.model.ygzc;

import java.io.Serializable;
import java.util.Date;

public class DeploymentTerminal implements Serializable {
    /**
     * 布防终端id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String id;

    private String applicationTerminalId;

    private String applicationId;

    private String applicationGatewayId;

    private String deploymentId;

    /**
     * 备注
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer flag;

    /**
     * 备注
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String remark;

    /**
     * 发生日期
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Date createDate;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getApplicationTerminalId() {
        return applicationTerminalId;
    }

    public void setApplicationTerminalId(String applicationTerminalId) {
        this.applicationTerminalId = applicationTerminalId == null ? null : applicationTerminalId.trim();
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

    public String getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId == null ? null : deploymentId.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", applicationTerminalId=").append(applicationTerminalId);
        sb.append(", applicationId=").append(applicationId);
        sb.append(", applicationGatewayId=").append(applicationGatewayId);
        sb.append(", deploymentId=").append(deploymentId);
        sb.append(", flag=").append(flag);
        sb.append(", remark=").append(remark);
        sb.append(", createDate=").append(createDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}