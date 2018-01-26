package com.mall.service;

import com.mall.pojo.EUDataGridResult;
import com.mall.pojo.TbItem;

public interface ItemService {

    TbItem getItemById(long id);

    EUDataGridResult getItemList(int page,int rows);

}
