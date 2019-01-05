package com.ygzc.dao.model.ygzc;

import java.io.Serializable;

public class Character implements Serializable {
    private Integer charId;

    private String chara;

    private static final long serialVersionUID = 1L;

    public Integer getCharId() {
        return charId;
    }

    public void setCharId(Integer charId) {
        this.charId = charId;
    }

    public String getChara() {
        return chara;
    }

    public void setChara(String chara) {
        this.chara = chara == null ? null : chara.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", charId=").append(charId);
        sb.append(", chara=").append(chara);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}