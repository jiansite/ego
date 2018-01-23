package com.manager.mapping;

import com.manager.pojo.Tcontent_category;

public interface Tcontent_categoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Tcontent_category record);

    int insertSelective(Tcontent_category record);

    Tcontent_category selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tcontent_category record);

    int updateByPrimaryKey(Tcontent_category record);
}