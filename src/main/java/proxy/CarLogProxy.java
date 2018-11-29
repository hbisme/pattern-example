package proxy;

/* 定义代理类 */
public class CarLogProxy implements Moveable {

    // 被代理对象
    private Moveable car;

    public CarLogProxy(Moveable car) {

        this.car = car;
    }

    // 实现接口
    @Override
    public void move() throws InterruptedException {
        System.out.println("行车记录仪开始记录...");
        car.move();
        System.out.println("行车记录仪结束记录.");

    }




}