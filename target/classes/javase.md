

#### Java语言概述与开发环境



2018年12月29日02:07:02

> 尽量使用纯文本编辑器完成开发
>
> 使用JDK1.4之前的版本需要配置CLASSPATH时候需要加上一个.。为的是能够让jre在能够在当前目录下找到编译后的类
>
> ~~~java
> public class HelloWorld {
>     public static void main(String[] args){
>         System.out.println("hello yuan");
>     }
> }
> ~~~
>
> ![1546055869649](C:\Users\袁拓\AppData\Roaming\Typora\typora-user-images\1546055869649.png)

(小结：今天把各种环境搭好了，这就出发吧！）



<hr/>



2018年12月29日11:07:10

> 类是Java程序的最小单位，不允许可执行性语句，方法等独立存在
>
> main方法是Java程序的 入口，如果只需要编译不需要main方法，但执行确必须有main方法
>
> 一个Java源文件只能有一个public修饰符用以修饰类，但可以有多个内部类



####  JAVA的内存回收机制



显示内存回收的两个缺点



+ 容易忘记回收内存，造成内存泄露，降低系统性能
+ 错误回收系统核心类内存，导致系统崩溃

> 在Java中，当没有引用变量指向原先分配给某个对象的内存
>
> 垃圾回收机制只能回收内存资源，对其他IO操作，数据库连接等无能无力。
>
> 为了尽快的回收对象，可以将该对象的引用变量置为null、暗示JVM进行回收
>
> 编写Java程序原则之一，对于不再使用的对象，不要引用他们

#### 理解面向对象

面向对象的组成

+ OOA(面向对象分析)
+ OOD(面向对象设计)
+ OOP(面向对象编程)

> 建议使用UML来记录和描述OOA和OOD的结果
>
> Java拒绝使用GOTO语句，但依然保留为关键字，也许以后不得不用



<hr/>



2018年12月30日00:36:48

>在面向过程的程序世界里，一切以函数为中心，就像： 吃（猪八戒，西瓜）
>
>在面向对象的程序世界里，一切以对象为中心，就像： 猪八戒（吃，西瓜）



> 封装：将对象的实现细节隐藏起来，通过公用的方法来暴露该对象的功能
>
> 继承：实现软件复用的必要条件
>
> 多态：将子类对象可以直接赋值给父类变量，但运行时依然变现出子类的特征
>
> 抽象：充分考虑与当前目标有关的方面
>
> 分为类库的创建者和类库的使用者，使用类库只是在形式上面向对象，而实质上只是库函数的一种扩展



基于对象概念

> 基于对象虽然也使用了对象，但是无法利用现有的对象模板产生新的对象类型。没有继承的特点。JS就是基于对象的编程语言



#### 数据类型和运算符





> 所有变量必须先声明在使用
>
> 如果希望javadoc工具可以提取private修饰的内容，可以在使用javadoc工具时增加 -private选项



<hr/>

2018年12月30日23:37:45

> 编程的本质其实就是对内存中数据的访问和修饰
>
> 变量相当于一个有名称的容器，该容器用以装各种不同类型的数据
>
> char相当于无符号整数类型
>
> 空引用可以转化为任意类型，补能把null值赋值给基本数据类型的变量
>
> 数值类型可以使用_清晰纪录位数



<hr>
2019年1月1日19:53:20

> 使用foreach元素迭代数组变量时，并不能改变数组元素的值，因此不应该对循环遍历赋值
>
> 数组元素和数组变量时分开存放的。
>
> 数组变量存在栈内存（stack）中,实际的数组对象存在堆内存中(peak)
>
> 可以将变量赋为null，也就切断了数组引用变量和实际数组之间的引用关系



~~~ java
        int[] a = new int[]{1, 2, 3, 4, 5,};
        int[] b = new int[]{1, 2, 3, 4, 5,};
        int[] c = new int[]{1, 2, 2, 4, 5,};

        System.out.println("a 和 b是否相等:" + Arrays.equals(a, b));
        System.out.println("a 和 c是否相等:" + Arrays.equals(a, c));

        int[] d = Arrays.copyOf(b,10);
        System.out.println("数组d的值为：" + Arrays.toString(d));

        //将数组d从第4位到第70位赋值为900(包括fromindex 但是不包括 toindex)
        Arrays.fill(d,3 ,6, 900);
        System.out.println("" + Arrays.toString(d));

        int[] e = new int[]{1,4,56,12,546,213,6546};
        Arrays.sort(e);
        System.out.println("e排序后的结果" + Arrays.toString(e));

~~~

> a 和 b是否相等:true
> a 和 c是否相等:false
> 数组d的值为：[1, 2, 3, 4, 5, 0, 0, 0, 0, 0][1, 2, 3, 900, 900, 900, 0, 0, 0, 0]
> e排序后的结果[1, 4, 12, 56, 213, 546, 6546]



<hr>

2019年1月5日19:16:15

> Java提供了private protected public 三个控制修饰符来实现良好的封装
>
> 对于一个类定义而言，最常见的成员：构造器，成员变量，方法
>
> static 修饰的成员不能访问非static修饰的成员
>
> static修饰表明该方法属于该类本身而不是属于他的实例（类变量，类方法）
>
> Java通过new来调用该类的构造器，从而返回该类的实例
>
> 实际上Java里面的引用就是C里面的指针，只是Java将指针封装起来，避免开发者进行繁琐的指针操作（引用变量存在栈内存而实际对象在堆内存）                                                                                                                                                        

> 堆内存的对象可以有多个引用，就是多个引用变量指向同一个对象

~~~ java
public static void main(String[] args) {
        User user = new User();
        user.setName("xxx");
        User user1 = user;
        user1.setName("yyy");
        System.out.println(user);
    }
~~~

> User{name='yyy'}



> this关键字指向调用该方法的对象
>
> static修饰的方法不能使用this调用，Java规定：静态成员不能直接访问非静态成员

> 该构造器创建的类的foo值为666

~~~ java
 	public int foo;

    public ThisInConstructor() {
        int foo = 666;
        this.foo = foo;
    }

    public static void main(String[] args) {
        System.out.println(new ThisInConstructor().foo);
    }
~~~



> 使用this作为返回值可以使代码更加简洁，但可能造成实际意义上的模糊

~~~ java
	public int age = 5;

    public ReturnThis grow(){
        age++;
        return this;
    }
    public static void main(String[] args) {
        ReturnThis returnThis = new ReturnThis();
        ReturnThis grow = returnThis.grow().grow().grow().grow();
        System.out.println(grow.age);

    }
~~~



>方法要么属于类，要么属于对象，他不能独立存在
>
>实参传入方法中实际上是传入的是该参数的复制品，无论该参数被如何处理都不会对原有的参数产出任何的影响

~~~ java
 public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("swap方法中a的值是:" + a + "\tb的值是:" + b);
    }

    public static void main(String[] args) {
        int a = 666;
        int b = 999;
        swap(a,b);
        System.out.println("main方法中a的值是:" + a + "\tb的值是:" + b);
    }
~~~

> swap方法中a的值是:999	b的值是:666
> main方法中a的值是:666	b的值是:999



> 实际上下面的代码，依然符合方法的参数传递机制，只是由于指向的是同一个对象，所以参数才会改变

~~~java
	public static class DateWrap{
        int a;
        int b;
    }

    public static void swap(DateWrap dw){
        int temp = dw.a;
        dw.a = dw.b;
        dw.b = temp;
        System.out.println("swap方法中a的值是:" + dw.a + "\tb的值是:" + dw.b);
    }

    public static void main(String[] args) {
        DateWrap dw = new DateWrap();
        dw.a = 66;
        dw.b = 99;
        swap(dw);
        System.out.println("main方法中a的值是:" + dw.a + "\tb的值是:" + dw.b);
    }
~~~

> swap方法中a的值是:99	b的值是:66
> main方法中a的值是:99	b的值是:66



> 可变参数只能放在形参的最后，一个方法最多只能拥有一个可变参数
>
> 支持可变参数(也可以传入数组)

~~~ java
	public void varArgs(String... books){
        for (String b : books
             ) {
            System.out.println(b);
        }
    }
    public static void main(String[] args) {
        new VarArgs().varArgs("xxx","bbb","ccc");
        new VarArgs().varArgs(new String[]{"xxx","bbb","ccc"});
    }
~~~



> 支持递归

~~~ java
	private static int fn(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return 2 * fn(n - 1) + fn(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fn(20));
    }
~~~



> Java 方法重载时会优先调用单个参数方法而不是不定参数方法

~~~ java
	public void test(String... books){
        System.out.println(".................");
    }
    public void test(String books){
        System.out.println("xxxxxxxxxxxxxxxxxxxxx");
    }

    public static void main(String[] args) {
        OverloadVarargs overloadVarargs = new OverloadVarargs();
        overloadVarargs.test("xxx");
    }
~~~

> xxxxxxxxxxxxxxxxxxxxx





<hr>

2019年1月6日09:33:14

> 类的实例可以访问该类的类变量

~~~ java
class Person{
    public String name;
    public static String nameA = "xxx";
}

public class PersonTest {

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.nameA);
    }
}

~~~





<hr>

2019年1月6日15:26:37

> 局部变量定义后，必须经过显示初始化，系统才会为其分配内存空间
>
> 与成员变量不同，局部变量不属于任何类和实例（保存在所属方法的栈区之中）
>
> 栈内存变量无需系统回收，旺旺随着方法的运行结束而结束，因此局部变量的作用域是从初始化该变量开始，直到该方法或者代码块结束而结束
>
> 从效率考虑使用优先级为（类变量 < 成员变量 < 代码块变量）

直接使用类变量进行运算的两个坏处

+ 增大了变量的生存时间，这将导致更大的内存开销
+ 扩大了变量的作用域，这不利于提高程序的内聚性

> 下面的代码效果都是一样的，但很明显第三个使用代码块变量最符合程序开发规范，效率也最高

~~~ java
	public static  int i;
    public static void main(String[] args) {
        for (i = 0; i < 10; i++){
            System.out.println("HELLO");
        }
    }
~~~

~~~ java
	 public static void main(String[] args) {
        int i;
        for (i = 0; i < 10; i++){
            System.out.println("HELLO");
        }
    }
~~~

~~~java
	public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            System.out.println("HELLO");
        }
    }
~~~



#### 理解封装

> 概念：将对象的状态信息隐藏在对象内部，不允许直接访问内部信息，二十通过该类提供的方法来进行访问

作用大致如下

+ 隐藏类的实现细节
+ 可以加入控制逻辑，限制对成员变量的不合理访问
+ 进行数据检查，保存对象数据完整性
+ 就是该隐藏的隐藏起来，该暴露的暴露出来



> private ----> default ---->  protected ----> public （权限越来越大）

+ private 只能当前类访问
+ default 相同包下的其他类访问
+ protected 可以被相同包中的访问 也可以被不同包的子类访问
+ public 所有类访问

为什么局部变量不能使用访问修饰符来修饰？

> 因为局部变量的作用域仅仅在所属方法中，不可能被其他类访问，所以不能使用修饰符进行修饰
>
> 外部类不能使用protected 和 private 进行修饰 这样做没有意义



关于低耦合和高内聚

+ 低耦合（仅暴露少量的方法给外部使用）
+ 高内聚（尽可能把 模块的内部数据，功能实现细节隐藏在模块内部独立完成，不允许外部直接干预）



#### 深入构造器

> 构造器是创建对象的重要途径，即使使用工厂模式和反射模式创建对象，其实质依然是依赖构造器
>
> 当创建对象时，系统为这个对象的实例变量进行初始化 基本类型变量置为0 false ，引用变量类型置为null



<hr>

2019年1月9日16:19:52



>对象并非完全由构造器负责创建的，当调用构造器的时候会系统会为该对象分配内存区间，并未这个对象执行默认初始化，这些操作在构造器调用之前就已经实现了，只是还不能被外部访问，当构造器执行完毕后，这个对象作为构造器的返回值被返回，通常还会赋值给另外一个引用变量，从而使外部程序可以访问该对象
>
>构造器的正确使用:多个构造器应该用多参数的调用另一个构造器

~~~ java
/**
 * @author hy
 * @version 1.00
 * @time 2019/1/9 16:06
 * @desc 构造器的正确使用
 */
public class Apple {

    private String name;

    private Double weight;

    private Integer hight;

    public Apple(String name) {
        this.name = name;
    }

    public Apple(String name, Double weight) {
        this(name);
        this.weight = weight;
    }

    public static void main(String[] args) {
        Apple apple = new Apple("红富士",55.0);
    }
}
~~~



#### 类的继承

> 一个类只能有一个直接父类，可以有多个间接父类
>
> 如果父类方法有private权限，则子类是访问不了的

重载和重写的区别

+ 重写(Override)是子类对父类的允许访问的方法的实现过程进行重新编写, 返回值和形参都不能改变
+ 重载(Overload) 是在一个类里面，方法名字相同，而参数不同。返回类型可以相同也可以不同。每个重载的方法（或者构造函数）都必须有一个独一无二的参数类型列表。最常用的地方就是构造器的重载。



<hr>

2019年1月9日19:26:56

> 如果定义了和父类同名的实例变量，则会发生子类实例变量隐藏父类实例变量的情形
>
> 但是可以通过super来调用父类原有的值(系统会为SubClass对象分配两块内存，一块存a一块存继承得来的实例变量)

~~~java
/**
 * @author hy
 * @version 1.00
 * @time 2019/1/9 19:29
 * @desc super关键字
 */
public class SubClass {
    public int a = 7;
}

class ExtendClass extends SubClass{
    public int a = 5;

    public void getBase(){
        System.out.println(super.a);
    }
    public void getOwner(){
        System.out.println(a);
    }

    public static void main(String[] args) {
        ExtendClass extendClass = new ExtendClass();
        extendClass.getBase();
        extendClass.getOwner();
    }
}
~~~

> 调用父类构造器

~~~ java

/**
 * @author hy
 * @version 1.00
 * @time 2019/1/9 19:38
 * @desc 调用父类构造器
 */

class Parent {
    public String name;

    public Parent(String name) {
        this.name = name;
    }

    public Parent() {
    }
}

class Derived extends Parent {
    public String sex;
    
    public Derived(String name) {
        super(name);
    }

    public Derived(String name, String sex) {
        super(name);
        this.sex = sex;
    }
}

class HideTest {
    public static void main(String[] args) {
        Derived derived = new Derived("yuan");
    }
}
~~~



#### 深入多态

> 如果编译时类型和运行时类型不一致，就可能出现所谓的多态(Polymorphism)



> 可以发现调用父类方法的方法时如果子类有覆盖方法则会调用子类的覆盖方法
>
> 编写Java时引用变量只能调用他编译时候的类型的方法，而不能调用他运行时候的方法，除非强制转换为运行时类型

~~~ java
public class SonA extends ParentA {

    public String book = "Java";

    public void baseB() {
        System.out.println("子类的普通方法");
    }

    @Override
    public void test() {
        System.out.println("子类的覆盖方法");
    }

    public static void main(String[] args) {
        ParentA parentA = new SonA();
        parentA.test();
        System.out.println(parentA.book);
        System.out.println(((SonA) parentA).book);
    }

}
class ParentA {
    public int book = 6;

    public void test() {
        System.out.println("父类的被覆盖方法");
    }

    public void baseA() {
        System.out.println("父类的普通方法");
    }
}
~~~

> 子类的覆盖方法
> 6
> Java
>
> Process finished with exit code 0



> 进行强制类型转换时候可能出现异常，不妨先用instanceof 运算符估计是否可以转化成功

~~~ java
if (obj instanceof String) {
    System.out.println((String)obj);
}
~~~



> 当把子类对象赋值给父类引用变量时，总是成功的，称为向上转型。这种转型只是表明在编译时候的类型是父类但是执行它的方法时候确实编写出子类的特征
>
> 相应的把父类对象赋值给子类时候，就需要强制类型转换，可能会产生ClassCastException 使用instanceof 运算符能够使程序更加健壮
>
> instanceof 运算符用来判断前一个类是否是后一个类的子类或自身

~~~ java
        System.out.println(test instanceof Object);
~~~

> true
>
> Process finished with exit code 0



<hr>

2019年1月10日14:19:36

#### 继承与组合



| No   | 科目         | 金额             | 备注                                               |
| ---- | ------------ | ---------------- | -------------------------------------------------- |
| 1    | 购买螃蟹     | 10000            | 新鲜食材很重要                                     |
| 2    | 证件费       | 2000             | 健康证、排污证、卫生证、营业执照和税务证等         |
| 3    | 门店租赁     | 1330元/平方米/月 | 一次性付一年租金，选址在学校附近或商业中心         |
| 4    | 装修         | 30000            | 约100平方                                          |
| 5    | 门店设施设备 | 19700            | 空调，冰箱，饮水机，座椅等                         |
| 6    | 厨房设备     | 1430             | 炊具等                                             |
| 7    | 物料         | 950              | 物料、小吃食材、调料、酱料、时蔬、水果、外卖盒子等 |
| 8    | 人员支出每月 | 7000             | 厨师4500 服务员2500                                |
| 9    | 开业活动     | 500              | 气球及其他装饰品100元 宣传400元                    |
| 10   | 水电费       | 5700 每月        | 水电费必不可少                                     |

> 经费合计 121740元
>
> 自筹60000元（一人一万） 
>
> 模拟资费61740元





<hr>

2019年1月14日08:58:53



使用继承的注意点

+ 使用继承有一个最大的坏处就是破坏了封装成员变量（内部信息），从而造成子类和父类功能的严重耦合。
+ 子类可以直接访问父类
+ 应该尽量隐藏父类的内部数据，把父类的所有成员变量都设置为private类型
+ 不能让子类随意访问修改父类的方法，不希望被继承的可以使用final方法。
+ 尽量不要在父类构造器中调用可能会被子类重写的方法



<hr>

2019年1月17日10:13:16

#### 利用组合实现复用

~~~ java
/**
 * @author yuan
 * @version 1.00
 * @time 2019/1/17 10:15
 * @desc
 */
public class Animal {
    public void breath() {
        System.out.println("动物会呼吸");
    }
}
~~~

~~~ java
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
        System.out.println("浪会跳！");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Wolf wolf = new Wolf(animal);
        wolf.breath();
    }
}
~~~

> 使用组合方式实现父类的复用，和使用继承方式实现的开销是近乎一样的，唯一的区别是使用组合时，创建父类的时候需要一个引用变量。

#### 使用初始化块

> 初始化块中的代码可以包含任何可执行性语句
>
> 初始化块，没有名字没有标识，所以无法通过调用它
>
> 建议初始化内容写在一个初始化块中，因为他们都是最先执行的，也可以使程序更简洁，可读性更强
>
> 一定意义上来说，初始化块是对构造器的补充，他总是先于构造器执行



> 实际上来说，初始化块是一个假象，使用javac编译后，初始化块中的代码会位于构造器代码块中的最前面

~~~ java
   public class Animal {
        {
            System.out.println("试试初始化块");
        }

        public void breath() {
            System.out.println("动物会呼吸");
        }
    }

编译后的样子
	
 	public Animal() {
        System.out.println("试试初始化块");
    }

    public void breath() {
        System.out.println("动物会呼吸");
    }
~~~



静态初始化块

+ 系统将在类初始化阶段执行静态初始化块
+ 静态初始化块不能对实例变量进行初始化处理



#### 增强的包装类

> 基本数据类型不具备对象的特征，没有成员变量和方法可以被调用,主要是为了照顾传统程序员的开发习惯，为了解决八种基本数据类型不能当成Object类型使用的问题，Java为此提供了包装类

~~~ java
/**
 * @author yuan
 * @version 1.00
 * @time 2019/1/17 16:57
 * @desc
 */
public class SimpleIntegerTest {
    public static void main(String[] args) {
        Integer a = 128;
        Integer b = 128;
        Integer c = 127;
        Integer d = 127;
        System.out.println(a == b);
        System.out.println(c == d);
    }
}

~~~

> false
> true
>
> Process finished with exit code 0

> 出现这种结果是因为Java考虑到-128-127是比较常用的数字，此时通过自动装箱来封装int数据，会将该数据放入常量池中，可以大大提高系统性能。

> 空对象可以访问它所属的类成员

```java
/**
 * @author yuan
 * @version 1.00
 * @time 2019/1/17 17:29
 * @desc 空对象可以访问它所属的类成员
 */
public class NullClass {
    public static void test() {
        System.out.println("Hello");
    }
    
    public static void main(String[] args) {
        NullClass nullClass = new NullClass();
        nullClass = null;
        nullClass.test();
    }
}
```

> Hello
>
> Process finished with exit code 0



#### 单例类的创建

+ 如果一个类始终只能有一个实例，这称之为单例类,因为有时候创建对象并无意义，反而会增加系统开销
+ 构造器应该使用private修饰
+ 使用一个public方法来获取该类的实例
+ 需要缓存已经创建过的对象，所以使用成员变量来保存已经创建过的对象，否则无法知道是否已经创建过该对象，从而无法判断是否创建该对象
+ 因为需要被静态方法访问，所以引用static修饰符来进行修饰

```java
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
```



<hr>

2019年1月19日08:55:51

#### 不可变类

> 使用private修饰final，依然可以在子类中定义相同参数，名字，返回值的方法

```java
/**
 * @author yuan
 * @version 1.00
 * @time 2019/1/19 9:00
 * @desc
 */
public class FinalTest {
    private final void test(String cc) {
        System.out.println(cc);
    }
}

class FinalTestOne extends FinalTest {
    private final void test(String cc) {
        System.out.println(cc);
    }

    public static void main(String[] args) {
        FinalTestOne finalTestOne = new FinalTestOne();
        finalTestOne.test("xx");
    }
}
```

> xx
>
> Process finished with exit code 0



> 创建该类后，该类的实例变量是不可变的
>
> 使用final 和 private 修饰该类的成员变量
>
> 提供带参数构造器,使用参数初始化成员变量
>
> 仅提供getter方法
>
> 尽量重写hashcode和equals方法

```java
/**
 * @author yuan
 * @version 1.00
 * @time 2019/1/19 9:04
 * @desc 不可变类
 */
public class Address {
    private final String postCode;
    private final String detail;

    public Address() {
        this.detail = "";
        this.postCode = "";
    }

    public Address(String postCode, String detail) {
        this.postCode = postCode;
        this.detail = detail;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getDetail() {
        return detail;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            Address address = (Address) obj;
            return address.postCode.equals(this.getPostCode()) && address.getDetail().equals(this.getDetail());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return detail.hashCode() + postCode.hashCode() + 31;
    }

    public static void main(String[] args) {
        Address address1 = new Address("xx","cc");
        Address address2 = new Address("xx","cc");
        System.out.println(address1.equals(address2));
        System.out.println(address1.hashCode());
        System.out.println(address1.getPostCode());
    }
}
```



> 创建不可变类的时候遇到变量时另一个对象时候解决办法就是构造器和需要引用的方法中使用new创建

```java
/**
 * @author yuan
 * @version 1.00
 * @time 2019/1/19 9:18
 * @desc
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Name {
    private String firstName;
    private String lastName;
}

```

> 未使用new的情况

```java
/**
 * @author yuan
 * @version 1.00
 * @time 2019/1/19 9:19
 * @desc 当引用对象是可变时候的解决办法
 */
public class Person {
    private final Name name;

    public Person(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public static void main(String[] args) {
        Name name = new Name("yuan","tuo");
        Person person = new Person(name);
        System.out.println(person.getName());
        name.setFirstName("han");
        System.out.println(person.getName());
    }
}
```

> Name(firstName=yuan, lastName=tuo)
> Name(firstName=han, lastName=tuo)
>
> Process finished with exit code 0

> 使用new的情况

```java
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
```

<hr/>



<hr>

2019年3月4日21:05:58

#### lambda表达式

> Java为了扩充匿名方法在Java中新增的特性
>
> Java中使用匿名方法必须对于接口中的一个抽象方法
>
> 一个接口中只有一个抽象方法称之为函数式接口例如runable接口

基础应用

``` java
package net.tf.selfstudy;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/3/4 21:16
 * @desc lambda简单编程
 */
public class LambdaTest {

    Runnable runnable1 = new Runnable() {
        @Override
        public void run() {
            System.out.println("普通方式");
        }
    };

    Runnable runnable = () -> System.out.println("lambda方式");



    public static void main(String[] args) {
        LambdaTest lambdaTest = new LambdaTest();
        lambdaTest.runnable.run();

        lambdaTest.runnable1.run();
    }
}
```



lambda函数式编程简单应用

```java
package net.tf.selfstudy;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/3/4 21:35
 * @desc
 */
public class LambdaTest2 {
    public static void main(String[] args) {
        CalcDemo calcDemo = (x, y) -> x + y;
        System.out.println(calcDemo.calc(5,7));

        CalcDemo calcDemo1 = ((x, y) -> x * y);
        System.out.println(calcDemo1.calc(34,10));
        

    }
}
```

```java
package net.tf.selfstudy;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/3/4 21:31
 * @desc lambda方式一
 */
@FunctionalInterface
public interface CalcDemo {
     int calc(int x, int y);
}
```

使用lambda遍历

```java
String[] strings = {"xx","oo","uu","pp"};
List list = new ArrayList();
list = Arrays.asList(strings);
list.forEach(System.out::println);
list.forEach(user -> {
    System.out.println("xxxxs" + user);
});
```

使用lambda删除指定元素

```java 
String[] strings1 = {"xx", "oo", "uu", "pp"};

List<String> list1 = new ArrayList<>();
for (String s : strings1
     ) {
    list1.add(s);
}

//传统迭代器删除指定元素
Iterator iterator = list1.iterator();
while (iterator.hasNext()) {
    String buffer = (String) iterator.next();
    if ("xx".equals(buffer)) {
        iterator.remove();
    }
}

//使用lambda删除指定元素
list1.removeIf(buffer -> "oo".equals(buffer));
list1.removeIf(b -> "uu".equals(b));

//使用lambda打印结果
list1.forEach(System.out::println);
```

#### 枚举

> 枚举就是让某个变量的取值只能为若干个值中的其中一个