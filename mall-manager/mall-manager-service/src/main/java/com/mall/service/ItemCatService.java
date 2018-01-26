package com.mall.service;

import com.mall.common.pojo.EUTreeNode;

import java.util.List;

public interface ItemCatService {

    List<EUTreeNode> getCatList(long parentId);
}
