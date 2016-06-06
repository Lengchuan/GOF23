package com.prototype;

import java.util.Date;

/**
 * 多利羊
 * @authoor lengchuan
 * @date 16-6-2
 */
public class Ship2 implements Cloneable{

    private  String name;

    private Date date;

    public Ship2(String name, Date date) {
        this.date = date;
        this.name = name;
    }

    public Ship2() {
    }

    /**
     * 重写clone()方法
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {

        Object o = super.clone();//直接调用Object类的clone()方法

        //深克隆
        Ship2 s = (Ship2) o;
        //同时对属性进行克隆
        s.setDate((Date) this.date.clone());
        return s;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
