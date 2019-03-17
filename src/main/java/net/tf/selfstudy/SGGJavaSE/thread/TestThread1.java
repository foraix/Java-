package net.tf.selfstudy.SGGJavaSE.thread;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/3/17 21:28
 * @desc 单线程
 */
public class TestThread1 {

    public static void main(String[] args) {
        method2("hello");
    }

    private static void method1(String str) {
        System.out.println(str);
        System.out.println("method1");
    }
    private static void method2(String str) {
        method1(str);
        System.out.println("method2");
    }
}
