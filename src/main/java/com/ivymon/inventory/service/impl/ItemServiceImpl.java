package com.ivymon.inventory.service.impl;

import com.ivymon.inventory.entity.GoodsItem;
import com.ivymon.inventory.entity.mapper.GoodsItemMapper;
import com.ivymon.inventory.model.request.DeleteItemReq;
import com.ivymon.inventory.model.request.NewItemReq;
import com.ivymon.inventory.model.request.UpdateItemReq;
import com.ivymon.inventory.model.response.DeleteItemRes;
import com.ivymon.inventory.model.response.NewItemRes;
import com.ivymon.inventory.model.response.UpdateItemRes;
import com.ivymon.inventory.service.IGoodsItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ItemServiceImpl")
public class ItemServiceImpl implements IGoodsItemService {
    @Autowired
    private GoodsItemMapper goodsItemMapper;
    @Override
    public NewItemRes newItem (NewItemReq newItemReq){
        GoodsItem goodsItem = new GoodsItem();
        goodsItem.setItemName(newItemReq.getItemName());
        goodsItem.setCategorySeq(newItemReq.getCategorySeq());
        goodsItemMapper.insertSelective(goodsItem);
        NewItemRes newItemRes = new NewItemRes();
        newItemRes.setItemSeq(goodsItem.getItemSeq());
        return newItemRes;

    }
    public DeleteItemRes deleteItem(DeleteItemReq deleteItemReq){
        goodsItemMapper.deleteByPrimaryKey(deleteItemReq.getItemSeq());
        return new DeleteItemRes();
    }
    public UpdateItemRes updateItem(UpdateItemReq updateItemReq){
        GoodsItem goodsItem = new GoodsItem();
        goodsItem.setItemSeq(updateItemReq.getItemSeq());
        goodsItem.setItemName(updateItemReq.getItemName());
        goodsItem.setCategorySeq(updateItemReq.getCategorySeq());
        goodsItemMapper.updateByPrimaryKey(goodsItem);
        UpdateItemRes updateItemRes = new UpdateItemRes();
        updateItemRes.setItemSeq(goodsItem.getItemSeq());
        return updateItemRes;
    }



}
