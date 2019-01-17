package net.tf.chapter06;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/1/17 17:40
 * @desc 单例类的创建
 */
public class SingletonClass {

    private static SingletonClass singletonClass;

    private SingletonClass() {
    }

    public static SingletonClass getInstance(){
        if (singletonClass == null) {
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }
}
