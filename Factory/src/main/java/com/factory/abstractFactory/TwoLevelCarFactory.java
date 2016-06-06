package com.factory.abstractFactory;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-1
 */
public class TwoLevelCarFactory implements CarFactory{
    public Engine createEngiine() {
        return new TwoLevelEngine();
    }

    public Chair createChair() {
        return new TwoLevelChair();
    }

    public Trye createTrye() {
        return new OneLevelTrye();
    }
}
