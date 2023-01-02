package singleton;

/**
 * 饿汉模式1
 */
public class App1 {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
    }


    static class Singleton {
        private static final Singleton instance = new Singleton();

        private Singleton() {
        }

        public static Singleton getInstance() {
            return instance;
        }
    }
}
