package com.ivymon.inventory.model.response;

import com.ivymon.inventory.model.vo.Item;

import java.util.List;

public class ItemListRes {
    private Integer categorySeq;
    private String categoryName;
    private List<Item> items;


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

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }


}
