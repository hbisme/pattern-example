package strategy.duckImpl;

import strategy.FlyingStragety;

public class FlyWithRocket implements FlyingStragety {
    @Override
    public void performFly() {
        System.out.println("用火箭飞行.");
    }
}
