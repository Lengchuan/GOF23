package com.factory.abstractFactory;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-1
 */
public class AbstractFactoryTest1 {

    public static void main(String[] args) {
        CarFactory carFactory = new OneLevelCarFactory();
        Engine engine = carFactory.createEngiine();
        engine.run();
        engine.start();
    }
}
