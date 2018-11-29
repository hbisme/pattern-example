package proxy;

/* 定义代理类 */
public class CarTimeProxy implements Moveable {

    // 被代理对象
    private Moveable car;

    public CarTimeProxy(Moveable car) {

        this.car = car;
    }

    // 实现接口
    @Override
    public void move() throws InterruptedException {
        System.out.println("汽车开始行驶...");
        Long begin = System.currentTimeMillis();
        car.move();
        Long end = System.currentTimeMillis();
        System.out.println("汽车行驶结束,行驶时间为:" + (end - begin));

    }




}
