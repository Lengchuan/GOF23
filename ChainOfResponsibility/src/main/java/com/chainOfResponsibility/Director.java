package com.chainOfResponsibility;

/**
 * 主任
 * @authoor lengchuan
 * @date 16-6-3
 */
public class Director extends Leader{
    public Director(String name) {
        super(name);
    }

    @Override
    public void handle(LeaveStrip leaveStrip) {

        if (leaveStrip.getDays()<3){

            System.out.println("小于三天，主任审批！");
        }else {
            System.out.println("大于三天，主任无权审批,交给经理审批");
            nextLeader.handle(leaveStrip);
        }
    }
}
