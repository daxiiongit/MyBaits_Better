package com.sunyanxiong.entities;

import java.util.Date;

/**
 * Description: 代码
 * <p>
 * Created by daxiongit on 2016/5/11 0011.
 */
public class OrdersCustom extends Orders {

    // 将关联查询的用户信息扩展到这里
    private String username;
    private Date birthday;
    private String sex;

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

    @Override
    public String toString() {
        return "OrdersCustom{" +
                "username='" + username + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                '}';
    }
}
