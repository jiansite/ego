package com.manager.mapping;

import com.manager.pojo.Torder_item;

public interface Torder_itemMapper {
    int deleteByPrimaryKey(String id);

    int insert(Torder_item record);

    int insertSelective(Torder_item record);

    Torder_item selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Torder_item record);

    int updateByPrimaryKey(Torder_item record);
}