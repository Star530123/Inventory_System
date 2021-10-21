package com.ivymon.inventory.service.impl;

import com.ivymon.inventory.entity.GoodsInfo;
import com.ivymon.inventory.entity.mapper.GoodsInfoMapper;
import com.ivymon.inventory.model.request.DeleteGoodsReq;
import com.ivymon.inventory.model.request.NewGoodsReq;
import com.ivymon.inventory.model.request.QueryGoodsReq;
import com.ivymon.inventory.model.response.DeleteGoodsRes;
import com.ivymon.inventory.model.response.NewGoodsRes;
import com.ivymon.inventory.model.response.QueryGoodsRes;
import com.ivymon.inventory.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("GoodsServiceImpl")
public class GoodsServiceImpl implements IGoodsService {
    @Autowired
    private GoodsInfoMapper goodsInfoMapper;

    @Override
    public NewGoodsRes newGoods(NewGoodsReq newGoodsReq){

        GoodsInfo goodsInfo = new GoodsInfo();
        String goodName = newGoodsReq.getFeature() + newGoodsReq.getSize();
        goodsInfo.setGoodsName(goodName);
        goodsInfo.setItemSeq(newGoodsReq.getItemSeq());
        goodsInfo.setPerQuantity(newGoodsReq.getPerQuantity());
        goodsInfo.setAmount(newGoodsReq.getAmount());
        goodsInfo.setTwdUnitPrice(newGoodsReq.getTwdUnitPrice());
        goodsInfo.setManuSeq(newGoodsReq.getManuSeq());
        goodsInfo.setPurchaseTime(newGoodsReq.getPurchaseTime());
        if(newGoodsReq.getCurrencyUnitPrice() != null){
            goodsInfo.setCurrencyUnitPrice(newGoodsReq.getCurrencyUnitPrice());
        }
        if (newGoodsReq.getTariff() != null){
            goodsInfo.setTariff(newGoodsReq.getTariff());
        }
        if(newGoodsReq.getShippingFee() != null){
            goodsInfo.setShippingFee(newGoodsReq.getShippingFee());
        }
        goodsInfoMapper.insertSelective(goodsInfo);
        NewGoodsRes newGoodsRes = new NewGoodsRes();
        newGoodsRes.setGoodSeq(goodsInfo.getGoodsSeq());
        newGoodsRes.setGoodsName(goodsInfo.getGoodsName());
        return newGoodsRes;
    }

    @Override
    public DeleteGoodsRes deleteGoods(DeleteGoodsReq deleteGoodsReq){
        goodsInfoMapper.deleteByPrimaryKey(deleteGoodsReq.getGoodsSeq());
        return new DeleteGoodsRes(true);
    }

    @Override
    public QueryGoodsRes queryGoods(QueryGoodsReq queryGoodsReq){
        goodsInfoMapper.



        QueryGoodsRes queryGoodsRes = new QueryGoodsRes();
        return queryGoodsRes;
    }
}
