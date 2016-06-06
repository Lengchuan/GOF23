package com.strategy;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-6
 */
public class OldCustomerFewStrategy implements Strategy{

    public double getPrice(double standarPrice) {
        System.out.println("打八五折！");
        return standarPrice*0.85;
    }
}
