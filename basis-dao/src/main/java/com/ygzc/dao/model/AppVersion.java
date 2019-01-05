package com.ygzc.dao.model;

import java.io.Serializable;
import java.util.Date;

public class AppVersion implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_version.id
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_version.version_name
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    private String versionName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_version.version_number
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    private String versionNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_version.url
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_version.publish_time
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    private Date publishTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_version.remark
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_version.channel_name
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    private String channelName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_version.latest
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    private Integer latest;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table app_version
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_version.id
     *
     * @return the value of app_version.id
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_version.id
     *
     * @param id the value for app_version.id
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_version.version_name
     *
     * @return the value of app_version.version_name
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public String getVersionName() {
        return versionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_version.version_name
     *
     * @param versionName the value for app_version.version_name
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public void setVersionName(String versionName) {
        this.versionName = versionName == null ? null : versionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_version.version_number
     *
     * @return the value of app_version.version_number
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public String getVersionNumber() {
        return versionNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_version.version_number
     *
     * @param versionNumber the value for app_version.version_number
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber == null ? null : versionNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_version.url
     *
     * @return the value of app_version.url
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_version.url
     *
     * @param url the value for app_version.url
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_version.publish_time
     *
     * @return the value of app_version.publish_time
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public Date getPublishTime() {
        return publishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_version.publish_time
     *
     * @param publishTime the value for app_version.publish_time
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_version.remark
     *
     * @return the value of app_version.remark
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_version.remark
     *
     * @param remark the value for app_version.remark
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_version.channel_name
     *
     * @return the value of app_version.channel_name
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_version.channel_name
     *
     * @param channelName the value for app_version.channel_name
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_version.latest
     *
     * @return the value of app_version.latest
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public Integer getLatest() {
        return latest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_version.latest
     *
     * @param latest the value for app_version.latest
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    public void setLatest(Integer latest) {
        this.latest = latest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbg.generated Wed Jun 06 11:42:26 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", versionName=").append(versionName);
        sb.append(", versionNumber=").append(versionNumber);
        sb.append(", url=").append(url);
        sb.append(", publishTime=").append(publishTime);
        sb.append(", remark=").append(remark);
        sb.append(", channelName=").append(channelName);
        sb.append(", latest=").append(latest);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}