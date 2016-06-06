package com.decorator;

/**
 * 装饰器
 * @authoor lengchuan
 * @date 16-6-3
 */
public class SuperCar implements ICar{
    private ICar car;

    public SuperCar() {
    }

    public SuperCar(ICar car) {
        this.car = car;
    }

    public void move() {
        car.move();
    }

    public ICar getCar() {
        return car;
    }

    public void setCar(ICar iCar) {
        this.car = iCar;
    }
}
