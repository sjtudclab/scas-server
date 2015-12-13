package com.dclab.entity.request;

/**
 * Created by DCLab on 12/4/2015.
 */
public class CommIdBody {

    private int commId;

    public CommIdBody() {
    }

    public CommIdBody(int commId) {
        this.commId = commId;
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
     * The comm_id
     */
    public void setCommId(int commId) {
        this.commId = commId;
    }

}
