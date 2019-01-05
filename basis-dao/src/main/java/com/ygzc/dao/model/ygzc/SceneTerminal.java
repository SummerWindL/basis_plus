package com.ygzc.dao.model.ygzc;

import java.io.Serializable;
import java.util.Date;

public class SceneTerminal implements Serializable {
    private String id;

    /**
     * 应用情景id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String applicationSceneId;

    /**
     * 0网关节点  1 WIFI节点
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer category;

    /**
     * 0 WIFI节点
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String gatewayUniqId;

    private String applicationTerminalId;

    /**
     * 关网或节点设备ID
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String nodeUniqId;

    private Integer no;

    /**
     * 执行命令
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String command;

    /**
     * 行执状态
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer state;

    /**
     * 执行时间
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
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

    public String getApplicationSceneId() {
        return applicationSceneId;
    }

    public void setApplicationSceneId(String applicationSceneId) {
        this.applicationSceneId = applicationSceneId == null ? null : applicationSceneId.trim();
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
        sb.append(", applicationSceneId=").append(applicationSceneId);
        sb.append(", category=").append(category);
        sb.append(", gatewayUniqId=").append(gatewayUniqId);
        sb.append(", applicationTerminalId=").append(applicationTerminalId);
        sb.append(", nodeUniqId=").append(nodeUniqId);
        sb.append(", no=").append(no);
        sb.append(", command=").append(command);
        sb.append(", state=").append(state);
        sb.append(", executeTime=").append(executeTime);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", createUser=").append(createUser);
        sb.append(", createDate=").append(createDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}