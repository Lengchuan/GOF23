package com.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-2
 */
public class PrototypeTest3 {

    public static void main(String[] args) {


        //序列化和反序列话实现深度克隆
        Date date = new Date(1234567L);
        Ship s1 = new Ship("多利的母亲",date);
        System.out.println(s1);

        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);

            oos.writeObject(s1);
            byte[] bytes = bos.toByteArray();
            ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
            ObjectInputStream ois = new ObjectInputStream(bis);
            Ship s2 = (Ship) ois.readObject();

            System.out.println(s1.getDate());
            s1.setDate(new Date(2222222222222222222L));
            System.out.println(s1.getDate());
            System.out.println(s2);
            System.out.println(s2.getDate());
        }catch (Exception e){

            e.printStackTrace();
        }



    }

}
