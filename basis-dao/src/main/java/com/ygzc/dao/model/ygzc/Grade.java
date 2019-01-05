package com.ygzc.dao.model.ygzc;

import java.io.Serializable;

public class Grade implements Serializable {
    /**
     * 级别ID
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer id;

    /**
     * 级别编码
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String gradeCode;

    /**
     * 等级名称
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String gradeName;

    /**
     * 级别
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer level;

    /**
     * 备注
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGradeCode() {
        return gradeCode;
    }

    public void setGradeCode(String gradeCode) {
        this.gradeCode = gradeCode == null ? null : gradeCode.trim();
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName == null ? null : gradeName.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", gradeCode=").append(gradeCode);
        sb.append(", gradeName=").append(gradeName);
        sb.append(", level=").append(level);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}