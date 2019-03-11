package net.tf.selfstudy.SGGJavaSE.Enum;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/3/11 20:04
 * @desc 实现一个简单的自定义枚举类
 */
public class   Session {;

    /**
     * 创建枚举类的对象
     */

    private static final Session SPRING = new Session("spring","春天");
    /**
     * 使其不可被修改
     */
    private final String name;
    private final String desc;

    /**
     * 提供私有构造器，内部构造
     */
    Session(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    /**
     * 通过公用方法调用
     */
    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public void show() {
        System.out.println("这是一个季节");
    }

    @Override
    public String toString() {
        return "Session{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Session session = Session.SPRING;
        session.toString();
        System.out.println(session.desc);
    }
}


