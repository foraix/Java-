package net.tf.selfstudy.SGGJavaSE.Exception;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/3/7 22:25
 * @desc
 */
public class MyException extends RuntimeException{
    /**
     * 提供唯一序列号
     */
    static final long serialVersionUID = -7034897190745766560L;

    public MyException() {
        super("传入类型不匹配");
    }

    public MyException(String message) {
        super(message);
    }
}
