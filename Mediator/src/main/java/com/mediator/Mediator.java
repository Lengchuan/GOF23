package com.mediator;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-6
 */
public interface Mediator {

    void register(String dname,Department department);

    void command(String dname);

}
