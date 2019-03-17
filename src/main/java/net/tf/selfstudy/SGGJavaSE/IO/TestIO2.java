package net.tf.selfstudy.SGGJavaSE.IO;

import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/3/13 21:54
 * @desc 转换流的使用
 */
public class TestIO2 {
    @Test
    public void test() {
        //解码
        File file = new File("dbcp.txt");
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader bf = new BufferedReader(isr);

            //编码
            File file1 = new File("dbcp1.txt");
            fos = new FileOutputStream(file1);
            OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);

            String s = null;
            while ((s = bf.readLine()) != null) {
                bw.write(s);
                bw.newLine();
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
