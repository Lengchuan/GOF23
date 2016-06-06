package com.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-2
 */
public class StarHandler implements InvocationHandler{

    private  Star star;

    public StarHandler(Star star) {
        this.star = star;
    }

    /**
     * 实现invoke()
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理类--------");
        //在这里可以做相关处理
        method.invoke(star,args);
        return null;
    }
}
