package com.manager.mapping;

import com.manager.pojo.Titem_cat;

public interface Titem_catMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Titem_cat record);

    int insertSelective(Titem_cat record);

    Titem_cat selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Titem_cat record);

    int updateByPrimaryKey(Titem_cat record);
}