package com.bridge.bridge;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-2
 */
public class Desktop extends Computer{

    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        brand.sale();
        System.out.println("台式机");
    }
}
