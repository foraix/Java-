package net.tf.collection.common;

import lombok.*;

/**
 * @author hy
 * @version 1.00
 * @time 2019/5/26 15:20
 * @desc
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {

    private String name;
    private int age;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person otherPerson = (Person) obj;
            if (this.age == otherPerson.age) {
                return true;
            }
        }
        return false;
    }



}
