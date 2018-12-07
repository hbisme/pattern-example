package strategy.dto;

import strategy.Duck;
import strategy.FlyingStragety;
import strategy.duckImpl.FlyWithWin;

public class MallardDuck extends Duck {

    FlyWithWin flyWithWin = new FlyWithWin();

    public MallardDuck() {
        super();
        super.setFlyingStragety(flyWithWin);
    }

    @Override
    public void display() {
        System.out.println("野鸭, 脖子是绿色的");
    }



}
