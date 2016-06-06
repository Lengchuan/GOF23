/**
 * 单例
 * 静态内部类
 * @authoor lengchuan
 * @date 16-6-1
 */
public class SingletonDemo4 implements java.io.Serializable{

    private static class SingletonInstance{

        private static final SingletonDemo4 instance = new SingletonDemo4();
    }

    private SingletonDemo4(){
    }

    public static SingletonDemo4 getInstance(){

        return SingletonInstance.instance;
    }

}
