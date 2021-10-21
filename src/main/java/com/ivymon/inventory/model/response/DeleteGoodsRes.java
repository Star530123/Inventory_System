package com.ivymon.inventory.model.response;

public class DeleteGoodsRes {
    public DeleteGoodsRes() {

    }

    public DeleteGoodsRes(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    private boolean isSuccess;

    public boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(boolean success) {
        isSuccess = success;
    }
}
