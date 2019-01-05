package com.ygzc.dao.model.ygzc;

import java.io.Serializable;

public class HardSeries implements Serializable {
    /**
     * 硬件系列id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer id;

    /**
     * 硬件类型id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer typeId;

    /**
     * 硬件系列编码
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String seriesCode;

    private String seriesName;

    /**
     * 大最连接数，0表示不限制连接数量
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer maxNum;

    /**
     * 排序好
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer seriesNum;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getSeriesCode() {
        return seriesCode;
    }

    public void setSeriesCode(String seriesCode) {
        this.seriesCode = seriesCode == null ? null : seriesCode.trim();
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName == null ? null : seriesName.trim();
    }

    public Integer getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }

    public Integer getSeriesNum() {
        return seriesNum;
    }

    public void setSeriesNum(Integer seriesNum) {
        this.seriesNum = seriesNum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", typeId=").append(typeId);
        sb.append(", seriesCode=").append(seriesCode);
        sb.append(", seriesName=").append(seriesName);
        sb.append(", maxNum=").append(maxNum);
        sb.append(", seriesNum=").append(seriesNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}