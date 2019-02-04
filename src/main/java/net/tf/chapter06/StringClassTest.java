package net.tf.chapter06;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/1/17 17:52
 * @desc
 */
public class StringClassTest {
    public static void main(String[] args) {

        String c1 = "Hello Java";
        String c2 = "Hello ";
        String c3 = "Java";
        String c4 = c2 + c3;
        String c5 = "Hello " + "Java";
        //链接运算后得到值，编译器不会执行替换，所以false
        System.out.println(c1 == c4);

        //在编译时就确定下来，所以返回true
        System.out.println(c1 == c5);
    }
}
