package com.ivymon.inventory.entity;

public class ItemVo {
    private Integer itemSeq;
    private String itemName;
    private Integer categorySeq;
    private String categoryName;

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

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
