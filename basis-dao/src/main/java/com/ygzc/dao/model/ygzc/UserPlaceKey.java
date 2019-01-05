package com.ygzc.dao.model.ygzc;

import java.io.Serializable;

public class UserPlaceKey implements Serializable {
    private String uid;

    private String applicationPlaceId;

    private static final long serialVersionUID = 1L;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getApplicationPlaceId() {
        return applicationPlaceId;
    }

    public void setApplicationPlaceId(String applicationPlaceId) {
        this.applicationPlaceId = applicationPlaceId == null ? null : applicationPlaceId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", applicationPlaceId=").append(applicationPlaceId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}