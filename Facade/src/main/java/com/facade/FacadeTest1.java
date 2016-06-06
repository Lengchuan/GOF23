package com.facade;

/**
 *
 * @authoor lengchuan
 * @date 16-6-3
 */
public class FacadeTest1 {

    public static void main(String[] args) {

       // 不使用外观模式
        Person person1 = new Person("黄药师");
        Person person2 = new Person("洪七公");

        //喝茶

        //黄药师喝茶
        System.out.println("------"+person1.getName()+"----");
        Teacup teacup = new Teacup();
        teacup.task();
        Tea tea = new Tea();
        tea.task();
        Water water = new Water();
        water.task();

        //洪七公喝茶
        System.out.println("------"+person2.getName()+"----");
        teacup.task();
        tea.task();
        water.task();


        //使用外观模式
        Waiter waiter = new Waiter();
        //黄药师喝茶
        System.out.println("------"+person1.getName()+"----");
        waiter.task();
        //洪七公喝茶
        System.out.println("------"+person2.getName()+"----");
        waiter.task();



    }
}
