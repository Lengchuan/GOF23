package com.templateMethod;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-6
 */
public abstract class BankTemplateMethod {

    /**
     * 具体方法
     * 取号排队
     */
    public void takeNumber(){
        System.out.println("取号排队！");

    }

    /**
     * 办理具体的业务
     * 钩子方法(方法回调)
     */
    public  abstract void transcat();

    public void evaluate(){
        System.out.println("反馈评分！");
    }

    /**
     * 模板方法
     * 把基本操作组合到一起，子类一般不能重写
     */
    public final void process(){
        this.takeNumber();
        this.transcat();//延迟到子类来实现
        this.evaluate();

    }
}
