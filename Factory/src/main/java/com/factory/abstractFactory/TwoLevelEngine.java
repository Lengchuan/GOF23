package com.factory.abstractFactory;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-1
 */
public class TwoLevelEngine implements Engine{
    public void run() {
        System.out.println("二级发动机run");
    }

    public void start() {
        System.out.println("二级发动机start");
    }

}
