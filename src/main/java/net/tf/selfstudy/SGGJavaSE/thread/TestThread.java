package net.tf.selfstudy.SGGJavaSE.thread;

import javafx.scene.layout.Priority;
import org.junit.Test;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/3/17 21:56
 * @desc 线程的创建
 */
class SubThread extends Thread {
    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);

        }
    }
}

public class TestThread {

    @Test
    public void test() {
        Runnable runnable = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        };
        runnable.run();
    }

    public static void main(String[] args) {


        SubThread subThread = new SubThread();
        subThread.start();
        for (int i = 0; i < 100; i++) {
            if (i == 10) {
                //释放当前线程执行权
                Thread.yield();
            }
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }

        System.out.println(subThread.isAlive());
        System.out.println(subThread.getPriority());
        subThread.setPriority(Thread.MAX_PRIORITY);



    }
}
