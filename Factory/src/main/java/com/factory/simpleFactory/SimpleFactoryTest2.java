package com.factory.simpleFactory;

/**
 * 使用工厂模式
 *
 * 简单工厂模式违背了开闭原则
 * @authoor lengchuan
 * @date 16-6-1
 */
public class SimpleFactoryTest2 {

    public static void main(String[] args) {

       /* Car audi = new Audi();
        Car byd = new Byd();

        audi.run();
        byd.run();*/


        CarFactory.createCar("audi").run();
        CarFactory.createCar("byd").run();

    }
}
