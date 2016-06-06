package com.proxy.staticProxy;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-2
 */
public class StaticProxyTest1 {

    public static void main(String[] args) {

            Star real = new RealStar();
            Star proxy = new ProxyStar(real);

            proxy.confer();
            proxy.sing();
            proxy.collect();
    }
}
