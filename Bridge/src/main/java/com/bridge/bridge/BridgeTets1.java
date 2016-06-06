package com.bridge.bridge;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-2
 */
public class BridgeTets1 {

    public static void main(String[] args) {

        //联想台式机
        Brand lenvo = new Lenvo();
        Computer computer1 = new Desktop(lenvo);

        Brand dell = new Dell();
        Computer computer2 = new Desktop(dell);
        computer1.sale();
        computer2.sale();
    }
}
