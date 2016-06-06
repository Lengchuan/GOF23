package com.chainOfResponsibility;

/**
 * 经理
 * @authoor lengchuan
 * @date 16-6-3
 */
public class Manager extends Leader{
    public Manager(String name) {
        super(name);
    }

    @Override
    public void handle(LeaveStrip leaveStrip) {

        if (leaveStrip.getDays()<10){

            System.out.println("小于10天，经理审批！");
        }else {
            System.out.println("大于10天，经理无权审批,交给CEO审批");
            nextLeader.handle(leaveStrip);
        }
    }
}
