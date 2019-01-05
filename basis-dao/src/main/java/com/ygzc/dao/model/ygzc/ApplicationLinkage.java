package com.ygzc.dao.model.ygzc;

import java.io.Serializable;
import java.util.Date;

public class ApplicationLinkage implements Serializable {
    /**
     * 应用联动id
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
     * 联动名称
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String linkageName;

    private String linkagePicture;

    private Integer order;

    private Date createDate;

    private String createUser;

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

    public String getLinkageName() {
        return linkageName;
    }

    public void setLinkageName(String linkageName) {
        this.linkageName = linkageName == null ? null : linkageName.trim();
    }

    public String getLinkagePicture() {
        return linkagePicture;
    }

    public void setLinkagePicture(String linkagePicture) {
        this.linkagePicture = linkagePicture == null ? null : linkagePicture.trim();
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", applicationId=").append(applicationId);
        sb.append(", linkageName=").append(linkageName);
        sb.append(", linkagePicture=").append(linkagePicture);
        sb.append(", order=").append(order);
        sb.append(", createDate=").append(createDate);
        sb.append(", createUser=").append(createUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}