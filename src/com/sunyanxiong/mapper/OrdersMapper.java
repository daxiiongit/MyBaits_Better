package com.sunyanxiong.mapper;

import com.sunyanxiong.entities.Orderdetail;
import com.sunyanxiong.entities.Orders;
import com.sunyanxiong.entities.OrdersCustom;

import java.util.List;

/**
 * Description: 代码
 * <p>
 * Created by daxiongit on 2016/5/11 0011.
 */
public interface OrdersMapper {

    // 查询订单信息（resultType）
    public List<OrdersCustom> findOrdersResultType()throws Exception;

    // 查询订单信息（resultMap）
    public List<Orders> findOrdersResultMap()throws Exception;

    // 查询订单及订单详情
    public List<Orderdetail> findOrdersAndOrderdetailResultMap()throws Exception;


}
