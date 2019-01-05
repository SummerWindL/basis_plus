package com.ygzc.dao.model.ygzc;

import java.io.Serializable;
import java.util.Date;

public class IntelligentHardware implements Serializable {
    /**
     * 智能硬件id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String id;

    /**
     * 设备类型id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer typeId;

    private Integer seriesId;

    /**
     * 设备唯一编码
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String uniqId;

    /**
     * 产品日期
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Date produceDate;

    private String hardwareVer;

    /**
     * 软件版本
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String softwareVer;

    /**
     * 供应商id
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer supplierId;

    /**
     * 批次号
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String batch;

    /**
     * 入网标志
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer netFalg;

    /**
     * 在线标志
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Byte online;

    /**
     * 二维码
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private String intelligentHardwareId;

    /**
     * 绑定次数
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer bindTimes;

    /**
     * 最后绑定时间
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Date endDate;

    /**
     * 出厂日期
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Date factoryDate;

    /**
     * 0非智能、1 zigbee 、2 wifi 、3 bluetooth 、 4 LoRa
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Integer isFlag;

    /**
     * 创建日期
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Date createDate;

    /**
     * 更新日期
     *
     * @mbg.generated Wed Jun 13 16:26:10 CST 2018
     */
    private Date updateDate;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
    }

    public String getUniqId() {
        return uniqId;
    }

    public void setUniqId(String uniqId) {
        this.uniqId = uniqId == null ? null : uniqId.trim();
    }

    public Date getProduceDate() {
        return produceDate;
    }

    public void setProduceDate(Date produceDate) {
        this.produceDate = produceDate;
    }

    public String getHardwareVer() {
        return hardwareVer;
    }

    public void setHardwareVer(String hardwareVer) {
        this.hardwareVer = hardwareVer == null ? null : hardwareVer.trim();
    }

    public String getSoftwareVer() {
        return softwareVer;
    }

    public void setSoftwareVer(String softwareVer) {
        this.softwareVer = softwareVer == null ? null : softwareVer.trim();
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch == null ? null : batch.trim();
    }

    public Integer getNetFalg() {
        return netFalg;
    }

    public void setNetFalg(Integer netFalg) {
        this.netFalg = netFalg;
    }

    public Byte getOnline() {
        return online;
    }

    public void setOnline(Byte online) {
        this.online = online;
    }

    public String getIntelligentHardwareId() {
        return intelligentHardwareId;
    }

    public void setIntelligentHardwareId(String intelligentHardwareId) {
        this.intelligentHardwareId = intelligentHardwareId == null ? null : intelligentHardwareId.trim();
    }

    public Integer getBindTimes() {
        return bindTimes;
    }

    public void setBindTimes(Integer bindTimes) {
        this.bindTimes = bindTimes;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getFactoryDate() {
        return factoryDate;
    }

    public void setFactoryDate(Date factoryDate) {
        this.factoryDate = factoryDate;
    }

    public Integer getIsFlag() {
        return isFlag;
    }

    public void setIsFlag(Integer isFlag) {
        this.isFlag = isFlag;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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
        sb.append(", typeId=").append(typeId);
        sb.append(", seriesId=").append(seriesId);
        sb.append(", uniqId=").append(uniqId);
        sb.append(", produceDate=").append(produceDate);
        sb.append(", hardwareVer=").append(hardwareVer);
        sb.append(", softwareVer=").append(softwareVer);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", batch=").append(batch);
        sb.append(", netFalg=").append(netFalg);
        sb.append(", online=").append(online);
        sb.append(", intelligentHardwareId=").append(intelligentHardwareId);
        sb.append(", bindTimes=").append(bindTimes);
        sb.append(", endDate=").append(endDate);
        sb.append(", factoryDate=").append(factoryDate);
        sb.append(", isFlag=").append(isFlag);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}