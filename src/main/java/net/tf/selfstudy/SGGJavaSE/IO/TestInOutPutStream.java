package net.tf.selfstudy.SGGJavaSE.IO;

import org.junit.Test;

import java.io.*;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/3/12 22:43
 * @desc 流的基本使用
 */
public class TestInOutPutStream {

    @Test
    public void testReader() {
        File file = new File("IOxt.txt");
        File outFile = new File("IOxt5.txt");

        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            writer = new BufferedWriter(new FileWriter(outFile));
            String string;
            while ((string = reader.readLine()) != null) {
                writer.write(string);
                writer.newLine();
                writer.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testBufferInOut() {
        File inFile = new File("736462.png");
        File outFile = new File("736463.png");
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            bis = new BufferedInputStream(new FileInputStream(inFile));
            bos = new BufferedOutputStream(new FileOutputStream(outFile));

            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes,0, len);
                bos.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        bis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    @Test
    public void testInOut() {
        File outFile = new File("IO1xt.txt");
        File inFile = new File("IO2xt.txt");

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(outFile);
            fos = new FileOutputStream(inFile);

            byte[] b = new byte[5];
            int len;
            while ((len = fis.read(b)) != -1) {
                fos.write(b, 0, len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    @Test
    public void testFileoutPutStream() {
        File file = new File("IO1xt.txt");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            try {
                //会将原有的文件覆盖
                fos.write("xxx".getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test() {
        File file = new File("IOxt.txt");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            //20个字节一读
            byte[] bytes = new byte[5];
            //每次读入到字节数组中的长度
            int len;
            while ((len = fis.read(bytes)) != -1) {
//                for (int i = 0; i < len; i++) {
//                    System.out.println((char) bytes[i]);
//                }
                System.out.println(new String(bytes, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        File file = new File("IOxt.txt");

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            int flag;
            while ((flag = fileInputStream.read()) != -1) {
                System.out.println((char) flag);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
