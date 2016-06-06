package com.prototype;

import java.util.Date;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-2
 */
public class PrototypeTest1 {

    public static void main(String[] args) {


        //浅克隆
        Date date = new Date(1234567L);
        Ship s1 = new Ship("多利的母亲",date);
        System.out.println(s1);

        try {
             Ship s2 = (Ship) s1.clone();
            s2.setName("多利");
            System.out.println(s2);
            System.out.println(s2.getName());
            System.out.println(s2.getDate());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
