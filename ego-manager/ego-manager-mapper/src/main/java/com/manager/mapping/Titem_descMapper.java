package com.manager.mapping;

import com.manager.pojo.Titem_desc;

public interface Titem_descMapper {
    int deleteByPrimaryKey(Long itemId);

    int insert(Titem_desc record);

    int insertSelective(Titem_desc record);

    Titem_desc selectByPrimaryKey(Long itemId);

    int updateByPrimaryKeySelective(Titem_desc record);

    int updateByPrimaryKeyWithBLOBs(Titem_desc record);

    int updateByPrimaryKey(Titem_desc record);
}