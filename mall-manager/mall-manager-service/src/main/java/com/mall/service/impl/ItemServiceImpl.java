package com.mall.service.impl;

import com.mall.mapper.TbItemMapper;
import com.mall.pojo.TbItem;
import com.mall.pojo.TbItemExample;
import com.mall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper tbItemMapper;

    @Override
    public TbItem getItemById(long id) {

        //第一种查询方式
        //TbItem tbItem=tbItemMapper.selectByPrimaryKey(id);

        //第二种查询方式
        TbItemExample example=new TbItemExample();
        TbItemExample.Criteria criteria=example.createCriteria();
        criteria.andIdEqualTo(id);

        List<TbItem> list= tbItemMapper.selectByExample(example);

        if(list!=null && list.size()>0){
            TbItem item=list.get(0);
            return item;
        }

        return null;
    }
}
