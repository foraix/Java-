package net.tf.selfstudy;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/3/3 23:01
 * @desc 局部内部类
 */
public class InnerClass {
    int age = 12;
    public void say() {
        class InnerClass1 {
            String name = "yuan";
            public void say(){
                System.out.println(age + "xxx" + name);
            }
        }
        InnerClass1 innerClass1 = new InnerClass1();
        innerClass1.say();
    }

    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        innerClass.say();
    }
}

class InnerClass2{
    String name = "yuantuo";

    public void say(){
        System.out.println("父类say");
    }

    public static void main(String[] args) {
        InnerClass2 innerClass2 = new InnerClass2(){
            @Override
            public void say() {
                System.out.println("我重写了父类的方法");
            }
        };
        innerClass2.name = "hy";
        innerClass2.say();
    }
}