package net.tf.selfstudy.SGGJavaSE.Exception;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/3/7 21:54
 * @desc
 */
public class FinallyTest {
    public int testFinally() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }

    public static void main(String[] args) {
        FinallyTest finallyTest = new FinallyTest();
        int i = finallyTest.testFinally();
        System.out.println(i);
    }
}
