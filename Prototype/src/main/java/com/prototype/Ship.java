package com.prototype;

import java.util.Date;

/**
 * 多利羊
 * @authoor lengchuan
 * @date 16-6-2
 */
public class Ship implements Cloneable,java.io.Serializable{

    private  String name;

    private Date date;

    public Ship(String name, Date date) {
        this.date = date;
        this.name = name;
    }

    public Ship() {
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
        return o;
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
