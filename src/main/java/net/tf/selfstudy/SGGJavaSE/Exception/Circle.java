package net.tf.selfstudy.SGGJavaSE.Exception;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/3/7 22:09
 * @desc 测试自定义异常
 */
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * 自定义的圆比较方法
     *
     * @param object
     * @return
     */
    public int compareTo(Object object) {
        if (object == this) {
            return 0;
        } else if (object instanceof Circle){
            Circle circle = (Circle) object;
            if (this.radius > circle.radius) {
                return 1;
            } else if (this.radius == circle.radius) {
                return 0;
            } else {
                return -1;
            }
        }
        //此时应该手动定义一个类型
//        throw new RuntimeException("传入类型出错");
        throw new MyException();
    }

    public static void main(String[] args) {
        Circle circle = new Circle(1.2);
        Circle circle1 = new Circle(1.1);
        System.out.println(circle.compareTo(circle1));
        System.out.println(circle.compareTo("xx"));
    }
}
