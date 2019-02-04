package net.tf.chapter06;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/1/19 9:34
 * @desc 缓存实例的不可变类
 */
public class CacheClass {
    private final String name;

    private CacheClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    /**
     * 设置最大缓存数
     */
    private static int MAX_SIZE = 10;

    /**
     * 使用数组来存放已经缓存的实例
     */
    private static CacheClass[] caches;

    /**
     * 记录缓存实例在缓存中的位置
     * pos-1是为最新缓存的实例
     */
    private static int pos = 0;

    public static CacheClass valueOf(String name) {
        //遍历已经缓存的对象
        for (int i = 0; i < MAX_SIZE; i++) {
            //如果已经有相同的实例，则直接返回该实例
            if (caches[i] != null && caches[i].getName().equals(name)) {
                return caches[i];
            }
        }
        //如果缓存池已满，把刚刚生成的对象放在最开始的位置
        if (pos == MAX_SIZE) {
            caches[0] = new CacheClass(name);
            pos = 1;
            //此时将新创建的对象缓存起来
        } else {
            caches[pos++] = new CacheClass(name);
        }
        return caches[pos - 1];
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            CacheClass c = (CacheClass) obj;
            return c.getName().equals(((CacheClass) obj).getName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public static void main(String[] args) {
        CacheClass cacheClass = CacheClass.valueOf("hello");
    }
}
