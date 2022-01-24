package strategy.example2.duckImpl;

import strategy.example2.FlyingStragety;

public class FLyNoWay implements FlyingStragety {
    @Override
    public void performFly() {
        System.out.println("我不会飞");
    }
}
