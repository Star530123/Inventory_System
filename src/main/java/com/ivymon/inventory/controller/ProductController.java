package com.ivymon.inventory.controller;

import com.ivymon.inventory.entity.Product;
import com.ivymon.inventory.entity.mapper.ProductMapper;
import com.ivymon.inventory.model.Response;
import com.ivymon.inventory.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    @Qualifier("ProductServiceImpl")
    private IProductService productService;


    @RequestMapping(value = "test", method = {RequestMethod.GET})
    @ResponseBody
    public Response<Product> test(Integer id) {
        return new Response<Product>(productService.getProduct(id));
    }
}
