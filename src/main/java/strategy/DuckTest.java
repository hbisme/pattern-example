package strategy;

import strategy.dto.BigYellowDuck;
import strategy.dto.MallardDuck;
import strategy.dto.RedheadDuck;
import strategy.dto.RubberDuck;
import strategy.dto.SpaceDuck;

public class DuckTest {
    public static void main(String[] args) {
        System.out.println("测试鸭子程序...");

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.show();
        System.out.println("------");
        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.show();
        System.out.println("--------");
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.show();
        System.out.println("--------");
        BigYellowDuck bigYellowDuck = new BigYellowDuck();
        bigYellowDuck.show();
        System.out.println("---------");
        SpaceDuck spaceDuck = new SpaceDuck();
        spaceDuck.show();

    }
}
