package net.tf.selfstudy.SGGJavaSE.IO;

import org.junit.Test;

import java.io.File;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/3/11 21:31
 * @desc
 */
public class IO {
    @Test
    public void test() {

    }

    public static void main(String[] args) {
        //File可以是一个文件，也可以是个文件夹
        File file = new File("IOxt.txt");
        //使用file.renameTo()，需要注意被复制对象不存在，复制对象存在
        System.out.println(file.lastModified());
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        //只读取文件名
//        file.list();
        //读取文件
//        file.listFiles();
    }
}
