package net.tf.selfstudy.SGGJavaSE.Annotation;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/3/11 20:40
 * @desc
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@MyAnnotation(value = "MyTestAnnotation")
public class Person {
    public String name;
    public int age;

    public void walk() {
        System.out.println("走路");
    }

    @Deprecated
    public void eat() {
        System.out.println("吃饭");
    }

    public static void main(String[] args) {
        Person person = new Person();

        //抑制编译器警告
        @SuppressWarnings("i")
        int i = 10;
    }
}

