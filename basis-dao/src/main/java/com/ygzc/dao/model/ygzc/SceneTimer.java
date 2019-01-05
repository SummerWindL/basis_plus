package com.ygzc.dao.model.ygzc;

import java.io.Serializable;
import java.util.Date;

public class SceneTimer implements Serializable {
    /**
     * 情景定时ID
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String id;

    /**
     * 定时类型，1仅执行一次、2重复执行，3周一到周五，4自定义
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer category;

    /**
     * 绑定应用
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String bindApplication;

    private String bindApplicationScene;

    private String bindSceneTerminal;

    /**
     * 定时名称
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String timeName;

    /**
     * 0不重复，1重复
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer repeat;

    /**
     * 是否执行,仅执行一次的更改该值 1已经执行过
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer isRun;

    /**
     * 执行时间
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String executionTime;

    /**
     * 是否停用0启用，1停用
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer state;

    private String createUser;

    private Date createDate;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getBindApplication() {
        return bindApplication;
    }

    public void setBindApplication(String bindApplication) {
        this.bindApplication = bindApplication == null ? null : bindApplication.trim();
    }

    public String getBindApplicationScene() {
        return bindApplicationScene;
    }

    public void setBindApplicationScene(String bindApplicationScene) {
        this.bindApplicationScene = bindApplicationScene == null ? null : bindApplicationScene.trim();
    }

    public String getBindSceneTerminal() {
        return bindSceneTerminal;
    }

    public void setBindSceneTerminal(String bindSceneTerminal) {
        this.bindSceneTerminal = bindSceneTerminal == null ? null : bindSceneTerminal.trim();
    }

    public String getTimeName() {
        return timeName;
    }

    public void setTimeName(String timeName) {
        this.timeName = timeName == null ? null : timeName.trim();
    }

    public Integer getRepeat() {
        return repeat;
    }

    public void setRepeat(Integer repeat) {
        this.repeat = repeat;
    }

    public Integer getIsRun() {
        return isRun;
    }

    public void setIsRun(Integer isRun) {
        this.isRun = isRun;
    }

    public String getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(String executionTime) {
        this.executionTime = executionTime == null ? null : executionTime.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", category=").append(category);
        sb.append(", bindApplication=").append(bindApplication);
        sb.append(", bindApplicationScene=").append(bindApplicationScene);
        sb.append(", bindSceneTerminal=").append(bindSceneTerminal);
        sb.append(", timeName=").append(timeName);
        sb.append(", repeat=").append(repeat);
        sb.append(", isRun=").append(isRun);
        sb.append(", executionTime=").append(executionTime);
        sb.append(", state=").append(state);
        sb.append(", createUser=").append(createUser);
        sb.append(", createDate=").append(createDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}