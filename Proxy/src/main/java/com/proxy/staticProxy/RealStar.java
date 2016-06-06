package com.proxy.staticProxy;

/**
 * 真实角色
 * @authoor lengchuan
 * @date 16-6-2
 */
public class RealStar implements Star{
    /**
     * 面谈
     */
    public void confer() {
        System.out.println("真实角色面谈");
    }

    /**
     * 唱歌
     */
    public void sing() {
        System.out.println("真实角色唱歌");
    }

    /**
     * 收钱
     */
    public void collect() {
        System.out.println("真实角色收钱");
    }
}
