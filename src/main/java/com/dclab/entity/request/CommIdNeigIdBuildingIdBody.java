package com.dclab.entity.request;

/**
 * Created by DCLab on 12/13/2015.
 */
public class CommIdNeigIdBuildingIdBody {

    private int commId;
    private int neighbourId;
    private int buildingId;

    public CommIdNeigIdBuildingIdBody() {
    }

    public CommIdNeigIdBuildingIdBody(int commId, int neighbourId, int buildingId) {
        this.commId = commId;
        this.neighbourId = neighbourId;
        this.buildingId = buildingId;
    }

    /**
     *
     * @return
     * The commId
     */
    public int getCommId() {
        return commId;
    }

    /**
     *
     * @param commId
     * The commId
     */
    public void setCommId(int commId) {
        this.commId = commId;
    }

    /**
     *
     * @return
     * The neighbourId
     */
    public int getNeighbourId() {
        return neighbourId;
    }

    /**
     *
     * @param neighbourId
     * The neighbourId
     */
    public void setNeighbourId(int neighbourId) {
        this.neighbourId = neighbourId;
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
