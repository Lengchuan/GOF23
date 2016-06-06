package com.decorator;

/**
 * 会飞的车
 * @authoor lengchuan
 * @date 16-6-3
 */
public class FlyCar extends SuperCar{

    public FlyCar(ICar car) {
        super(car);
    }

    public  void fly(){
        System.out.println("天上飞");
    }

    @Override
    public void move() {
        fly();
        super.move();
    }
}
