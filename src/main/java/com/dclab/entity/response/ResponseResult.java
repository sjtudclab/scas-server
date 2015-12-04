package com.dclab.entity.response;

import java.util.List;

/**
 * Created by DCLab on 12/2/2015.
 */
public class ResponseResult<T> {
    private Integer code;
    private String msg;
    private List<T> data;

    public ResponseResult() {
        this.code = 0;
        this.msg = "";
    }

    public ResponseResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResponseResult(List<T> data) {
        this.code = 0;
        this.msg = "";
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
