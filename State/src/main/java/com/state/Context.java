package com.state;

/**
 * 上下文类
 * 维持不同状态之间的切换
 * @authoor lengchuan
 * @date 16-6-6
 */
public class Context {

    private  State state;

    public void setState(State state) {
        System.out.println("修改状态！");
        this.state = state;
        state.handle();
    }
}
