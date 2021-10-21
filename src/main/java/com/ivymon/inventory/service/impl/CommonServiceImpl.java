package com.ivymon.inventory.service.impl;

import com.ivymon.inventory.entity.GoodsCategory;
import com.ivymon.inventory.entity.ItemVo;
import com.ivymon.inventory.entity.Manufacture;
import com.ivymon.inventory.entity.mapper.GoodsCategoryMapper;
import com.ivymon.inventory.entity.mapper.GoodsItemMapper;
import com.ivymon.inventory.entity.mapper.ManufactureMapper;
import com.ivymon.inventory.model.request.CategoryListReq;
import com.ivymon.inventory.model.request.ItemListReq;
import com.ivymon.inventory.model.request.ManuListReq;
import com.ivymon.inventory.model.response.CategoryListRes;
import com.ivymon.inventory.model.response.ItemListRes;
import com.ivymon.inventory.model.response.ManuListRes;
import com.ivymon.inventory.model.vo.Item;
import com.ivymon.inventory.service.ICommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("CommonServiceImpl")
public class CommonServiceImpl implements ICommonService {
    @Autowired
    private ManufactureMapper manufactureMapper;
    @Autowired
    private GoodsCategoryMapper goodsCategoryMapper;
    @Autowired
    private GoodsItemMapper goodsItemMapper;
    @Override
    public List<ManuListRes> manuList(ManuListReq manuListReq){
        List<ManuListRes> manuListResList = new ArrayList<>();
        if (manuListReq.getManuSeq() == null){
            List<Manufacture> manufactureList = manufactureMapper.selectAll();
            for(int i = 0; i < manufactureList.size();i++){
                ManuListRes manuListRes = new ManuListRes();
                setManuListRes(manufactureList.get(i), manuListRes);
                manuListResList.add(manuListRes);
            }
        }else{
            Manufacture manufacture = new Manufacture();
            manufacture.setManuSeq(manuListReq.getManuSeq());
            manufacture = manufactureMapper.selectByPrimaryKey(manufacture.getManuSeq());
            ManuListRes manuListRes = new ManuListRes();
            setManuListRes(manufacture, manuListRes);
            manuListResList.add(manuListRes);
        }
        return manuListResList;
    }

    private void setManuListRes(Manufacture manufacture, ManuListRes manuListRes) {
        manuListRes.setManuName(manufacture.getManuName());
        manuListRes.setCurrency(manufacture.getCurrency());
        manuListRes.setManuSeq(manufacture.getManuSeq());
    }

    @Override
    public List<CategoryListRes> categoryList(CategoryListReq categoryListReq){
        List<CategoryListRes> categoryListResList = new ArrayList<>();
        if(categoryListReq.getCategorySeq()== null){
            List<GoodsCategory> categoryList = goodsCategoryMapper.selectAll();
            for (int i = 0; i < categoryList.size(); i++){
                CategoryListRes categoryListRes = new CategoryListRes();
                setCategoryRes(categoryList.get(i), categoryListRes);
                categoryListResList.add(categoryListRes);
            }
        }else{
            GoodsCategory goodsCategory = new GoodsCategory();
            goodsCategory.setCategorySeq(categoryListReq.getCategorySeq());
            goodsCategory = goodsCategoryMapper.selectByPrimaryKey(goodsCategory.getCategorySeq());
            CategoryListRes categoryListRes = new CategoryListRes();
            setCategoryRes(goodsCategory, categoryListRes);

            categoryListResList.add(categoryListRes);

        }
        return categoryListResList;

    }

    private void setCategoryRes(GoodsCategory goodsCategory, CategoryListRes categoryListRes) {
        categoryListRes.setCategoryName(goodsCategory.getCategoryName());
        categoryListRes.setCategorySeq(goodsCategory.getCategorySeq());
    }
    @Override
    public List<ItemListRes> itemList(ItemListReq itemListReq){
        List<ItemListRes> itemListResList = new ArrayList<>();
        if(itemListReq.getCategorySeq() == null){
            List<ItemVo> itemVoList = goodsItemMapper.selectAllItemVo();
            Map<Integer, List<Item>> hmap = new HashMap<>();
            for (int i = 0; i < itemVoList.size();i++) {
                if(!hmap.containsKey(itemVoList.get(i).getCategorySeq())){
                    List<Item> items = new ArrayList<>();
                    setItemtoItems(itemVoList, i, items);
                    hmap.put(itemVoList.get(i).getCategorySeq(), items);

                }
                else{
                    List<Item> items = hmap.get(itemVoList.get(i).getCategorySeq());
                    setItemtoItems(itemVoList, i, items);
                    hmap.replace(itemVoList.get(i).getCategorySeq(), items);
                }
            }
            for(Integer key: hmap.keySet()){
                ItemListRes itemListRes = new ItemListRes();
                itemListRes.setItems(hmap.get(key));
                itemListRes.setCategorySeq(key);
                itemListRes.setCategoryName(goodsCategoryMapper.selectByPrimaryKey(key).getCategoryName());
                itemListResList.add(itemListRes);
            }
        }else{
            List<ItemVo> itemVoList = goodsItemMapper.selectByCategorySeq(itemListReq.getCategorySeq());
            List<Item> items = new ArrayList<>();
            ItemListRes itemListRes = new ItemListRes();
            itemListRes.setCategorySeq(itemVoList.get(0).getCategorySeq());
            itemListRes.setCategoryName(itemVoList.get(0).getCategoryName());
            for (int i = 0; i < itemVoList.size();i++) {
                setItemtoItems(itemVoList, i, items);
            }
            itemListRes.setItems(items);
            itemListResList.add(itemListRes);
           }
        return itemListResList;
    }

    private void setItemtoItems(List<ItemVo> itemVoList, int i, List<Item> items) {
        Item item = new Item();
        item.setItemName(itemVoList.get(i).getItemName());
        item.setItemSeq(itemVoList.get(i).getItemSeq());
        items.add(item);
    }

}
