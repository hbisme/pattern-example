package statePattern;

public class Off implements State {
    @Override
    public void switchOn(Switcher switcher) {
        System.out.println("OK...灯亮");
        switcher.setState(new On());
    }

    @Override
    public void switchOff(Switcher switcher) {
        System.out.println("WARN!!!断电状态无需再关");
    }
}
