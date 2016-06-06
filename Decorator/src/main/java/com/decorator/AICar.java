package com.decorator;

/**
 * 智能车
 * @authoor lengchuan
 * @date 16-6-3
 */
public class AICar extends SuperCar{

    public AICar(ICar car) {
        super(car);
    }

    public  void AI(){
        System.out.println("智能");
    }

    @Override
    public void move() {
        AI();
        super.move();
    }
}
