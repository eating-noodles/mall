package com.mall.service.impl;

import com.mall.common.pojo.EUTreeNode;
import com.mall.mapper.TbItemCatMapper;
import com.mall.pojo.TbItemCat;
import com.mall.pojo.TbItemCatExample;
import com.mall.service.ItemCatService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ItemCatServiceImpl implements ItemCatService{

    @Resource
    private TbItemCatMapper tbItemCatMapper;


    @Override
    public List<EUTreeNode> getCatList(long parentId) {

        TbItemCatExample example=new TbItemCatExample();
        TbItemCatExample.Criteria criteria=example.createCriteria();

        criteria.andParentIdEqualTo(parentId);

        List<TbItemCat> list=tbItemCatMapper.selectByExample(example);

        List<EUTreeNode> resultlist=new ArrayList<>();

        for (TbItemCat o:list) {
            EUTreeNode e=new EUTreeNode();
            e.setId(o.getId());
            e.setText(o.getName());
            e.setState(o.getIsParent()?"closed":"open");
            resultlist.add(e);
        }

        return resultlist;
    }
}
