package proxy;

public class ProxyTest {
    public static void main(String[] args) throws InterruptedException {

        // 因为附加的行为和被代理类的行为时不耦合的,所以可以链式调用,
        // 比如下面的carLogProxy.move(); 和carLogProxy1.move();
        Car car = new Car();
        Moveable carTimeProxy = new CarTimeProxy(car);
        Moveable carLogProxy = new CarLogProxy(carTimeProxy);
        carLogProxy.move();

        System.out.println("------------");

        Car car1 = new Car();
        Moveable carLogProxy1 = new CarLogProxy(car1);
        Moveable carTimeProxy1 = new CarTimeProxy(carLogProxy1);
        carTimeProxy1.move();


    }
}
