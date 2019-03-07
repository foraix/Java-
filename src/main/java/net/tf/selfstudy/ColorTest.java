package net.tf.selfstudy;

import org.junit.Test;

import java.util.EnumSet;

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
        //使用ordinal()打印元素对应编号
        System.out.println(color.ordinal());
    }

    public static void main(String[] args) {

        //使用EnumSet遍历枚举
        EnumSet<Color> enumSet = EnumSet.allOf(Color.class);
        for (Color c : enumSet
             ) {
            System.out.println(c);
        }
    }
}
