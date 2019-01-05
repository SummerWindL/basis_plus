package com.ygzc.dao.model.ygzc;

import java.io.Serializable;

public class UserGatewayKey implements Serializable {
    private String uid;

    private String applicationId;

    private String applicationGatewayId;

    private static final long serialVersionUID = 1L;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", applicationId=").append(applicationId);
        sb.append(", applicationGatewayId=").append(applicationGatewayId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}