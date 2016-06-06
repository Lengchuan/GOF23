package com.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-6
 */
public class Subject {
    protected List<Observer>  observerList = new ArrayList<Observer>();

    public void addObserver(Observer observer){
        observerList.add(observer);

    }

    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }

    /**
     * 通知所有观察者更新状态
     */
    public void notifyAllObservers(){
        for (Observer observer : observerList){
            observer.update(this);
        }

    }
}
