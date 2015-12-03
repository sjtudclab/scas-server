package com.dclab.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "neigId")
public class Neighbourhood {
    private Integer neigId;

    private String neigName;

    private String neigAddress;

    private Integer commId;

    public Neighbourhood() {
    }
    public Neighbourhood(int commId) {
        this.commId = commId;
    }

    public Integer getNeigId() {
        return neigId;
    }

    public void setNeigId(Integer neigId) {
        this.neigId = neigId;
    }

    public String getNeigName() {
        return neigName;
    }

    public void setNeigName(String neigName) {
        this.neigName = neigName == null ? null : neigName.trim();
    }

    public String getNeigAddress() {
        return neigAddress;
    }

    public void setNeigAddress(String neigAddress) {
        this.neigAddress = neigAddress == null ? null : neigAddress.trim();
    }

    public Integer getCommId() {
        return commId;
    }

    public void setCommId(Integer commId) {
        this.commId = commId;
    }
}