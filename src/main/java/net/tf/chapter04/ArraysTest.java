package net.tf.chapter04;

import java.util.Arrays;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/1/1 21:10
 * @desc
 */
public class ArraysTest {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5,};
        int[] b = new int[]{1, 2, 3, 4, 5,};
        int[] c = new int[]{1, 2, 2, 4, 5,};

        System.out.println("a 和 b是否相等:" + Arrays.equals(a, b));
        System.out.println("a 和 c是否相等:" + Arrays.equals(a, c));

        int[] d = Arrays.copyOf(b,10);
        System.out.println("数组d的值为：" + Arrays.toString(d));

        //将数组d从第4位到第70位赋值为900(包括fromindex 但是不包括 toindex)
        Arrays.fill(d,3 ,6, 900);
        System.out.println("" + Arrays.toString(d));

        int[] e = new int[]{1,4,56,12,546,213,6546};
        Arrays.sort(e);
        System.out.println("e排序后的结果" + Arrays.toString(e));
    }
}
