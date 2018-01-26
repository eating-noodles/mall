package com.mall.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mall.mapper.TbItemMapper;

import com.mall.pojo.TbItem;
import com.mall.pojo.TbItemExample;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class TestPagerHelper {


    @Test
    public void testPagerHelper(){

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");

        TbItemMapper tbItemMapper=applicationContext.getBean(TbItemMapper.class);

        TbItemExample tbItemExample=new TbItemExample();

        PageHelper.startPage(1,10);
        List<TbItem> list=tbItemMapper.selectByExample(tbItemExample);

        for (TbItem o:list
             ) {
            System.out.println(o.getTitle());
        }

        PageInfo<TbItem> pageInfo=new PageInfo<>(list);
        long total=pageInfo.getTotal();

        System.out.println("总数为"+total);


    }


}
