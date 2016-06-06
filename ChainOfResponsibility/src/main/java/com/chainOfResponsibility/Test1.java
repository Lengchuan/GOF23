package com.chainOfResponsibility;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-3
 */
public class Test1 {

    public static void main(String[] args) {
        Leader a = new Director("张三");
        Leader b = new Manager("李四");
        Leader c = new CEO("王五");

        a.setNextLeader(b);
        b.setNextLeader(c);

        LeaveStrip leaveStrip = new LeaveStrip("请假","王麻子",30);
        a.handle(leaveStrip);
    }
}
