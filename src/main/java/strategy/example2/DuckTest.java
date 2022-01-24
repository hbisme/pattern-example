package strategy.example2;

import strategy.example2.dto.BigYellowDuck;
import strategy.example2.dto.MallardDuck;
import strategy.example2.dto.RedheadDuck;
import strategy.example2.dto.RubberDuck;
import strategy.example2.dto.SpaceDuck;

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
