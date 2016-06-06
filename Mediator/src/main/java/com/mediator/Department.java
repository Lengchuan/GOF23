package com.mediator;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-6
 */
public interface Department {

    /**
     * 做部门的事情
     */
    void selfAction();

    /**
     * 向总经理的请求
     */
    void outAction();
}
