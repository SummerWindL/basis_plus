package com.ygzc.dao.model.ygzc;

import java.io.Serializable;

public class UserNodeKey implements Serializable {
    private String uid;

    private String applicationNodeId;

    private static final long serialVersionUID = 1L;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getApplicationNodeId() {
        return applicationNodeId;
    }

    public void setApplicationNodeId(String applicationNodeId) {
        this.applicationNodeId = applicationNodeId == null ? null : applicationNodeId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", applicationNodeId=").append(applicationNodeId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}