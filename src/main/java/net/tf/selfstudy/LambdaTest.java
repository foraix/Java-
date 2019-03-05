package net.tf.selfstudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/3/4 21:16
 * @desc lambda简单编程
 */
public class LambdaTest {

    Runnable runnable1 = new Runnable() {
        @Override
        public void run() {
            System.out.println("普通方式");
        }
    };

    Runnable runnable = () -> System.out.println("lambda方式");


    public static void main(String[] args) {
        LambdaTest lambdaTest = new LambdaTest();
        lambdaTest.runnable.run();

        lambdaTest.runnable1.run();


        System.out.println("---------------------------------------");
        //使用lambda遍历
        String[] strings = {"xx", "oo", "uu", "pp"};
        List list = Arrays.asList(strings);
        list.forEach(System.out::println);
        list.forEach(user -> {
            System.out.println("xxxxs" + user);
        });

        System.out.println("-------------------------------------");

        String[] strings1 = {"xx", "oo", "uu", "pp"};

        List<String> list1 = new ArrayList<>();
        for (String s : strings1
             ) {
            list1.add(s);
        }

        //传统迭代器删除指定元素
        Iterator iterator = list1.iterator();
        while (iterator.hasNext()) {
            String buffer = (String) iterator.next();
            if ("xx".equals(buffer)) {
                iterator.remove();
            }
        }

        //使用lambda删除指定元素
        list1.removeIf(buffer -> "oo".equals(buffer));
        list1.removeIf(b -> "uu".equals(b));

        //使用lambda打印结果
        list1.forEach(System.out::println);

    }


}
