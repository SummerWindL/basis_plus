package com.ygzc.dao.model.ygzc;

import java.io.Serializable;
import java.util.Date;

public class HeadImage implements Serializable {
    private String imageId;

    /**
     * 用户ID
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String uid;

    /**
     * 宽度
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer width;

    /**
     * 高度
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer height;

    /**
     * 扩展类型：1 jpg ,2 png ,3 gif
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer ext;

    /**
     * 添加日期
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Date createDate;

    private static final long serialVersionUID = 1L;

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId == null ? null : imageId.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getExt() {
        return ext;
    }

    public void setExt(Integer ext) {
        this.ext = ext;
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
        sb.append(", imageId=").append(imageId);
        sb.append(", uid=").append(uid);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", ext=").append(ext);
        sb.append(", createDate=").append(createDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}