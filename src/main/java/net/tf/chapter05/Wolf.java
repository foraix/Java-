package net.tf.chapter05;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/1/17 10:16
 * @desc
 */
public class Wolf {

    private Animal animal;

    public Wolf(Animal animal) {
        this.animal = animal;
    }

    public void breath() {
        animal.breath();
    }

    public void jump() {
        System.out.println("狼会跳！");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Wolf wolf = new Wolf(animal);
        wolf.breath();
    }
}
