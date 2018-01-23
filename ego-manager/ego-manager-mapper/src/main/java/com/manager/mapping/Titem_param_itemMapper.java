package com.manager.mapping;

import com.manager.pojo.Titem_param_item;

public interface Titem_param_itemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Titem_param_item record);

    int insertSelective(Titem_param_item record);

    Titem_param_item selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Titem_param_item record);

    int updateByPrimaryKeyWithBLOBs(Titem_param_item record);

    int updateByPrimaryKey(Titem_param_item record);
}