package strategy.example2.dto;

import strategy.example2.Duck;
import strategy.example2.duckImpl.FLyNoWay;

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
