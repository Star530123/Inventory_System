package com.ivymon.inventory.controller;

import com.ivymon.inventory.model.Request;
import com.ivymon.inventory.model.Response;
import com.ivymon.inventory.model.request.DeleteCategoryReq;
import com.ivymon.inventory.model.request.NewCategoryReq;
import com.ivymon.inventory.model.request.UpdateCategoryReq;
import com.ivymon.inventory.model.response.DeleteCategoryRes;
import com.ivymon.inventory.model.response.NewCategoryRes;
import com.ivymon.inventory.model.response.UpdateCategoryRes;
import com.ivymon.inventory.service.IGoodsCategoryService;
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
@Api(tags = "category")
public class CategoryController {
    @Autowired
    @Qualifier("CategoryServiceImpl")
    private IGoodsCategoryService categoryService;

    //newCategoryName
    @RequestMapping(value = "newCategory",method = {RequestMethod.POST})
    @ResponseBody
    @Operation(description = "新增種類")
    public Response<NewCategoryRes> createCategory(@RequestBody Request<NewCategoryReq> request){
        return new Response<NewCategoryRes>(categoryService.createCategory(request.getBody()));
    }
//deleteCategory
    @RequestMapping(value = "deleteCategory",method = {RequestMethod.POST})
    @ResponseBody
    @Operation(description = "刪除種類")
    public Response<DeleteCategoryRes> deleteCategory(@RequestBody Request<DeleteCategoryReq> request){
        return new Response<DeleteCategoryRes>(categoryService.deleteCategory(request.getBody()));
    }
    //updateCategory
    @RequestMapping(value = "updateCategory",method = {RequestMethod.POST})
    @ResponseBody
    @Operation(description = "更新種類")
    public Response<UpdateCategoryRes> updateCategory(@RequestBody Request<UpdateCategoryReq> request){
        return new Response<UpdateCategoryRes>(categoryService.updateCategory(request.getBody()));
    }

}
