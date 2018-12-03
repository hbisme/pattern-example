package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import proxy.Car;
import proxy.Moveable;

/**
 * JDK 动态代理测试类
 * */
public class JDKTest {
    public static void main(String[] args) throws InterruptedException {
        Car car = new Car();
        InvocationHandler h = new TimeHandler(car);
        Class<? extends Car> cls = car.getClass();

        InvocationHandler h2 = new LogHandler(car);




        /*
        * 参数1 类加载器
        * 参数2 实现接口
        * 参数3 InvocationHandler
        * */
        Moveable m = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h);
        m.move();
        System.out.println("--------");

        Moveable m2 = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h2);
        m2.move();
        System.out.println("---------");

        Moveable m3 = (Moveable)Proxy.newProxyInstance(m.getClass().getClassLoader(), m.getClass().getInterfaces(), h2);
        m3.move();



    }
}
