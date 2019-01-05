package com.ygzc.dao.model.ygzc;

import java.io.Serializable;
import java.util.Date;

public class LinkageTerminal implements Serializable {
    /**
     * 联动终端id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String id;

    private String applicationLinkageId;

    /**
     * 0网关节点  1 WIFI节点
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer category;

    private String gatewayUniqId;

    private String applicationTerminalId;

    private String nodeUniqId;

    private Integer no;

    /**
     * 预设命令
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String command;

    private Integer state;

    /**
     * 延时用秒计算
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer delayed;

    private String executeTime;

    private Date updateDate;

    private String createUser;

    private Date createDate;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getApplicationLinkageId() {
        return applicationLinkageId;
    }

    public void setApplicationLinkageId(String applicationLinkageId) {
        this.applicationLinkageId = applicationLinkageId == null ? null : applicationLinkageId.trim();
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getGatewayUniqId() {
        return gatewayUniqId;
    }

    public void setGatewayUniqId(String gatewayUniqId) {
        this.gatewayUniqId = gatewayUniqId == null ? null : gatewayUniqId.trim();
    }

    public String getApplicationTerminalId() {
        return applicationTerminalId;
    }

    public void setApplicationTerminalId(String applicationTerminalId) {
        this.applicationTerminalId = applicationTerminalId == null ? null : applicationTerminalId.trim();
    }

    public String getNodeUniqId() {
        return nodeUniqId;
    }

    public void setNodeUniqId(String nodeUniqId) {
        this.nodeUniqId = nodeUniqId == null ? null : nodeUniqId.trim();
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command == null ? null : command.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getDelayed() {
        return delayed;
    }

    public void setDelayed(Integer delayed) {
        this.delayed = delayed;
    }

    public String getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(String executeTime) {
        this.executeTime = executeTime == null ? null : executeTime.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
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
        sb.append(", applicationLinkageId=").append(applicationLinkageId);
        sb.append(", category=").append(category);
        sb.append(", gatewayUniqId=").append(gatewayUniqId);
        sb.append(", applicationTerminalId=").append(applicationTerminalId);
        sb.append(", nodeUniqId=").append(nodeUniqId);
        sb.append(", no=").append(no);
        sb.append(", command=").append(command);
        sb.append(", state=").append(state);
        sb.append(", delayed=").append(delayed);
        sb.append(", executeTime=").append(executeTime);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", createUser=").append(createUser);
        sb.append(", createDate=").append(createDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}