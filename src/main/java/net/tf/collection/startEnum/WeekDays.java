package net.tf.collection.startEnum;

/**
 * @author hy
 * @version 1.00
 * @time 2019/5/26 10:30
 * @desc
 */
public enum WeekDays {
    MONDAY, TUSESDAY, WEDNESDAY
}

class test {
    public static void main(String[] args) {
        WeekDays weekDays = WeekDays.TUSESDAY;
        System.out.println(weekDays);
        switch (weekDays) {
            case MONDAY:
                System.out.println("星期一");
                break;
            case TUSESDAY:
                System.out.println("星期二");
                break;
            case WEDNESDAY:
                System.out.println("星期三");
                break;
            default:
                System.out.println("xxxx");
        }
    }
}
