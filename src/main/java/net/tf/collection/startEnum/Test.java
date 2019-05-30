package net.tf.collection.startEnum;

/**
 * @author hy
 * @version 1.00
 * @time 2019/5/26 14:21
 * @desc
 */
public class Test {
    public static void main(String[] args) {
        WeekDaysA[] allValues = WeekDaysA.values();
        // 遍历枚举常量数组
        for (WeekDaysA weekDaysA : allValues) {
            System.out.printf("%d - %s\n", weekDaysA.ordinal() + 1, weekDaysA);
        }
        WeekDaysA weekDaysA = WeekDaysA.FRIDAY;
        WeekDaysA weekDaysb = WeekDaysA.valueOf("FRIDAY");

        // 输出为TRUE
        System.out.println(weekDaysA == WeekDaysA.FRIDAY);
        // 输出TRUE
        System.out.println(weekDaysA.equals(WeekDaysA.FRIDAY));
        // 输出为TRUE
        System.out.println(weekDaysA == weekDaysb);
    }
}
