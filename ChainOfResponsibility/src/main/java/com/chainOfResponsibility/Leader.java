package com.chainOfResponsibility;

/**
 * 抽象类
 * @authoor lengchuan
 * @date 16-6-3
 */
public abstract class Leader {

    protected String name;

    protected Leader nextLeader;//责任链上的后继对象

    public Leader(String name) {
        this.name = name;
    }

    //设定后继对象
    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    public abstract void handle(LeaveStrip leaveStrip);

}
