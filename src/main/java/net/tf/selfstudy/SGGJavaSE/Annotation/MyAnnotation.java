package net.tf.selfstudy.SGGJavaSE.Annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/3/11 20:53
 * @desc 自定义注解
 */
//保存在class文件中，jvm加载class文件后，依然存在
@Retention(RetentionPolicy.RUNTIME)
//@Target用以指定哪些结构可以被修饰
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})public @interface MyAnnotation {
    String value() default "MyAnnotation";
}
