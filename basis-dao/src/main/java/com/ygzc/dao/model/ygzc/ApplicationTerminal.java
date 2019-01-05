package com.ygzc.dao.model.ygzc;

import java.io.Serializable;
import java.util.Date;

public class ApplicationTerminal implements Serializable {
    private String id;

    /**
     * application_terminal的外键
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String applicationNodeId;

    /**
     * application表id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String applicationId;

    /**
     * 对应网关
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String applicationGatewayId;

    /**
     * 终端编号
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer no;

    /**
     * 终端编号
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String terminalName;

    private String onPicture;

    private String offPicture;

    /**
     * 0未分区域
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String applicationPlaceId;

    /**
     * 0初始状态、1关闭、2开启
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer state;

    /**
     * 百分比(调光灯)
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer percent;

    private String rgb;

    /**
     * 异常状态
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer isFlag;

    /**
     * 用户id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String uid;

    /**
     * 所有排序号
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer allOrder;

    /**
     * 区域排序号
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer placeOrder;

    /**
     * 用户id
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

    public String getApplicationNodeId() {
        return applicationNodeId;
    }

    public void setApplicationNodeId(String applicationNodeId) {
        this.applicationNodeId = applicationNodeId == null ? null : applicationNodeId.trim();
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

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getTerminalName() {
        return terminalName;
    }

    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName == null ? null : terminalName.trim();
    }

    public String getOnPicture() {
        return onPicture;
    }

    public void setOnPicture(String onPicture) {
        this.onPicture = onPicture == null ? null : onPicture.trim();
    }

    public String getOffPicture() {
        return offPicture;
    }

    public void setOffPicture(String offPicture) {
        this.offPicture = offPicture == null ? null : offPicture.trim();
    }

    public String getApplicationPlaceId() {
        return applicationPlaceId;
    }

    public void setApplicationPlaceId(String applicationPlaceId) {
        this.applicationPlaceId = applicationPlaceId == null ? null : applicationPlaceId.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    public String getRgb() {
        return rgb;
    }

    public void setRgb(String rgb) {
        this.rgb = rgb == null ? null : rgb.trim();
    }

    public Integer getIsFlag() {
        return isFlag;
    }

    public void setIsFlag(Integer isFlag) {
        this.isFlag = isFlag;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public Integer getAllOrder() {
        return allOrder;
    }

    public void setAllOrder(Integer allOrder) {
        this.allOrder = allOrder;
    }

    public Integer getPlaceOrder() {
        return placeOrder;
    }

    public void setPlaceOrder(Integer placeOrder) {
        this.placeOrder = placeOrder;
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
        sb.append(", applicationNodeId=").append(applicationNodeId);
        sb.append(", applicationId=").append(applicationId);
        sb.append(", applicationGatewayId=").append(applicationGatewayId);
        sb.append(", no=").append(no);
        sb.append(", terminalName=").append(terminalName);
        sb.append(", onPicture=").append(onPicture);
        sb.append(", offPicture=").append(offPicture);
        sb.append(", applicationPlaceId=").append(applicationPlaceId);
        sb.append(", state=").append(state);
        sb.append(", percent=").append(percent);
        sb.append(", rgb=").append(rgb);
        sb.append(", isFlag=").append(isFlag);
        sb.append(", uid=").append(uid);
        sb.append(", allOrder=").append(allOrder);
        sb.append(", placeOrder=").append(placeOrder);
        sb.append(", createUser=").append(createUser);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}