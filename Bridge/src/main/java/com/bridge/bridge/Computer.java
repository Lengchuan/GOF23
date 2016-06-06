package com.bridge.bridge;

/**
 *  多继承方式与桥接模式对比
 *  桥接模式使得多维变化的场景,让某个维度在其维度上变化，而不会影响到其它维度
 * @authoor lengchuan
 * @date 16-6-2
 */
public class Computer {

    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void sale(){
        brand.sale();
    }
}
