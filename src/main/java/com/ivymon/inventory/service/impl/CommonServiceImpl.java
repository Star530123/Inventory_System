package com.ivymon.inventory.service.impl;

import com.ivymon.inventory.entity.Manufacture;
import com.ivymon.inventory.entity.mapper.GoodsCategoryMapper;
import com.ivymon.inventory.entity.mapper.GoodsItemMapper;
import com.ivymon.inventory.entity.mapper.ManufactureMapper;
import com.ivymon.inventory.model.request.ManuListReq;
import com.ivymon.inventory.model.response.ManuListRes;
import com.ivymon.inventory.service.ICommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("CommonServiceImpl")
public class CommonServiceImpl implements ICommonService {
    @Autowired
    private ManufactureMapper manufactureMapper;
    private GoodsCategoryMapper goodsCategoryMapper;
    private GoodsItemMapper goodsItemMapper;
    @Override
    public List<ManuListRes> manuList(ManuListReq manuListReq){
        if (manuListReq.getManuSeq() == null){
            List<Manufacture> table = manufactureMapper.selectAll();
            List<ManuListRes> tableRes = new ArrayList<>();
            for(int i = 0; i < table.size();i++){
                ManuListRes manuListRes = new ManuListRes();
                manuListRes.setManuName(table.get(i).getManuName());
                manuListRes.setCurrency(table.get(i).getCurrency());
                manuListRes.setManuSeq(table.get(i).getManuSeq());
                tableRes.add(manuListRes);
            }
           return tableRes;
        }else{
            Manufacture manufacture = new Manufacture();
            manufacture.setManuSeq(manuListReq.getManuSeq());
            manufacture = manufactureMapper.selectByPrimaryKey(manufacture.getManuSeq());
            ManuListRes manuListRes = new ManuListRes();
            manuListRes.setManuSeq(manufacture.getManuSeq());
            manuListRes.setManuName(manufacture.getManuName());
            manuListRes.setCurrency(manufacture.getCurrency());
            List<ManuListRes> tableRes = new ArrayList<>();
            tableRes.add(manuListRes);
            return tableRes;
        }
    }

}
