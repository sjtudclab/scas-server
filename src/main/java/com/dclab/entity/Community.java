package com.dclab.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "commId")
public class Community {
    private Integer commId;

    private String commName;

    private String commAddress;

    private String commCodeProvince;

    private String commCodeCity;

    private String commCodeDistrict;

    private String commCodeCommunity;

    public Community(){}

    public Integer getCommId() {
        return commId;
    }

    public void setCommId(Integer commId) {
        this.commId = commId;
    }

    public String getCommName() {
        return commName;
    }

    public void setCommName(String commName) {
        this.commName = commName == null ? null : commName.trim();
    }

    public String getCommAddress() {
        return commAddress;
    }

    public void setCommAddress(String commAddress) {
        this.commAddress = commAddress == null ? null : commAddress.trim();
    }

    public String getCommCodeProvince() {
        return commCodeProvince;
    }

    public void setCommCodeProvince(String commCodeProvince) {
        this.commCodeProvince = commCodeProvince == null ? null : commCodeProvince.trim();
    }

    public String getCommCodeCity() {
        return commCodeCity;
    }

    public void setCommCodeCity(String commCodeCity) {
        this.commCodeCity = commCodeCity == null ? null : commCodeCity.trim();
    }

    public String getCommCodeDistrict() {
        return commCodeDistrict;
    }

    public void setCommCodeDistrict(String commCodeDistrict) {
        this.commCodeDistrict = commCodeDistrict == null ? null : commCodeDistrict.trim();
    }

    public String getCommCodeCommunity() {
        return commCodeCommunity;
    }

    public void setCommCodeCommunity(String commCodeCommunity) {
        this.commCodeCommunity = commCodeCommunity == null ? null : commCodeCommunity.trim();
    }
}