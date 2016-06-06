package com.templateMethod;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-6
 */
public class TemplateMethodTest1 {

    public static void main(String[] args) {
        BankTemplateMethod bankTemplateMethod = new DrawMoney();
        bankTemplateMethod.process();

        //采用匿名内部类
        BankTemplateMethod bankTemplateMethod1 = new BankTemplateMethod() {
            @Override
            public void transcat() {
                System.out.println("我要存钱！");
            }
        };
        bankTemplateMethod1.process();


    }
}
