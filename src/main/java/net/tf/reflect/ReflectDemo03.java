package net.tf.reflect;

import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author hy
 * @version 1.00
 * @time 2019/6/3 20:03
 * @desc
 */

public class ReflectDemo03 {


    @Test
    public void demo01() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("config.properties"));
        String classname = prop.getProperty("classname");
        String methodname = prop.getProperty("methodname");
        System.out.println(classname);
        System.out.println(methodname);
    }
}
