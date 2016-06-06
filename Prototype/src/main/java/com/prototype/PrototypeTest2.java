package com.prototype;

import java.util.Date;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-2
 */
public class PrototypeTest2 {

    public static void main(String[] args) {

        //深克隆，同时克隆对象属性中的对象
        Date date = new Date(1234567L);
        Ship2 s1 = new Ship2("多利的母亲",date);
        System.out.println(s1);
        System.out.println(s1.getDate());

        try {
            Ship2 s2 = (Ship2) s1.clone();
            s1.setDate(new Date(111111111111111L));
            System.out.println(s1.getDate());
            s2.setName("多利");
            System.out.println(s2);
            System.out.println(s2.getName());
            System.out.println(s2.getDate());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
