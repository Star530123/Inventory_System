package com.ivymon.inventory.entity;

public class QueryGoods{
    private String goodsNameLike;
    private Integer categorySeq;
    private Integer itemSeq;

    public String getGoodsNameLike() {
        return goodsNameLike;
    }

    public void setGoodsNameLike(String goodsNameLike) {
        this.goodsNameLike = goodsNameLike;
    }

    public Integer getCategorySeq() {
        return categorySeq;
    }

    public void setCategorySeq(Integer categorySeq) {
        this.categorySeq = categorySeq;
    }

    public Integer getItemSeq() {
        return itemSeq;
    }

    public void setItemSeq(Integer itemSeq) {
        this.itemSeq = itemSeq;
    }
}
