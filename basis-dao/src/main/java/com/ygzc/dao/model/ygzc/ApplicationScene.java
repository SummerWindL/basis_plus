package com.ygzc.dao.model.ygzc;

import java.io.Serializable;
import java.util.Date;

public class ApplicationScene implements Serializable {
    private String id;

    private String applicationId;

    private String sceneName;

    /**
     * 情景图片
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String scenePicture;

    /**
     * 排序号
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer order;

    private String createUser;

    private Date createDate;

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

    public String getSceneName() {
        return sceneName;
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName == null ? null : sceneName.trim();
    }

    public String getScenePicture() {
        return scenePicture;
    }

    public void setScenePicture(String scenePicture) {
        this.scenePicture = scenePicture == null ? null : scenePicture.trim();
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
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
        sb.append(", id=").append(id);
        sb.append(", applicationId=").append(applicationId);
        sb.append(", sceneName=").append(sceneName);
        sb.append(", scenePicture=").append(scenePicture);
        sb.append(", order=").append(order);
        sb.append(", createUser=").append(createUser);
        sb.append(", createDate=").append(createDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}