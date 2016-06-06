package com.javaseObserver;

import java.util.Observable;

/**
 * 目标对象
 * @authoor lengchuan
 * @date 16-6-6
 */
public class ConcreteSubject extends Observable{
    private int state;

    public void setState(int state) {
        System.out.println("目标状态发生改变！");
        this.state = state;//目标状态发生改变
        setChanged();//目标对象已经做了更改
        notifyObservers(state);//通知所有的观察者
    }

    public int getState() {
        return state;
    }
}
