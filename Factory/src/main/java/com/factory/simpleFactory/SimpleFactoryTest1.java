package com.factory.simpleFactory;

/**
 * 没有使用工厂模式
 * @authoor lengchuan
 * @date 16-6-1
 */
public class SimpleFactoryTest1 {

    public static void main(String[] args) {

        Car audi = new Audi();
        Car byd = new Byd();

        audi.run();
        byd.run();

    }
}
