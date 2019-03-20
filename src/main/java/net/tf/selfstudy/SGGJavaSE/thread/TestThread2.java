package net.tf.selfstudy.SGGJavaSE.thread;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/3/18 20:50
 * @desc
 */
class Thread1 extends Thread {
    @Override
    public void run() {
        Thread.currentThread().setName("Thread1");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }

    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        Thread.currentThread().setName("Thread2");
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }

    }
}

public class TestThread2 {
    Thread1 thread1 = new Thread1();

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread2.start();
        thread1.start();

        new Thread() {
            @Override
            public void run() {
                System.out.println("xxx");
            }
        }.start();
    }
}
