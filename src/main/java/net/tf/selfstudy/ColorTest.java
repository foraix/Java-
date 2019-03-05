package net.tf.selfstudy;

import org.junit.Test;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/3/4 22:57
 * @desc
 */
public class ColorTest {
    private Color color = Color.GREEN;

    @Test
    public void colorTest(){
        Color color = Color.BULE;
        System.out.println(color);
        //使用ordinal()打印本编号
        System.out.println(color.ordinal());
    }
}
