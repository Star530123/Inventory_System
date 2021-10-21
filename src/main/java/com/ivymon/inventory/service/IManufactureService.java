package com.ivymon.inventory.service;

import com.ivymon.inventory.model.request.DeleteManuReq;
import com.ivymon.inventory.model.request.NewManuReq;
import com.ivymon.inventory.model.response.DeleteManuRes;
import com.ivymon.inventory.model.response.NewManuRes;

public interface IManufactureService {
    public NewManuRes newManufacture(NewManuReq newManuReq);

    public DeleteManuRes deleteManufacture(DeleteManuReq deleteManuReq);
}
