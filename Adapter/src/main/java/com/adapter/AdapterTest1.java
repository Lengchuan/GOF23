package com.adapter;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-2
 */
public class AdapterTest1 {

    public void  test1(Target target){
        target.hanldSay();
    }

    public static void main(String[] args) {
        AdapterTest1 test1 = new AdapterTest1();

        Target target = new Adapter();

        test1.test1(target);
        Adaptee  adaptee = new Adaptee();
        Target target2 = new Adapter2(adaptee);

        test1.test1(target2);



    }

}
