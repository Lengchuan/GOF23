package com.strategy;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-6
 */
public class OldCustomerManyStrategy implements Strategy{

    public double getPrice(double standarPrice) {
        System.out.println("打八折！");
        return standarPrice*0.8;
    }
}
