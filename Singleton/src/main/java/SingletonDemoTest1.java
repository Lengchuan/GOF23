import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-1
 */
public class SingletonDemoTest1 {

    public static void main(String[] args)  {

        SingletonDemo1 s1 = SingletonDemo1.getInstance();
        SingletonDemo1 s2 = SingletonDemo1.getInstance();
        System.out.println(s1==s2);

        System.out.println("反射破解--------------------");
        //防止反射破解单例模式
        try {

            Class<SingletonDemo1> clzz = (Class<SingletonDemo1>) Class.forName("SingletonDemo1");
            Constructor c = clzz.getDeclaredConstructor(null);
            //跳过权限验证
            c.setAccessible(true);
            SingletonDemo1 s3 =(SingletonDemo1)c.newInstance(null);
            SingletonDemo1 s4 =(SingletonDemo1)c.newInstance(null);

            System.out.println(s3==s4);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


        System.out.println("序列化和反序列化破解");
        //防止序列化和反序列化获取
        try {

            FileOutputStream fos = new FileOutputStream("Singleton/test.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.close();
            fos.close();
            FileInputStream fis = new FileInputStream("Singleton/test.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            SingletonDemo1 s5 = (SingletonDemo1)ois.readObject();
            System.out.println(s5==s1);
            ois.close();
            fis.close();

        }catch (Exception e){

        }


    }
}
