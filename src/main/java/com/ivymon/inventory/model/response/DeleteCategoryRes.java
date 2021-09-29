package com.ivymon.inventory.model.response;

public class DeleteCategoryRes {
    public DeleteCategoryRes(){
    }
    public DeleteCategoryRes(boolean isSuccess){
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
