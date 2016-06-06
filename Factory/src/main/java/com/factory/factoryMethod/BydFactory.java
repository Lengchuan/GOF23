package com.factory.factoryMethod;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-1
 */
public class BydFactory implements CarFactory{
    public Car createCar() {
        return new Byd();
    }
}
