package com.ivymon.inventory.service;

import com.ivymon.inventory.model.request.DeleteItemReq;
import com.ivymon.inventory.model.request.NewItemReq;
import com.ivymon.inventory.model.request.UpdateItemReq;
import com.ivymon.inventory.model.response.DeleteItemRes;
import com.ivymon.inventory.model.response.NewItemRes;
import com.ivymon.inventory.model.response.UpdateItemRes;

public interface IGoodsItemService {
    public NewItemRes newItem (NewItemReq newItemReq);
    public DeleteItemRes deleteItem(DeleteItemReq deleteItemReq);
    public UpdateItemRes updateItem(UpdateItemReq updateItemReq);
}
