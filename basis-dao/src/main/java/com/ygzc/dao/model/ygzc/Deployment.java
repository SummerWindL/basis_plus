package com.ygzc.dao.model.ygzc;

import java.io.Serializable;
import java.util.Date;

public class Deployment implements Serializable {
    /**
     * 布防主表id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String id;

    /**
     * 应用id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String applicationId;

    /**
     * 应用绑定网id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String applicationGatewayId;

    /**
     * 关网唯一id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String uniqId;

    /**
     * 布防名称
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String name;

    /**
     * 0回家布防,1离家布防,3警戒.
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer type;

    /**
     * 布防开启状态,0关闭;1开启
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer state;

    /**
     * user表ID
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
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

    public String getUniqId() {
        return uniqId;
    }

    public void setUniqId(String uniqId) {
        this.uniqId = uniqId == null ? null : uniqId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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
        sb.append(", applicationId=").append(applicationId);
        sb.append(", applicationGatewayId=").append(applicationGatewayId);
        sb.append(", uniqId=").append(uniqId);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", state=").append(state);
        sb.append(", createUser=").append(createUser);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}