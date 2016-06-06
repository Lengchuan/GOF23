package com.mediator;

/**
 * 财务部
 * @authoor lengchuan
 * @date 16-6-6
 */
public class Finacial implements Department{

    private Mediator mediator;

    public Finacial(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("finacial",this);
    }

    /**
     * 做部门的事情
     */
    public void selfAction() {
        System.out.println("Finacial selfAction!");
    }

    /**
     * 向总经理的请求
     */
    public void outAction() {
        System.out.println("Finacial outAction!");
    }
}
