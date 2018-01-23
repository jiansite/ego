package com.manager.mapping;

import com.manager.pojo.Titem_param;

public interface Titem_paramMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Titem_param record);

    int insertSelective(Titem_param record);

    Titem_param selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Titem_param record);

    int updateByPrimaryKeyWithBLOBs(Titem_param record);

    int updateByPrimaryKey(Titem_param record);
}