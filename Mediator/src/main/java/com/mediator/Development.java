package com.mediator;

/**
 * 研发部
 * @authoor lengchuan
 * @date 16-6-6
 */
public class Development implements Department{


    /**
     * 持有中介者的引用
     */
    private Mediator mediator;

    public Development(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("development",this);
    }

    /**
     * 做部门的事情
     */
    public void selfAction() {
        System.out.println("Development selfAction！");
    }

    /**
     * 向总经理的请求
     */
    public void outAction() {
        System.out.println("Development outAction！");
    }
}
