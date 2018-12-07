package strategy.duckImpl;

import strategy.FlyingStragety;

public class FlyWithWin implements FlyingStragety {
    @Override
    public void performFly() {
        System.out.println("用翅膀飞行");
    }
}
