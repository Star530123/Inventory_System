package com.ivymon.inventory.model.request;

public class UpdateItemReq {
    public Integer getItemSeq() {
        return itemSeq;
    }

    public void setItemSeq(Integer itemSeq) {
        this.itemSeq = itemSeq;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getCategorySeq() {
        return categorySeq;
    }

    public void setCategorySeq(Integer categorySeq) {
        this.categorySeq = categorySeq;
    }

    private Integer itemSeq;
    private String itemName;
    private  Integer categorySeq;
}
