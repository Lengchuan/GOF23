package com.observer;

/**
 * 具体的目标对象
 * @authoor lengchuan
 * @date 16-6-6
 */
public class ConcreteSubject extends Subject{

    private  int state;

    public ConcreteSubject() {
    }

    public ConcreteSubject(int state) {
        this.state = state;
    }


    /**
     * 目标对象发生变化，请通知所有观察者
     * @param state
     */
    public void setState(int state)  {
        this.state = state;
        this.notifyAllObservers();
    }

    public int getState() {
        return state;
    }
}
