package strategy.example2.dto;

import strategy.example2.Duck;
import strategy.example2.duckImpl.FlyWithWin;

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
