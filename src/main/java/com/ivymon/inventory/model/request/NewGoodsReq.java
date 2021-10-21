package com.ivymon.inventory.model.request;

import java.util.Date;

public class NewGoodsReq {
    private String feature;
    private String size;
    private Integer itemSeq;
    private Integer perQuantity;
    private Integer amount;
    private Integer twdUnitPrice;
    private Integer currencyUnitPrice;
    private Integer manuSeq;
    private Date purchaseTime;
    private Integer tariff;
    private Integer shippingFee;

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getItemSeq() {
        return itemSeq;
    }

    public void setItemSeq(Integer itemSeq) {
        this.itemSeq = itemSeq;
    }

    public Integer getPerQuantity() {
        return perQuantity;
    }

    public void setPerQuantity(Integer perQuantity) {
        this.perQuantity = perQuantity;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getTwdUnitPrice() {
        return twdUnitPrice;
    }

    public void setTwdUnitPrice(Integer twdUnitPrice) {
        this.twdUnitPrice = twdUnitPrice;
    }

    public Integer getCurrencyUnitPrice() {
        return currencyUnitPrice;
    }

    public void setCurrencyUnitPrice(Integer currencyUnitPrice) {
        this.currencyUnitPrice = currencyUnitPrice;
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

    public Integer getTariff() {
        return tariff;
    }

    public void setTariff(Integer tariff) {
        this.tariff = tariff;
    }

    public Integer getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(Integer shippingFee) {
        this.shippingFee = shippingFee;
    }
}
