package com.ivymon.inventory.service.impl;

import com.ivymon.inventory.entity.GoodsCategory;
import com.ivymon.inventory.entity.mapper.GoodsCategoryMapper;
import com.ivymon.inventory.model.request.DeleteCategoryReq;
import com.ivymon.inventory.model.request.NewCategoryReq;
import com.ivymon.inventory.model.request.UpdateCategoryReq;
import com.ivymon.inventory.model.response.DeleteCategoryRes;
import com.ivymon.inventory.model.response.NewCategoryRes;
import com.ivymon.inventory.model.response.UpdateCategoryRes;
import com.ivymon.inventory.service.IGoodsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CategoryServiceImpl")
public class CategoryServiceImpl implements IGoodsCategoryService {
    @Autowired
    private GoodsCategoryMapper goodsCategoryMapper;
    @Override
    public NewCategoryRes newCategory(NewCategoryReq newCategoryReq){
        GoodsCategory goodsCategory = new GoodsCategory();
        goodsCategory.setCategoryName(newCategoryReq.getCategoryName());
        goodsCategoryMapper.insertSelective(goodsCategory);
        NewCategoryRes newCategoryRes = new NewCategoryRes();
        newCategoryRes.setCategorySeq(goodsCategory.getCategorySeq());
        return newCategoryRes;

    }
    public DeleteCategoryRes deleteCategory (DeleteCategoryReq deleteCategoryReq){
        goodsCategoryMapper.deleteByPrimaryKey(deleteCategoryReq.getCategorySeq());
        return  new DeleteCategoryRes();

    }
    public UpdateCategoryRes updateCategory(UpdateCategoryReq updateCategoryReq){
        GoodsCategory goodsCategory = new GoodsCategory();
        goodsCategory.setCategorySeq(updateCategoryReq.getCategorySeq());
        goodsCategory.setCategoryName(updateCategoryReq.getCategoryName());
        goodsCategoryMapper.updateByPrimaryKey(goodsCategory);
        UpdateCategoryRes updateCategoryRes = new UpdateCategoryRes();
        updateCategoryRes.setCategorySeq(goodsCategory.getCategorySeq());
        return updateCategoryRes;
    }

//    public ResearchCategoryRes researchCategory(ResearchCategoryReq researchCategoryReq){
//        GoodsCategory goodsCategory = new GoodsCategory();
//        goodsCategory.setCategoryName(researchCategoryReq.getCategoryName());
//        goodsCategory.setCategorySeq(researchCategoryReq.getCategorySeq());
//        goodsCategoryMapper.selectByPrimaryKey(goodsCategory.getCategorySeq());
//        ResearchCategoryRes researchCategoryRes = new ResearchCategoryRes();
//        researchCategoryReq.setCategoryName(goodsCategory.getCategoryName());
//        researchCategoryReq.setCategorySeq(goodsCategory.getCategorySeq());
//        return researchCategoryRes;
//    }
}
