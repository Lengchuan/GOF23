package com.state;

/**
 * 已入住状态
 * @authoor lengchuan
 * @date 16-6-6
 */
public class CheckedInState implements State{
    public void handle() {
        System.out.println("房间已入住!");
    }
}
