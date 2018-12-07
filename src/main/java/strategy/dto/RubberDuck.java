package strategy.dto;

import strategy.Duck;
import strategy.duckImpl.FLyNoWay;

public class RubberDuck extends Duck {

    FLyNoWay fLyNoWay = new FLyNoWay();

    public RubberDuck() {
        super();
        super.setFlyingStragety(fLyNoWay);
    }

    @Override
    public void display() {
        System.out.println("我是橡胶鸭.身体是黄色的");
    }
}
