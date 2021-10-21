package com.ivymon.inventory.service.impl;

import com.ivymon.inventory.entity.Manufacture;
import com.ivymon.inventory.entity.mapper.ManufactureMapper;
import com.ivymon.inventory.model.request.DeleteManuReq;
import com.ivymon.inventory.model.request.NewManuReq;
import com.ivymon.inventory.model.response.DeleteManuRes;
import com.ivymon.inventory.model.response.NewManuRes;
import com.ivymon.inventory.service.IManufactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service("ManufactureServiceImpl")

public class ManufactureServiceImpl implements IManufactureService {
    @Autowired
    private ManufactureMapper manufactureMapper;

    @Override
    public NewManuRes newManufacture(NewManuReq newManuReq) {
        Manufacture manufacture = new Manufacture();
        manufacture.setManuName(newManuReq.getManuName());
        manufacture.setCurrency(newManuReq.getCurrency());
        manufacture.setNation(newManuReq.getNation());
        manufacture.setCreatTime(new Date());
        manufactureMapper.insertSelective(manufacture);
        NewManuRes newManuRes = new NewManuRes();
        newManuRes.setManuSeq(manufacture.getManuSeq());
        return newManuRes;
    }

    public DeleteManuRes deleteManufacture(DeleteManuReq deleteManuReq) {
        manufactureMapper.deleteByPrimaryKey(deleteManuReq.getManuSeq());
        return new DeleteManuRes(true);

    }
}
