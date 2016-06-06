package com.factory.simpleFactory;

/**
 * car 工厂类
 * @authoor lengchuan
 * @date 16-6-1
 */
public class CarFactory {

    public static Car createCar(String carType){

        if ("audi".equals(carType)){
            return new Audi();
        }else {
            return new Byd();
        }
    }

    //或者

    public static  Car createAudi(){
        return new Audi();
    }

    public static Car createByd(){
        return  new Byd();
    }
}
