package com.ivymon.inventory.service;

import com.ivymon.inventory.model.request.ManuListReq;
import com.ivymon.inventory.model.response.ManuListRes;

import java.util.List;

public interface ICommonService {
    public List<ManuListRes> manuList(ManuListReq manuListReq);
}
