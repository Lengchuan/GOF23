package com.observer;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-6
 */
public class ObserverA implements Observer{

    private int mystate;//mystate需要跟目标对象的state的值一致
    public void update(Subject subject) {
        mystate=((ConcreteSubject)subject).getState();
        System.out.println("观察者更新状态！"+mystate);
    }

    public int getMystate() {
        return mystate;
    }

    public void setMystate(int mystate) {
        this.mystate = mystate;
    }
}
