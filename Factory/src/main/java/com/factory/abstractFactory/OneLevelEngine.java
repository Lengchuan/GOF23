package com.factory.abstractFactory;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-1
 */
public class OneLevelEngine implements Engine{
    public void run() {
        System.out.println("一级发动机run");
    }

    public void start() {
        System.out.println("一级发动机start");
    }
}
