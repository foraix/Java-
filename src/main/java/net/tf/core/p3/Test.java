package net.tf.core.p3;
import static java.lang.Math.*;

/**
 * @author hy
 * @version 1.00
 * @time 2019/5/26 19:51
 * @desc
 */
public class Test {

    public strictfp static void main(String[] args) {
        int s = 0b10_10;
        System.out.println(s);
        System.out.println(Math.floorMod(12, 7));

        System.out.println(sqrt(PI));
        System.out.println(pow(3, 4));

        int s1 = 12;
        s1 += 5.5;
        System.out.println(s1);

        String greeting = "Hello";
        String s2 = greeting.substring(0, 3);
        System.out.println(s2);

        String al = String.join("/ ", "s", "s", "m");
        System.out.println(al);

        String s3 = "test";
        String s4 = s3.substring(0, 3) + "p";
        System.out.println(s4);

        String s5 = "Hello Every One!";
        if (s5 == "Hello Every One!") {
            // 会执行
            System.out.println(true);
        }
        if (s5.substring(0, 3) == "Hel") {
            // 不会执行
            System.out.println(true);
        }
        String s6 = s5.substring(0, 3);
        if (s6 == "Hel") {
            // 不会执行
            System.out.println(true);
        }

        String s7 = "哈哈";
        System.out.println(s7.length());
        int cpCount = s7.codePointCount(0, s7.length());
        System.out.println(cpCount);
    }
}
