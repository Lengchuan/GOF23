package com.adapter;

/**
 *  对象组合适配器方式
 * @description
 * @authoor lengchuan
 * @date 16-6-2
 */
public class Adapter2 implements  Target{

    private Adaptee adaptee;

    public void hanldSay() {

        adaptee.say();
    }

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
}
