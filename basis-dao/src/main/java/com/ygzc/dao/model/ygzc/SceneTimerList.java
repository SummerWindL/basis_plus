package com.ygzc.dao.model.ygzc;

import java.io.Serializable;
import java.util.Date;

public class SceneTimerList implements Serializable {
    private String id;

    /**
     * 情境定时Id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String sceneTimerId;

    /**
     * 是否执行, 0未执行，仅执行一次的更改该值 1已经执行过
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer isRun;

    private Integer weekId;

    private Date createDate;

    private String createUser;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSceneTimerId() {
        return sceneTimerId;
    }

    public void setSceneTimerId(String sceneTimerId) {
        this.sceneTimerId = sceneTimerId == null ? null : sceneTimerId.trim();
    }

    public Integer getIsRun() {
        return isRun;
    }

    public void setIsRun(Integer isRun) {
        this.isRun = isRun;
    }

    public Integer getWeekId() {
        return weekId;
    }

    public void setWeekId(Integer weekId) {
        this.weekId = weekId;
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
        sb.append(", sceneTimerId=").append(sceneTimerId);
        sb.append(", isRun=").append(isRun);
        sb.append(", weekId=").append(weekId);
        sb.append(", createDate=").append(createDate);
        sb.append(", createUser=").append(createUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}