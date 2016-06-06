import java.util.concurrent.CountDownLatch;

/**
 * 测试效率
 * @authoor lengchuan
 * @date 16-6-1
 */
public class SingletonDemoTest2 {

    public static void main(String[] args){

        long start = System.currentTimeMillis();
        int count = 10;
        final CountDownLatch countDownLatch =new CountDownLatch(count);
        for (int i = 0;i<count;i++){
            new Thread(new Runnable() {
                public void run() {
                    for (int i= 0;i<100000;i++){
                        Object o =SingletonDemo4.getInstance();
                    }
                    countDownLatch.countDown();

                }
            }).start();
        }

        //阻塞main
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();

        System.out.println("执行时间："+(end-start));
    }
}
