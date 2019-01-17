package net.tf.chapter06;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.*;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/1/17 17:09
 * @desc 根据姓名来判断是否相等
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class EqualsPerson {
    private String name;


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && this.getClass() == obj.getClass()) {
            EqualsPerson person = (EqualsPerson) obj;
            return person.getName().equals(this.getName());
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        EqualsPerson person1 = new EqualsPerson("yuan");
        EqualsPerson person2 = new EqualsPerson("han");
        EqualsPerson person3= new EqualsPerson("han");

        System.out.println(person1.equals(person2));
        System.out.println(person2.equals(person3));
    }
}
