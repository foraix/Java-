package net.tf.chapter06;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/2/13 20:55
 * @desc
 */
public abstract class InterfaceExtendsTest implements InterfaceC{
//    public void sayHhello() {
//        System.out.println("Hello");
//    }
//
//    public static void main(String[] args) {
//        InterfaceExtendsTest interfaceExtendsTest = new InterfaceExtendsTest();
//        interfaceExtendsTest.sayHhello();
//    }
}

interface InterfaceA {
    int A = 5;
    void sayHhello();
}

interface InterfaceB {
    int B = 6;
}

interface InterfaceC extends InterfaceA, InterfaceB{
    int c = 7;
}
