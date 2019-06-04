package net.tf.reflect;

import lombok.*;

/**
 * @author hy
 * @version 1.00
 * @time 2019/5/30 18:57
 * @desc
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person implements MyInterFace, MyInterFace2  {
    private int id;
    private String name;
    private int age;

    private void privateMethod() {
        System.out.println("private Method");
    }

    private void privateMethod1(String name) {
        System.out.println("private Method1" + name);
    }

    private Person(int id) {
        this.id = id;
    }

    public static void staticMethod() {
        System.out.println("staticMethod");
    }

    @Override
    public void method() {
        System.out.println("method");
    }

    @Override
    public void method2() {
        System.out.println("method2");
    }
}
