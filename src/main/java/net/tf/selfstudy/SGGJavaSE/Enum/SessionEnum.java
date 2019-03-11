package net.tf.selfstudy.SGGJavaSE.Enum;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/3/11 20:19
 * @desc 使用enum定义枚举类
 */
interface EnumINfa {
    /**
     * 枚举类也可以实现接口，可以常规实现，这里在声明中实现
     */
    void show();
}

public enum SessionEnum implements EnumINfa{
    /**
     * 季节的枚举类
     */
    SPRING("spring", "春天") {
        @Override
        public void show() {
            System.out.println("xxx");
        }
    },
    WINNER("winner", "冬天") {
        @Override
        public void show() {
            System.out.println("xxx");
        }
    };

    private final String name;
    private final String desc;

    private SessionEnum(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "SessionEnum{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public static void main(String[] args) {
        //注意名称不要出错，否则会报异常
        SessionEnum sessionEnum = SessionEnum.valueOf("SPRING");
        //可以使用values来遍历枚举类
        SessionEnum[] enums = SessionEnum.values();
        for (SessionEnum s : enums
        ) {
            System.out.println(s);
        }
    }
}
