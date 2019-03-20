# 多线程

## 基本概念

+ 程序(program)：为了完成特定任务，用某种语言编写的一组指令集合。指一段静态的代码，静态对象
+ 进程(process)：是程序的一个执行过程，或是正在运行的一个程序，是动态的
+ 线程(thread)：进程进一步细分为线程，是一个程序内部的一条执行路径。
+ 如果一个程序可以同时执行多个线程，就是支持多线程的

## 使用场景

+ 程序需要执行两个或者多个任务
+ 程序需要实现一些需要等待的任务，像搜索，网络操作，文件读写等
+ 需要一些后台运行的程序

## Thread类

+ 每个线程都是通过某个特定的thread对象的run()方法完成操作的，常常把run方法主题称之为线程体
+ 通过该对象的start()方法来调用该线程
+ 线程一经启动就不能再调用start方法
+ 不能通过run方法启动线程，必须使用start()方法

### 线程优先级

+ 调度策略：

  > 时间片：轮转，先到先服务
  >
  > 抢占式：高优先级的线程强制CPU

+ Java调度算法

  > 先到先服务，使用时间片策略
  >
  > 对高优先级，使用优先调度的抢占式策略

+ 线程优先级控制

  > MAX_POIORIT(10)
  >
  > MIN_POIORIT(1)
  >
  > NORM_POIORIT(5)

+ 所需要的方法

```java
//获取当前线程优先级的数值
subThread.getPriority()
```

~~~ java
//设置当前线程优先级的数值
subThread.setPriority(Int i);
subThread.setPriority(Thread.MAX_PRIORITY);
~~~

+ 线程创建的时候会继承父类的优先级
+ 并不是说线程优先级越高就先执行，只能说抢到执行权利的机会会变大

### 线程常用方法

> ```java
> //获取当前线程的名字
> Thread.currentThread().getName()
> ```
>
> ```java
> //获取运行当前线程对象
> Thread.currentThread()
> ```
>
> ```java
> //设置当前运行的线程的名字
> Thread.currentThread().setName("MyThread");
> ```
>
> ```java
> //释放当前线程执行权,但是释放后依然可能抢到线程执行权
> Thread.yield();
> ```
>
> ``` java
> //执行join()方法会使该强制执行该线程，直到结束
> subThread.join();
> ```
>
> ```java
> //用以判断该线程是否存活
> subThread.isAlive()
> ```
>
> ~~~ java
> //指定单位为毫秒的的休眠,该方法产生的异常只能try catch
> subThread.sleep(long l)
> ~~~
>
> ​	线程通信的方法 wait() notify() notifyAll()

### 练习

#### 模拟窗口售票

> 可能会出现输出不一致是因为输出线程没有抢到执行权

```java
class Window extends Thread {
     /**
     * 将ticket申明为static，好处是票数是固定的，但是static的变量，生命周期长，耗费资源
     */
    private static Integer ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket >= 1) {
                System.out.println(Thread.currentThread().getName() + "出售了一张票,当前剩余：" + Window.ticket-- + "张");
            } else {
                break;
            }
        }
    }
}

public class TestWindow {
    
    public static void main(String[] args) {
        Window window1 = new Window();
        Window window2 = new Window();
        Window window3 = new Window();

        window1.setName("window1");
        window2.setName("window2");
        window3.setName("window3");

        window1.start();
        window2.start();
        window3.start();
    }
}
```

+ 问题：该售票程序会出现问题，是因为，可能多个窗口类会同时进入到if语句中，造成票数的重复打印，属于线程安全问题，可能会 	出现，需要处理。

+ 解决方案：思路，一个线程在操作ticket这个资源时，其余线程不能参与进来，只有当该操作完成后释放，其余线程继续竞争该资源

+ 如何解决：使用线程的同步机制

  + 方式一：同步代码块

  ~~~ java
  synchronized(同步监视器) {
      //需要被同步的代码
  }
  ~~~

  共享数据：多个线程操作的同一数据

  同步监视器：由一个类的对象来充当，那个线程获取到这个同步监视器，谁就执行大括号内的内容，俗称，锁。

  要求所有的线程共用同一把锁,改进后为

  ``` java
  class TestWindow4 implements Runnable {
  
      private int ticket = 100;
      @Override
      public void run() {
          while (true) {
              synchronized (this) {
                  if (ticket > 0) {
                      System.out.println(Thread.currentThread().getName() + "出售了一张票,当前剩余：" + ticket-- + "张");
                  } else {
                      break;
                  }
              }
          }
      }
  }
  ```

  + 方式二：同步方法

  ~~~ java
  public synchronized void show() {
      //需要同步的方法体
  }
  ~~~




### 创建

+ 方式一：通过继承Thread类来实现

  ```java
  class SubThread extends Thread {
      @Override
      public void run() {
          for (int i = 0; i < 100; i++) {
              System.out.println(i);
          }
      }
  }
  ```

  ```java
     public static void main(String[] args) {
          SubThread subThread = new SubThread();
          //会调用相应的run方法
          subThread.start();
      }
  ```

+ 方式二：通过实现Runnable接口来实现

```java
Runnable run = () -> System.out.println("xx");
        Thread thread = new Thread(run);
        thread.start();
```

+  联系：Thread基类实现了Runnable接口
+ 一般是实现由于继承（首先避免了单继承的局限性，同时也适用于多个线程操作同一个资源，如上面的售票类，就不需要将ticket声明为static）

##  其他

+ 每个Java程序都有一个隐含主线程即main()方法
+ 不应该在方法中显示的创建线程，最好应该通过线程池提供,下个代码块不可取

```java
public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                System.out.println("xxx");
            }
        }.start();
    }
```

+ 只要是线程就会实现Runnable接口，Thread是间接实现，Runnable是直接实现