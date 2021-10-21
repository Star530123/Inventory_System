package com.ivymon.inventory.model.response;

public class ManuListRes {
    private Integer manuSeq;
    private String manuName;
    private String currency;

    public String getManuName() {
        return manuName;
    }

    public void setManuName(String manuName) {
        this.manuName = manuName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


    public Integer getManuSeq() {

        return manuSeq;
    }

    public void setManuSeq(Integer manuSeq) {
        this.manuSeq = manuSeq;
    }
}
