package com.command;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-6
 */
public class ConcreteCommand implements Command{

    private  Receier receier;

    public ConcreteCommand(Receier receier) {
        this.receier = receier;
    }

    public void execute() {
        System.out.println("命令真正执行前");
        receier.action();
        System.out.println("命令真正执行后");
    }
}
