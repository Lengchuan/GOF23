package com.factory.factoryMethod;

/**
 * 工厂方法
 * @authoor lengchuan
 * @date 16-6-1
 */
public class FactoryMethodTest1 {

    public static void main(String[] args) {
        Car audi = new AudiFactory().createCar();
        Car byd = new BydFactory().createCar();
        Car benz = new BenzFactory().createCar();

        audi.run();
        byd.run();
        benz.run();

    }
}
