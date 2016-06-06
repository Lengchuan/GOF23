package com.command;

/**
 * 命令的调用者和发起者
 * @authoor lengchuan
 * @date 16-6-6
 */
public class Invoke {

    private Command command;

    public Invoke(Command command) {
        this.command = command;
    }

    public void  call(){

        command.execute();
    }
}
