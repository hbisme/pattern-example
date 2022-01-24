package strategy.example2.duckImpl;

import strategy.example2.FlyingStragety;

public class FlyWithWin implements FlyingStragety {
    @Override
    public void performFly() {
        System.out.println("用翅膀飞行");
    }
}
