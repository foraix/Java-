package net.tf.selfstudy.SGGJavaSE.thread;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/3/19 15:44
 * @desc
 */
class TestWindow2 implements Runnable{
    @Override
    public void run() {
        int ticket = 100;
        while (true) {
            if (ticket >= 1) {
                System.out.println(Thread.currentThread().getName() + "出售了一张票,当前剩余：" + ticket-- + "张");
            } else {
                break;
            }
        }
    }
}

public class TestWindow1 {
    public static void main(String[] args) {
        TestWindow2 testWindow = new TestWindow2();

        Thread thread1 = new Thread(testWindow);
        Thread thread2 = new Thread(testWindow);
        Thread thread3 = new Thread(testWindow);

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
