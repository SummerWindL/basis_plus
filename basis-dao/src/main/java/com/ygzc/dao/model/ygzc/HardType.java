package com.ygzc.dao.model.ygzc;

import java.io.Serializable;

public class HardType implements Serializable {
    /**
     * 设备类型id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer id;

    /**
     * 设备类型code
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String typeCode;

    /**
     * 类型名称
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String typeName;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode == null ? null : typeCode.trim();
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
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
        sb.append(", typeCode=").append(typeCode);
        sb.append(", typeName=").append(typeName);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}