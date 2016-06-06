package com.strategy;

/**
 * 负责和具体的策略类实现
 *  算法和客户端调用分离
 * @authoor lengchuan
 * @date 16-6-6
 */
public class Context {

    /**
     * 当前采用的算法策略
     */
    private  Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void printPrice(double price){
        System.out.println("价格是：-->"+strategy.getPrice(price));
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
