package com.ivymon.inventory.controller;

import com.ivymon.inventory.model.Request;
import com.ivymon.inventory.model.Response;
import com.ivymon.inventory.model.request.DeleteManuReq;
import com.ivymon.inventory.model.request.NewManuReq;
import com.ivymon.inventory.model.response.DeleteManuRes;
import com.ivymon.inventory.model.response.NewManuRes;
import com.ivymon.inventory.service.IManufactureService;
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
@Api(tags = "manufacturer")
@RequestMapping(value = "/api/manu")
public class ManuController {
    @Autowired
    @Qualifier("ManufactureServiceImpl")
    private IManufactureService manufactureService;

    @RequestMapping(value = "/newManufacturer", method = {RequestMethod.POST})
    @ResponseBody
    @Operation(description = "新增廠商")
    public Response<NewManuRes> newManu(@RequestBody Request<NewManuReq> request) {
        return new Response<>(manufactureService.newManufacture(request.getBody()));
    }

    @RequestMapping(value = "/deleteManufacturer", method = {RequestMethod.POST})
    @ResponseBody
    @Operation(description = "刪除廠商")
    public Response<DeleteManuRes> deleteManu(@RequestBody Request<DeleteManuReq> request) {
        return new Response<>(manufactureService.deleteManufacture(request.getBody()));
    }
}