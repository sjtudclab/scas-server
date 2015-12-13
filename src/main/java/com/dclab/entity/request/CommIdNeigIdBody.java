package com.dclab.entity.request;

/**
 * Created by DCLab on 12/13/2015.
 */
public class CommIdNeigIdBody {

    private int commId;
    private int neighbourId;

    public CommIdNeigIdBody() {
    }

    public CommIdNeigIdBody(int commId, int neighbourId) {
        this.commId = commId;
        this.neighbourId = neighbourId;
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

}
