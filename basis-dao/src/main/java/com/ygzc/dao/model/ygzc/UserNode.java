package com.ygzc.dao.model.ygzc;

import java.io.Serializable;
import java.util.Date;

public class UserNode extends UserNodeKey implements Serializable {
    private String applicationId;

    private String applicationGatewayId;

    /**
     * 0未分区
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String applicationPlaceId;

    private String createUser;

    private Date createDate;

    private static final long serialVersionUID = 1L;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", applicationId=").append(applicationId);
        sb.append(", applicationGatewayId=").append(applicationGatewayId);
        sb.append(", applicationPlaceId=").append(applicationPlaceId);
        sb.append(", createUser=").append(createUser);
        sb.append(", createDate=").append(createDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}