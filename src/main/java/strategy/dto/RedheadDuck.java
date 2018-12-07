package strategy.dto;

import strategy.Duck;
import strategy.duckImpl.FlyWithWin;

public class RedheadDuck extends Duck {
    FlyWithWin flyWithWin = new FlyWithWin();

    public RedheadDuck() {
        // 构造函数要放在开头
        super();
        super.setFlyingStragety(flyWithWin);
    }

    @Override
    public void display() {
        System.out.println("红头鸭,我的头是红色的");
    }
}
