/**
 * 单例
 * 懒汉式
 * 线程安全，调用效率不高
 * @authoor lengchuan
 * @date 16-6-1
 */
public class SingletonDemo2 implements java.io.Serializable{

    private static SingletonDemo2 instance;

    private SingletonDemo2(){
        //防止反射漏洞
  /*      if (instance != null){

            throw new RuntimeException();
        }*/
    }

    public static synchronized SingletonDemo2 getInstance(){
        if (instance == null) {
            instance = new SingletonDemo2();
        }

        return instance;
    }
    //防止序列化和反序列化漏洞

}
