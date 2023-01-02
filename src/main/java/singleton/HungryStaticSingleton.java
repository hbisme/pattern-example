package singleton;

/**
 * 饿汉的单例模式
 */
public class HungryStaticSingleton {
    private static final HungryStaticSingleton hungryStaticSingleton;

    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {
    }

    public static HungryStaticSingleton GetInstance() {
        return hungryStaticSingleton;
    }
}
