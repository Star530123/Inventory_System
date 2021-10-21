package com.ivymon.inventory.controller;

import com.ivymon.inventory.model.Request;
import com.ivymon.inventory.model.Response;
import com.ivymon.inventory.model.request.DeleteGoodsReq;
import com.ivymon.inventory.model.request.NewGoodsReq;
import com.ivymon.inventory.model.response.DeleteGoodsRes;
import com.ivymon.inventory.model.response.NewGoodsRes;
import com.ivymon.inventory.service.IGoodsService;
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
@Api(tags = "TEST")
@RequestMapping(value = "api/goods")
public class GoodsController {
    @Autowired
    @Qualifier("GoodsServiceImpl")
    private IGoodsService goodService;

    @RequestMapping(value = "/newGoods", method = {RequestMethod.POST})
    @ResponseBody
    @Operation(description = "新增貨物")
    public Response<NewGoodsRes> newGoods(@RequestBody Request<NewGoodsReq> request) {
        return new Response<>(goodService.newGoods(request.getBody()));
    }
    @RequestMapping(value = "/deleteGoods", method = {RequestMethod.POST})
    @ResponseBody
    @Operation(description = "刪除貨物")
    public Response<DeleteGoodsRes> deleteGoods(@RequestBody Request<DeleteGoodsReq> request){
        return new Response<>(goodService.deleteGoods(request.getBody()));
    }
//    @RequestMapping(value = "/queryGoods", method = {RequestMethod.POST})
//    @ResponseBody
//    @Operation(description = "查詢貨物現況")
//    public Response<QueryGoodsRes> queryGoods(@RequestBody Request<QueryGoodsReq> request) {
//        return new Response<>(goodService.queryGoods(request.getBody()));
//    }
}
