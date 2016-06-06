package com.state;

/**
 * 已预定状态
 * @authoor lengchuan
 * @date 16-6-6
 */
public class BookedState implements State{
    public void handle() {
        System.out.println("房间已预定!");
    }
}
