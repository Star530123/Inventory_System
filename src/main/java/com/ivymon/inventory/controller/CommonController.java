package com.ivymon.inventory.controller;

import com.ivymon.inventory.model.Request;
import com.ivymon.inventory.model.Response;
import com.ivymon.inventory.model.request.CategoryListReq;
import com.ivymon.inventory.model.request.ItemListReq;
import com.ivymon.inventory.model.request.ManuListReq;
import com.ivymon.inventory.model.response.CategoryListRes;
import com.ivymon.inventory.model.response.ItemListRes;
import com.ivymon.inventory.model.response.ManuListRes;
import com.ivymon.inventory.service.ICommonService;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Api(tags = "COMMON")
@RequestMapping(value = "/api/common")
public class CommonController {
    @Autowired
    @Qualifier("CommonServiceImpl")
    private ICommonService commonService;

    @RequestMapping(value = "/categoryList", method = {RequestMethod.POST})
    @ResponseBody
    @Operation(description = "查詢貨物類別列表")
    public Response<List<CategoryListRes>> categoryList(@RequestBody Request<CategoryListReq> request) {
        return new Response<>(commonService.categoryList(request.getBody()));
    }

    @RequestMapping(value = "/manuList", method = {RequestMethod.POST})
    @ResponseBody
    @Operation(description = "查詢廠商名稱列表")
    public Response<List<ManuListRes>> manuList(@RequestBody Request<ManuListReq> request) {
        return new Response<>(commonService.manuList(request.getBody()));
    }

    @RequestMapping(value = "/itemList", method = {RequestMethod.POST})
    @ResponseBody
    @Operation(description = "查詢貨物項目列表")
    public Response<List<ItemListRes>> itemList(@RequestBody Request<ItemListReq> request) {
        return new Response<>(commonService.itemList(request.getBody()));
    }

}
