package com.dclab.entity;

public class Community {
    private Integer commId;

    private String commName;

    private String commAddress;

    private String commCodeProvince;

    private String comCodeCity;

    private String commCodeDistrict;

    private String commCodeCommunity;

    public Community(String commName, String commAddress) {
        this.commName = commName;
        this.commAddress = commAddress;
    }

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

    public String getComCodeCity() {
        return comCodeCity;
    }

    public void setComCodeCity(String comCodeCity) {
        this.comCodeCity = comCodeCity == null ? null : comCodeCity.trim();
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