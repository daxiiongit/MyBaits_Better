package com.sunyanxiong.mapper;

import com.sunyanxiong.entities.Orderdetail;
import com.sunyanxiong.entities.Orders;
import com.sunyanxiong.entities.OrdersCustom;
import com.sunyanxiong.entities.User;

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

    // 查询用户信息及购买的商品信息
    public List<User> findUserAndItems()throws Exception;

    // 根据id查找用户信息
    public User findUserById(int id) throws Exception;

    // 查询订单信息，关联查询订单信息，延迟加载
    public List<Orders> findOrdersLoadingLazy()throws Exception;


}
