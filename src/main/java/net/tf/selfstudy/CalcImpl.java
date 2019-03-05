package net.tf.selfstudy;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/3/4 21:29
 * @desc 普通的方式一
 */
public class CalcImpl implements Calc {
    @Override
    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public int mult(int x, int y) {
        return x * y;
    }
}
