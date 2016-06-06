package com.prototype;

/**
 * 效率测试
 * @authoor lengchuan
 * @date 16-6-2
 */
public class PrototypeTest4  implements Cloneable{

    public PrototypeTest4() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static  void test1(int num){
        long start = System.currentTimeMillis();
            for (int i = 0;i<num;i++){
                PrototypeTest4 test4 = new PrototypeTest4();
            }
        long end = System.currentTimeMillis();

        System.out.println("new ："+(end-start));
    }

    public static  void test2(int num){
        long start = System.currentTimeMillis();
        PrototypeTest4 test4 = new PrototypeTest4();
        for (int i = 0;i<num;i++){
            try {
                PrototypeTest4  prototypeTest4 = (PrototypeTest4)test4.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        long end = System.currentTimeMillis();

        System.out.println("clone ："+(end-start));
    }

    public static void main(String[] args) {
        PrototypeTest4.test1(1000);
        PrototypeTest4.test2(1000);
    }

}
