package strategy.dto;

import strategy.Duck;
import strategy.duckImpl.FLyNoWay;

public class BigYellowDuck extends Duck {

    private FLyNoWay fLyNoWay = new FLyNoWay();

    public BigYellowDuck() {
        super();
        super.setFlyingStragety(fLyNoWay);
    }

    @Override
    public void display() {
        System.out.println("我是明星鸭子,大黄鸭");
    }
}
