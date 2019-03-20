package net.tf.selfstudy.SGGJavaSE.thread;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/3/18 21:15
 * @desc 模拟窗口售票
 */
class Window extends Thread {
    /**
     * 将ticket申明为static，好处是票数是固定的，但是static的变量，生命周期长，耗费资源
     */
    private static Integer ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket >= 1) {
                System.out.println(Thread.currentThread().getName() + "出售了一张票,当前剩余：" + Window.ticket-- + "张");
            } else {
                break;
            }
        }
    }
}

public class TestWindow {

    public static void main(String[] args) {
        Window window1 = new Window();
        Window window2 = new Window();
        Window window3 = new Window();

        window1.setName("window1");
        window2.setName("window2");
        window3.setName("window3");

        window1.start();
        window2.start();
        window3.start();

        Runnable run = () -> System.out.println("xx");
        Thread thread = new Thread(run);
        thread.start();
    }
}
