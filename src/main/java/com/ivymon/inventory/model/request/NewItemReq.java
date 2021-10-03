package com.ivymon.inventory.model.request;

public class NewItemReq {
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

    private String itemName;
    private Integer categorySeq;
}
