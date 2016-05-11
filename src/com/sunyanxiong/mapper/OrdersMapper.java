package com.sunyanxiong.mapper;

import com.sunyanxiong.entities.OrdersCustom;

import java.util.List;

/**
 * Description: 代码
 * <p>
 * Created by daxiongit on 2016/5/11 0011.
 */
public interface OrdersMapper {

    // 查询订单信息
    public List<OrdersCustom> findOrdersResultType()throws Exception;

}
