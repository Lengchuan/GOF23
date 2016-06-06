/**
 * 单例
 * 双重检测锁模式
 * 由于jvm内存模型和编译优化的原因，会导致两个同步块的顺序发生改变，不建议使用
 *
 * @authoor lengchuan
 * @date 16-6-1
 */
public class SingletonDemo3 implements java.io.Serializable{

    private static SingletonDemo3 instance ;

    private SingletonDemo3(){

        //防止反射漏洞
        if (instance != null){

            throw new RuntimeException();
        }
    }

    public static SingletonDemo3 getInstance(){
        if (instance == null){
            SingletonDemo3 singletonDemo3;
            synchronized (SingletonDemo3.class){
                singletonDemo3 = instance;

                if (singletonDemo3 == null){
                    synchronized (SingletonDemo3.class){
                        if (singletonDemo3 == null){
                            singletonDemo3 = new SingletonDemo3();
                        }
                    }
                    instance = singletonDemo3;
                }

            }
        }

        return instance;
    }

    //防止序列化和反序列化漏洞

}
