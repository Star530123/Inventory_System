package com.ivymon.inventory.service;

import com.ivymon.inventory.model.request.DeleteCategoryReq;
import com.ivymon.inventory.model.request.NewCategoryReq;
import com.ivymon.inventory.model.request.UpdateCategoryReq;
import com.ivymon.inventory.model.response.DeleteCategoryRes;
import com.ivymon.inventory.model.response.NewCategoryRes;
import com.ivymon.inventory.model.response.UpdateCategoryRes;

public interface IGoodsCategoryService {
    public NewCategoryRes newCategory(NewCategoryReq newCategoryReq);

    public DeleteCategoryRes deleteCategory(DeleteCategoryReq deleteCategoryReq);

    public UpdateCategoryRes updateCategory(UpdateCategoryReq updateCategoryReq);
//    public ResearchCategoryRes researchCategory(ResearchCategoryReq researchCategoryReq);
}
