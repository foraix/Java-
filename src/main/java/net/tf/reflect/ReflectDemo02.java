package net.tf.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author hy
 * @version 1.00
 * @time 2019/5/31 10:44
 * @desc
 */
public class ReflectDemo02 {

    @Test
    public void demo01() throws IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class<?> aClass = null;
        try {
            aClass = Class.forName("net.tf.reflect.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Field declaredFields = aClass.getDeclaredField("id");
        Person per = (Person) aClass.newInstance();
        // 修改属性访问权限
        // method也有setAccessible
        declaredFields.setAccessible(true);
        declaredFields.set(per, 12);
        System.out.println(per.getId());

        Method method = aClass.getDeclaredMethod("privateMethod", null);
        method.setAccessible(true);
        method.invoke(per, null);

        Method method1 = aClass.getDeclaredMethod("privateMethod1", String.class);
        method1.setAccessible(true);
        method1.invoke(per, "xx");
    }

    @Test
    public void demo02() throws Exception {
        Class<?> aClass = null;
        try {
            aClass = Class.forName("net.tf.reflect.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Field field = aClass.getDeclaredField("id");
        Person p = (Person) aClass.newInstance();
        field.setAccessible(true);
        field.set(p, 12);
        System.out.println(p.getId());

        Method method = aClass.getDeclaredMethod("privateMethod1", String.class);
        method.setAccessible(true);
        method.invoke(p, "hy");
        System.out.println(p);
    }

    @Test
    public void demo03() throws Exception {
        Class<?> aClass = null;
        try {
            aClass = Class.forName("net.tf.reflect.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Field field = aClass.getDeclaredField("id");
        Person p = (Person) aClass.newInstance();

        Constructor[] constructors = aClass.getDeclaredConstructors();
        for (Constructor c : constructors
             ) {
            System.out.println(c);
        }

        // 获取指定类型的构造器
        Constructor<?> constructor = aClass.getDeclaredConstructor(int.class);
        constructor.setAccessible(true);
        System.out.println(constructor);
        Person o = (Person) constructor.newInstance(12);

        System.out.println(o);
    }

}
