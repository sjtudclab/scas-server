package com.dclab.entity.request;

/**
 * Created by DCLab on 12/4/2015.
 */
public class RequestMobileStatBody {

    private int commId;

    public RequestMobileStatBody() {
    }

    public RequestMobileStatBody(int commId) {
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
