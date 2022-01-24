package strategy.example2.dto;

import strategy.example2.Duck;
import strategy.example2.duckImpl.FLyNoWay;

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
