package com.sunyanxiong.entities;

import org.apache.logging.log4j.core.config.Order;

import java.util.Date;
import java.util.List;

/**
 * Description: 购买商品的用户信息
 * <p>
 * Created by daxiongit on 2016/5/11 0011.
 */
public class User {

    private int id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;

    // 查询用户及商品信息
    private List<Order> orders;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", orders='" + orders + '\'' +
                '}';
    }
}
