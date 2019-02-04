package net.tf.chapter06;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/1/19 9:19
 * @desc 当引用对象是可变时候的解决办法
 */
public class Person {
    private final Name name;

    public Person(Name name) {
        this.name = new Name(name.getFirstName(),name.getLastName());
    }

    public Name getName() {
        return new Name(name.getFirstName(),name.getLastName());
    }

    public static void main(String[] args) {
        Name name = new Name("yuan","tuo");
        Person person = new Person(name);
        System.out.println(person.getName());
        name.setFirstName("han");
        System.out.println(person.getName());
    }
}
