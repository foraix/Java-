package net.tf.chapter06;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/1/19 9:00
 * @desc
 */
public class FinalTest {
    private final void test(String cc) {
        System.out.println(cc);
    }
}

class FinalTestOne extends FinalTest {
    private final void test(String cc) {
        System.out.println(cc);
    }

    public static void main(String[] args) {
        FinalTestOne finalTestOne = new FinalTestOne();
        finalTestOne.test("xx");
    }
}
