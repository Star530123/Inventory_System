package com.ivymon.inventory.controller;

import com.ivymon.inventory.model.Request;
import com.ivymon.inventory.model.Response;
import com.ivymon.inventory.model.request.DeleteItemReq;
import com.ivymon.inventory.model.request.NewItemReq;
import com.ivymon.inventory.model.request.UpdateItemReq;
import com.ivymon.inventory.model.response.DeleteItemRes;
import com.ivymon.inventory.model.response.NewItemRes;
import com.ivymon.inventory.model.response.UpdateItemRes;
import com.ivymon.inventory.service.IGoodsItemService;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(tags = "item")
public class ItemController {
    @Autowired
    @Qualifier("ItemServiceImpl")
    private IGoodsItemService itemService;

    //newItem
    @RequestMapping(value = "newItem", method = {RequestMethod.POST})
    @ResponseBody
    @Operation(description = "新增項目")
    public Response<NewItemRes> newItem(@RequestBody Request<NewItemReq> request){
        return new Response<NewItemRes>(itemService.newItem(request.getBody()));
    }
    //itemDelete
    @RequestMapping(value = "deleteItem", method = {RequestMethod.POST})
    @ResponseBody
    @Operation(description = "刪除項目")
    public Response<DeleteItemRes> deleteItem(@RequestBody Request<DeleteItemReq> request){
        return new Response<DeleteItemRes>(itemService.deleteItem(request.getBody()));
    }
    //itemUpdate
    @RequestMapping(value = "updateItem", method = {RequestMethod.POST})
    @ResponseBody
    @Operation(description = "新增項目")
    public Response<UpdateItemRes> updateItem(@RequestBody Request<UpdateItemReq> request){
        return new Response<UpdateItemRes>(itemService.updateItem(request.getBody()));
    }
}
