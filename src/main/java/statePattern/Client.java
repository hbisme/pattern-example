package statePattern;

public class Client {
    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        switcher.switcherOn();
        switcher.switcherOn();
        switcher.switcherOff();
        switcher.switcherOff();

    }

}
