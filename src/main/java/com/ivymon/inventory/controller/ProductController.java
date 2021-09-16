package com.ivymon.inventory.controller;

import com.ivymon.inventory.entity.Product;
import com.ivymon.inventory.model.Request;
import com.ivymon.inventory.model.Response;
import com.ivymon.inventory.service.IProductService;
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
@Api(tags = "TEST")
public class ProductController {
    @Autowired
    @Qualifier("ProductServiceImpl")
    private IProductService productService;

//get
    @RequestMapping(value = "getProduct", method = {RequestMethod.POST})
    @ResponseBody
    @Operation(description = "測試")
    public Response<Product> test(@RequestBody Request<Integer> request) {
        return new Response<>(productService.getProduct(request.getBody()));
    }
    // 新增
    @RequestMapping(value = "createProduct", method = {RequestMethod.POST})
    @ResponseBody
    @Operation(description = "新增")
    public Response<String> create(@RequestBody Request<String> request){

        return new Response<String>(productService.createProduct(request.getBody()));
    }



    //修改
    @RequestMapping(value = "updateProduct", method = {RequestMethod.POST})
    @ResponseBody
    @Operation(description = "更新")
    public Response<String> update(@RequestBody Request<Product> request){
        return new Response<String>(productService.updateProduct(request.getBody()));
    }
    //刪除
    @RequestMapping(value = "deleteProduct", method = {RequestMethod.POST})
    @ResponseBody
    @Operation(description = "刪除")
    public void delete(@RequestBody Request<Integer> request){
        Response response =  new Response<String>(productService.deleteProduct(request.getBody()));
    }
    //查詢呈現
    @RequestMapping(value = "research", method = {RequestMethod.POST})
    @ResponseBody
    @Operation(description = "查詢")
    public Response<List<Product>> research(){
        return new Response<List<Product>>(productService.researchProduct());
    }

}
