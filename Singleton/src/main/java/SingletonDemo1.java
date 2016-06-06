import sun.org.mozilla.javascript.internal.ast.TryStatement;

import java.io.FileOutputStream;

/**
 * 单例
 * 饿汉式
 * 线程安全，调用效率高
 * @authoor lengchuan
 * @date 16-6-1
 */
public class SingletonDemo1 implements java.io.Serializable{

    //类初始化的时候就加载这个对象，类在加载的时候本身就是线程安全的
    private static SingletonDemo1 instance = new SingletonDemo1();

    private SingletonDemo1(){

        //防止反射漏洞
      /*  if (instance !=null){

            throw new RuntimeException();
        }*/
    }

    public static SingletonDemo1 getInstance(){

        return instance;
    }

    //防止序列化和反序列化漏洞
    //实现readResolve()方法
/*
    private Object readResolve(){
        return instance;
    }*/


}
