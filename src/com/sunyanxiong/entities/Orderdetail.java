package com.sunyanxiong.entities;

/**
 * Description: 订单详细信息
 * <p>
 * Created by daxiongit on 2016/5/11 0011.
 */
public class Orderdetail {

    private int id;
    private Integer orders_id;
    private Integer items_id;
    private Integer items_num;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getOrders_id() {
        return orders_id;
    }

    public void setOrders_id(Integer orders_id) {
        this.orders_id = orders_id;
    }

    public Integer getItems_id() {
        return items_id;
    }

    public void setItems_id(Integer items_id) {
        this.items_id = items_id;
    }

    public Integer getItems_num() {
        return items_num;
    }

    public void setItems_num(Integer items_num) {
        this.items_num = items_num;
    }

    @Override
    public String toString() {
        return "Orderdetail{" +
                "id=" + id +
                ", orders_id=" + orders_id +
                ", items_id=" + items_id +
                ", items_num=" + items_num +
                '}';
    }
}
