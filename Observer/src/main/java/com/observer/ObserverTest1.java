package com.observer;


/**
 * @description
 * @authoor lengchuan
 * @date 16-6-6
 */
public class ObserverTest1 {
    public static void main(String[] args) {

        //目标对象
        ConcreteSubject subject = new ConcreteSubject();

        //创建多个观察者
        Observer observer1 = new ObserverA();
        Observer observer2 = new ObserverA();
        Observer observer3 = new ObserverA();

        //让这三个观察者添加subject对象的观察者队列
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);

        //改变状态
        subject.setState(300);

        System.out.println(((ObserverA)observer1).getMystate());
        System.out.println(((ObserverA)observer2).getMystate());
        System.out.println(((ObserverA)observer3).getMystate());
    }
}
