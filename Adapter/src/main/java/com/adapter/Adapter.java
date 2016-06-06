package com.adapter;

/**
 * 适配器
 * 类适配器方式
 * @authoor lengchuan
 * @date 16-6-2
 */
public class Adapter extends Adaptee implements Target{


    //适配过程
    public void hanldSay() {
        super.say();
    }
}
