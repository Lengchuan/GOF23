package com.chainOfResponsibility;

/**
 * CEO
 * @authoor lengchuan
 * @date 16-6-3
 */
public class CEO extends Leader{
    public CEO(String name) {
        super(name);
    }

    @Override
    public void handle(LeaveStrip leaveStrip) {

        if (leaveStrip.getDays()>10){

            System.out.println("大于10天，CEO审批！");
        }
    }
}
