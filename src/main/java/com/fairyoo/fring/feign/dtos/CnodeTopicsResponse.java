package com.fairyoo.fring.feign.dtos;

import java.util.List;

/**
 * @author MengYi at 2019-01-04 09:31
 */
public class CnodeTopicsResponse {
    private boolean success;
    private List<Object> data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }
}
