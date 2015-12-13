package com.dclab.entity.request;

/**
 * Created by DCLab on 12/13/2015.
 */
public class BuildingIdBody {

    private int buildingId;

    public BuildingIdBody() {
    }

    public BuildingIdBody(int buildingId) {
        this.buildingId = buildingId;
    }

    /**
     *
     * @return
     * The buildingId
     */
    public int getBuildingId() {
        return buildingId;
    }

    /**
     *
     * @param buildingId
     * The buildingId
     */
    public void setBuildingId(int buildingId) {
        this.buildingId = buildingId;
    }

}
