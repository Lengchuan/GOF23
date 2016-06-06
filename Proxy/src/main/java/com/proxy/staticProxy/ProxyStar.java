package com.proxy.staticProxy;

/**
 * 代理角色
 * @authoor lengchuan
 * @date 16-6-2
 */
public class ProxyStar implements Star{

    private Star star;

    public ProxyStar(Star star) {
        this.star = star;
    }

    /**
     * 面谈
     */
    public void confer() {
        System.out.println("代理角色面谈");
    }

    /**
     * 唱歌
     */
    public void sing() {
        star.sing();
    }

    /**
     * 收钱
     */
    public void collect() {
        System.out.println("代理角色收钱");
    }
}
