package strategy.duckImpl;

import strategy.FlyingStragety;

public class FLyNoWay implements FlyingStragety {
    @Override
    public void performFly() {
        System.out.println("我不会飞");
    }
}
