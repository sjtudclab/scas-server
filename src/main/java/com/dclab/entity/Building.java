package com.dclab.entity;

public class Building {
    private Integer buildingId;

    private String name;

    private String desc;

    private Integer neigId;

    public Integer getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public Integer getNeigId() {
        return neigId;
    }

    public void setNeigId(Integer neigId) {
        this.neigId = neigId;
    }
}