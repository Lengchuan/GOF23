package com.templateMethod;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-6
 */
public class DrawMoney extends BankTemplateMethod{
    /**
     * 办理具体的业务
     * 钩子方法
     */
    @Override
    public void transcat() {
        System.out.println("我要取钱！");
    }
}
