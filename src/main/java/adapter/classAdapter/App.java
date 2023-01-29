package adapter.classAdapter;

/**
 *
 * 类适配器模式
 */
public class App {
    public static void main(String[] args) {
        PowerAdapter powerAdapter = new PowerAdapter();
        powerAdapter.output5V();

    }
}
