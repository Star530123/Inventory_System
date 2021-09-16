package com.ivymon.inventory.service.impl;

import com.ivymon.inventory.entity.Product;
import com.ivymon.inventory.entity.mapper.ProductMapper;
import com.ivymon.inventory.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProductServiceImpl")
public class ProductServiceImpl implements IProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public Product getProduct(Integer id) {

        return productMapper.selectByPrimaryKey(id);
    }

    @Override
    public String createProduct(String name) {
        Product product = new Product();
        product.setName(name);
        productMapper.insertSelective(product);
        return "successful";

    }

    @Override
    public String updateProduct(Product product) {

        productMapper.updateByPrimaryKeySelective(product);
        return "successful";
    }

    @Override
    public String deleteProduct(Integer id) {
        productMapper.deleteByPrimaryKey(id);
        return "successful";
    }

    @Override
    public List<Product> researchProduct() {

        return productMapper.selectAll();
    }


}
