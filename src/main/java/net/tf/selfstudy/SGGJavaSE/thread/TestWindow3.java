package net.tf.selfstudy.SGGJavaSE.thread;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/3/20 23:00
 * @desc
 */
class TestWindow4 implements Runnable {

    private int ticket = 100;
    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "出售了一张票,当前剩余：" + ticket-- + "张");
                } else {
                    break;
                }
            }
        }
    }
}

public class TestWindow3 {
    public static void main(String[] args) {
        TestWindow5 testWindow = new TestWindow5();

        Thread thread1 = new Thread(testWindow);
        Thread thread2 = new Thread(testWindow);
        Thread thread3 = new Thread(testWindow);

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
