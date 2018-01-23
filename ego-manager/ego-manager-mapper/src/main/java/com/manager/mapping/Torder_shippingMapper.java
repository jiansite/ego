package com.manager.mapping;

import com.manager.pojo.Torder_shipping;

public interface Torder_shippingMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(Torder_shipping record);

    int insertSelective(Torder_shipping record);

    Torder_shipping selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(Torder_shipping record);

    int updateByPrimaryKey(Torder_shipping record);
}