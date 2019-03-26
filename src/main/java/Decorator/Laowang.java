package Decorator;

public class Laowang implements Person {
    @Override
    public Double cost() {
        return 0.0;
    }

    @Override
    public void show() {
        System.out.println("什么衣服都没穿的老王.");
    }
}
