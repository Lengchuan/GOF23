package com.command;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-6
 */
public class CommandTest1 {

    public static void main(String[] args) {
        Command command = new ConcreteCommand(new Receier());
        Invoke invoke = new Invoke(command);
        invoke.call();
    }
}
