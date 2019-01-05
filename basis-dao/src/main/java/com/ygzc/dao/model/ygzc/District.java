package com.ygzc.dao.model.ygzc;

import java.io.Serializable;

public class District implements Serializable {
    private Integer distrctId;

    private String districtName;

    private Integer cityId;

    private static final long serialVersionUID = 1L;

    public Integer getDistrctId() {
        return distrctId;
    }

    public void setDistrctId(Integer distrctId) {
        this.distrctId = distrctId;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName == null ? null : districtName.trim();
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", distrctId=").append(distrctId);
        sb.append(", districtName=").append(districtName);
        sb.append(", cityId=").append(cityId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}