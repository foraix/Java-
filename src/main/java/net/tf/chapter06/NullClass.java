package net.tf.chapter06;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/1/17 17:29
 * @desc 空对象可以访问它所属的类成员
 */
public class NullClass {
    public static void test() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        NullClass nullClass = new NullClass();
        nullClass = null;
        nullClass.test();
    }
}
