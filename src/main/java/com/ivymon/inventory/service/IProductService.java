package com.ivymon.inventory.service;

import com.ivymon.inventory.entity.Product;

import java.util.List;

public interface IProductService {

    public Product getProduct(Integer id);

    public  String createProduct(String name);

    public String updateProduct(Product product);

    public String deleteProduct(Integer id);

    public List<Product> representProduct();


}
