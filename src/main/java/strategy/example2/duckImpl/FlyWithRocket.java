package strategy.example2.duckImpl;

import strategy.example2.FlyingStragety;

public class FlyWithRocket implements FlyingStragety {
    @Override
    public void performFly() {
        System.out.println("用火箭飞行.");
    }
}
