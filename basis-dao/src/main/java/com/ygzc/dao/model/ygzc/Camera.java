package com.ygzc.dao.model.ygzc;

import java.io.Serializable;

public class Camera implements Serializable {
    private String id;

    /**
     * 情景id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String applicationId;

    /**
     * 摄像头账号
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String account;

    private String uuid;

    private String name;

    private String password;

    /**
     * 通道
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String channel;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId == null ? null : applicationId.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", applicationId=").append(applicationId);
        sb.append(", account=").append(account);
        sb.append(", uuid=").append(uuid);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", channel=").append(channel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}