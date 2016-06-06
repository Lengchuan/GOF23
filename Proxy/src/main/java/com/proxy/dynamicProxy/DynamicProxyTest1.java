package com.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-2
 */
public class DynamicProxyTest1 {

    public static void main(String[] args) {

        Star real = new RealStar();
        StarHandler starHandler = new StarHandler(real);
        Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Star.class},starHandler);
        proxy.collect();
        proxy.sing();
        proxy.confer();
    }
}
