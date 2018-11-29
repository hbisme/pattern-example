package proxy;

import java.util.Random;

/* 定义被代理类 */
public class Car implements Moveable {
    @Override
    public void move() throws InterruptedException {
        Thread.sleep(new Random().nextInt(1000));
        System.out.println("正在开车中...");


    }
}
