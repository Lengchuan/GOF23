package com.facade;

/**
 * 店小二
 * @authoor lengchuan
 * @date 16-6-3
 */
public class Waiter {

    public  void  task(){
        System.out.println("店小二来泡茶");
        Teacup teacup = new Teacup();
        teacup.task();

        Tea tea = new Tea();
        tea.task();

        Water water = new Water();
        water.task();
    }
}
