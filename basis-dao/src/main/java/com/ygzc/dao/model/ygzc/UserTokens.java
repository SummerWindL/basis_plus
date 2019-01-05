package com.ygzc.dao.model.ygzc;

import java.io.Serializable;
import java.util.Date;

public class UserTokens implements Serializable {
    /**
     * 用户id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String uid;

    private String token;

    private Date expiretime;

    private static final long serialVersionUID = 1L;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public Date getExpiretime() {
        return expiretime;
    }

    public void setExpiretime(Date expiretime) {
        this.expiretime = expiretime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", token=").append(token);
        sb.append(", expiretime=").append(expiretime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}