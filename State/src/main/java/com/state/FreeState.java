package com.state;

/**
 * 空闲状态
 * @authoor lengchuan
 * @date 16-6-6
 */
public class FreeState implements State{
    public void handle() {
        System.out.println("房间空闲!");
    }
}
