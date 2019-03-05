package net.tf.selfstudy;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/3/4 21:35
 * @desc
 */
public class LambdaTest2 {
    public static void main(String[] args) {
        CalcDemo calcDemo = (x, y) -> x + y;
        System.out.println(calcDemo.calc(5,7));

        CalcDemo calcDemo1 = ((x, y) -> x * y);
        System.out.println(calcDemo1.calc(34,10));


    }
}
