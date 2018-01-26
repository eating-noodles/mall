package com.mall.controller;


import com.mall.pojo.EUDataGridResult;
import com.mall.pojo.TbItem;
import com.mall.service.impl.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class ItemControllerTest{

    @Resource
    private ItemServiceImpl itemServiceImpl;

    @RequestMapping("/item/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable long itemId){

        TbItem item=itemServiceImpl.getItemById(itemId);

        return item;
    }

    @RequestMapping("/item/list")
    @ResponseBody
    public EUDataGridResult getItemList(Integer page,Integer rows){
        EUDataGridResult result=itemServiceImpl.getItemList(page,rows);
        return result;
    }


}
