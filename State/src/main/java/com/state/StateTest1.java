package com.state;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-6
 */
public class StateTest1 {

    public static void main(String[] args) {

        Context context = new Context();
        context.setState(new FreeState());
        context.setState(new BookedState());
    }
}
