package com.ivymon.inventory.entity;

import java.util.Date;

public class GoodInfoVo {
    private Integer goodsSeq;
    private String goodsName;
    private Integer categorySeq;
    private Integer itemSeq;
    private Integer twdUnitPrice;
    private Integer amount;
    private Integer manuSeq;
    private Date purchaseTime;

    public Integer getGoodsSeq() {
        return goodsSeq;
    }

    public void setGoodsSeq(Integer goodsSeq) {
        this.goodsSeq = goodsSeq;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
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

    public Integer getTwdUnitPrice() {
        return twdUnitPrice;
    }

    public void setTwdUnitPrice(Integer twdUnitPrice) {
        this.twdUnitPrice = twdUnitPrice;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getManuSeq() {
        return manuSeq;
    }

    public void setManuSeq(Integer manuSeq) {
        this.manuSeq = manuSeq;
    }

    public Date getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(Date purchaseTime) {
        this.purchaseTime = purchaseTime;
    }
}
