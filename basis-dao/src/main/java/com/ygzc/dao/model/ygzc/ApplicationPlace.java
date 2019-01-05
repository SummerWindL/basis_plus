package com.ygzc.dao.model.ygzc;

import java.io.Serializable;
import java.util.Date;

public class ApplicationPlace implements Serializable {
    /**
     * 应用区域 id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String id;

    private String applicationId;

    /**
     * 位置父id,0代表顶级目录
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String fatherId;

    /**
     * 区域名称
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String placeName;

    /**
     * 别级
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer grade;

    /**
     *  排序号
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer order;

    /**
     * 备注
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String remark;

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

    public String getFatherId() {
        return fatherId;
    }

    public void setFatherId(String fatherId) {
        this.fatherId = fatherId == null ? null : fatherId.trim();
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName == null ? null : placeName.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
        sb.append(", fatherId=").append(fatherId);
        sb.append(", placeName=").append(placeName);
        sb.append(", grade=").append(grade);
        sb.append(", order=").append(order);
        sb.append(", remark=").append(remark);
        sb.append(", createUser=").append(createUser);
        sb.append(", createDate=").append(createDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}