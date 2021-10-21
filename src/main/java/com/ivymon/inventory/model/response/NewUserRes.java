package com.ivymon.inventory.model.response;

public class NewUserRes {
    public NewUserRes() {

    }

    public NewUserRes(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    private boolean isSuccess;

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }
}
