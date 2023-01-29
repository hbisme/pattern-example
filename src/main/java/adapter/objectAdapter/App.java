package adapter.objectAdapter;

/**
 * 对象适配器
 *
 */
public class App {
    public static void main(String[] args) {
        AC220 ac220 = new AC220();
        PowerAdapter powerAdapter = new PowerAdapter(ac220);
        powerAdapter.output5V();
    }
}
