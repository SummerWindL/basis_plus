package com.ygzc.dao.model.ygzc;

import java.io.Serializable;

public class ArcCode implements Serializable {
    private Integer id;

    private Integer tidId;

    private String terper;

    private String wind;

    private String handWind;

    private String autoWind;

    private String onOff;

    private String type;

    private String model;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTidId() {
        return tidId;
    }

    public void setTidId(Integer tidId) {
        this.tidId = tidId;
    }

    public String getTerper() {
        return terper;
    }

    public void setTerper(String terper) {
        this.terper = terper == null ? null : terper.trim();
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind == null ? null : wind.trim();
    }

    public String getHandWind() {
        return handWind;
    }

    public void setHandWind(String handWind) {
        this.handWind = handWind == null ? null : handWind.trim();
    }

    public String getAutoWind() {
        return autoWind;
    }

    public void setAutoWind(String autoWind) {
        this.autoWind = autoWind == null ? null : autoWind.trim();
    }

    public String getOnOff() {
        return onOff;
    }

    public void setOnOff(String onOff) {
        this.onOff = onOff == null ? null : onOff.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tidId=").append(tidId);
        sb.append(", terper=").append(terper);
        sb.append(", wind=").append(wind);
        sb.append(", handWind=").append(handWind);
        sb.append(", autoWind=").append(autoWind);
        sb.append(", onOff=").append(onOff);
        sb.append(", type=").append(type);
        sb.append(", model=").append(model);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}