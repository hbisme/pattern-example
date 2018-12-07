package strategy.dto;

import strategy.Duck;
import strategy.duckImpl.FlyWithRocket;

public class SpaceDuck extends Duck {
    FlyWithRocket flyWithRocket = new FlyWithRocket();

    public SpaceDuck() {
        super();
        super.setFlyingStragety(flyWithRocket);
    }

    @Override
    public void display() {
        System.out.println("我是太空鸭, 我身体是透明的.");
    }
}
