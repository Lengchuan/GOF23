package com.decorator;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-3
 */
public class DecoractorTest1 {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.move();

        System.out.println("增加新的功能---在天上飞");
        FlyCar flyCar = new FlyCar(car1);
        flyCar.move();

        System.out.println("增加新的功能---智能车");
        AICar aiCar = new AICar(car1);
        aiCar.move();

    }
}
