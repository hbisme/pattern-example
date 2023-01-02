package singleton;

/**
 * 枚举单例模式,未完成
 * @author hubin
 * @date 2023年01月01日 14:02
 */
public class EnumSingletonTest {
    public static void main(String[] args) {

        EnumSingleton instance1 = null;

        EnumSingleton instance2 = EnumSingleton.getInstance();
        instance2.setData(new Object());




    }
}
