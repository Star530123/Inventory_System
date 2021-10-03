package com.ivymon.inventory.model.response;

public class DeleteManuRes {
    public DeleteManuRes(){

    }
    public DeleteManuRes(boolean isSuccess){
        this.isSuccess = isSuccess;
    }
    private boolean isSuccess;

    public boolean getIsSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }
}
