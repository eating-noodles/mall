package com.mall.controller;


import com.mall.common.pojo.EUTreeNode;
import com.mall.service.ItemCatService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/item/cat")
public class ItemCatController {


    @Resource
    private ItemCatService itemCatService;

    @RequestMapping("/list")
    @ResponseBody
    public List<EUTreeNode> getCatList(@RequestParam(value = "id",defaultValue = "0")long parentid){

        List<EUTreeNode> list=itemCatService.getCatList(parentid);

        return list;
    }


}
