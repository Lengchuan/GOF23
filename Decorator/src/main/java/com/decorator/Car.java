package com.decorator;

/**
 * 真实对象（被装饰的对象）
 * @authoor lengchuan
 * @date 16-6-3
 */
public class Car implements ICar{
    public void move() {
        System.out.println("车在跑");
    }
}
