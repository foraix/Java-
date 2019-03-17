# 多线程

## 基本概念

+ 程序(program)：为了完成特定任务，用某种语言编写的一组指令集合。指一段静态的代码，静态对象
+ 进程(process)：是程序的一个执行过程，或是正在运行的一个程序。是动态的
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

  > 先到先服，使用时间片策略
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
public static void main(String[] args) {
        SubThread subThread = new SubThread();
        subThread.start();
    }
```

## 其他

+ 每个Java程序都有一个隐含主线程即main()方法