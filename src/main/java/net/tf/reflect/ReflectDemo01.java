package net.tf.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author hy
 * @version 1.00
 * @time 2019/5/30 19:03
 * @desc 通过反射操作类
 */
public class ReflectDemo01 {
    /**
     * 获取反射对象（反射入口）
     * 1.Class.forName(全类名),
     * 2.类名.class,
     * 3.对象.getClass()
     */
    @Test
    public void demo01() {
        // 1.Class.forName(全类名),
        try {
            Class<?> aClass = Class.forName("net.tf.reflect.Person");
            System.out.println(aClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        // 2.类名.class,
        Class<Person> personClass = Person.class;
        System.out.println(personClass);

        // 3.对象.getClass()
        Person person = new Person();
        Class<? extends Person> aClass = person.getClass();
        System.out.println(aClass);
    }

    /**
     * 使用反射获取方法（本类，父类，接口中的所有方法）
     */
    @Test
    public void demo02() {
        // 入口
        Class<?> aClass = null;
        try {
            aClass = Class.forName("net.tf.reflect.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 获取所有的公共方法
        Method[] methods = aClass.getMethods();
        for (Method m : methods
             ) {
            System.out.println(m);
        }

    }

    @Test
    public void demo03() {
        // 入口
        Class<?> aClass = null;
        try {
            aClass = Class.forName("net.tf.reflect.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Class<?>[] interfaces = aClass.getInterfaces();
        for (Class<?> i : interfaces) {
            System.out.println(i);
        }

    }

    @Test
    public void demo04() {
        // 入口
        Class<?> aClass = null;
        try {
            aClass = Class.forName("net.tf.reflect.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 获取父类
        Class<?> superclass = aClass.getSuperclass();
        System.out.println(superclass);
    }

    @Test
    public void demo05() {
        // 入口
        Class<?> aClass = null;
        try {
            aClass = Class.forName("net.tf.reflect.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 获取所有的公共方法
        Constructor<?>[] constructors = aClass.getConstructors();
        Arrays.stream(constructors).forEach(System.out::println);
    }

    @Test
    public void demo06() {
        // 入口
        Class<?> aClass = null;
        try {
            aClass = Class.forName("net.tf.reflect.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 获取所有的公共方法
        Field[] fields = aClass.getFields();
        Arrays.stream(fields).forEach(System.out::println);
    }


    @Test
    public void demo07() {
        // 入口
        Class<?> aClass = null;
        try {
            aClass = Class.forName("net.tf.reflect.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }

    @Test
    public void demo08() {
        // 入口
        Class<?> aClass = null;
        try {
            aClass = Class.forName("net.tf.reflect.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Field[] Fields = aClass.getDeclaredFields();
        for (Field field : Fields) {
            System.out.println(field);
        }
    }

    @Test
    public void demo09() {
        // 入口
        Class<?> aClass = null;
        try {
            aClass = Class.forName("net.tf.reflect.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Person o = (Person) aClass.newInstance();
            System.out.println(o);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

    }
}
