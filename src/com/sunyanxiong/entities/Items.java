package com.sunyanxiong.entities;

import java.util.Date;

/**
 * Description: 商品信息
 * <p>
 * Created by daxiongit on 2016/5/11 0011.
 */
public class Items {

    private int id;
    private String name;
    private float price;
    private String detail;
    private String pic;

    // 注意：订单中也有一个创建时间，而且这两个属性名相同，所以在写sql的时候加上别名
    private Date createtime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
