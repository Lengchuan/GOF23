package com.factory.abstractFactory;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-1
 */
public class OneLevelCarFactory implements CarFactory{
    public Chair createChair() {
        return new OneLevelChair();
    }

    public Engine createEngiine() {
        return new OneLevelEngine();
    }

    public Trye createTrye() {
        return new OneLevelTrye();
    }
}
