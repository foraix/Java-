package net.tf.collection.startEnum;

/**
 * @author hy
 * @version 1.00
 * @time 2019/5/26 9:13
 * @desc
 */
public interface myEnum {
    int MONDAY = 0;
    int TUESDAY = 1;
    int WENNESDAY = 2;
    int THURSDAY = 3;
    int FRIDAY = 4;

    public static void main(String[] args) {
        int day = TUESDAY;
        switch (day) {
            case MONDAY:
                System.out.println("星期一");
                break;
            default:
                System.out.println("xx");
        }
    }
}

