package com.mediator;

/**
 * 市场部
 * @authoor lengchuan
 * @date 16-6-6
 */
public class Market implements Department{

    private Mediator mediator;

    public Market(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("market",this);
    }

    /**
     * 做部门的事情
     */
    public void selfAction() {
        System.out.println("Market selfAction!");
        mediator.command("development");

    }

    /**
     * 向总经理的请求
     */
    public void outAction() {
        System.out.println("Market outAction！");

    }
}
