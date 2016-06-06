package com.strategy;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-6
 */
public class StrategyTest1 {

    public static void main(String[] args) {
        Strategy strategy1 = new OldCustomerFewStrategy();
        Context context = new Context(strategy1);
        context.printPrice(1000);
    }
}
