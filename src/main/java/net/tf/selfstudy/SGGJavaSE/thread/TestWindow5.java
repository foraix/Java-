package net.tf.selfstudy.SGGJavaSE.thread;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/3/20 23:22
 * @desc
 */
public class TestWindow5 extends Thread{
    private int ticket = 100;
    static Object object = new Object();
    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(10 );
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "出售了一张票,当前剩余：" + ticket-- + "张");
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        TestWindow5 testWindow5 = new TestWindow5();
        Thread thread1 = new Thread(testWindow5);
        Thread thread2 = new Thread(testWindow5);
        Thread thread3 = new Thread(testWindow5);
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
