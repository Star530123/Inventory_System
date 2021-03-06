package com.ivymon.inventory.service;

import com.ivymon.inventory.model.request.DeleteGoodsReq;
import com.ivymon.inventory.model.request.NewGoodsReq;
import com.ivymon.inventory.model.request.QueryGoodsReq;
import com.ivymon.inventory.model.response.DeleteGoodsRes;
import com.ivymon.inventory.model.response.NewGoodsRes;
import com.ivymon.inventory.model.response.QueryGoodsRes;

import java.util.List;

public interface IGoodsService {
    public NewGoodsRes newGoods(NewGoodsReq newGoodsReq);

    public DeleteGoodsRes deleteGoods(DeleteGoodsReq deleteGoodsReq);

    public List<QueryGoodsRes> queryGoods(QueryGoodsReq queryGoodsReq);
}
