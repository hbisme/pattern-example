package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import proxy.Car;
import proxy.Moveable;

/**
 * JDK 动态代理测试类
 */
public class JDKTest {
    public static void main(String[] args) throws InterruptedException {
        // 1. 创建被代理的对象，Moveable接口的实现类
        Car car = new Car();
        // 2. 获取对应的 ClassLoader
        ClassLoader classLoader = car.getClass().getClassLoader();

        // 3. 获取所有接口的Class
        Class<?>[] interfaces = car.getClass().getInterfaces();

        // 4. 创建一个将传给代理类的调用请求处理器，处理所有的代理对象上的方法调用
        InvocationHandler h1 = new TimeHandler(car);

        // 4. 创建一个将传给代理类的调用请求处理器，处理所有的代理对象上的方法调用
        InvocationHandler h2 = new LogHandler(car);




        /*
         * 5.根据上面提供的信息，创建代理对象 在这个过程中，
         * JDK会通过根据传入的参数信息动态地在内存中创建和.class 文件等同的字节码,
         * 然后根据相应的字节码转换成对应的class，
         * 然后调用newInstance()创建代理实例.
         *
         * 获取动态生成的代理类的对象须借助 Proxy 类的 newProxyInstance 方法
         * 参数1 类加载器
         * 参数2 实现接口
         * 参数3 InvocationHandler
         * */
        Moveable m = (Moveable) Proxy.newProxyInstance(classLoader, interfaces, h1);
        m.move();
        System.out.println("--------");

        Moveable m2 = (Moveable) Proxy.newProxyInstance(classLoader, interfaces, h2);
        m2.move();
        System.out.println("---------");

        Moveable m3 = (Moveable) Proxy.newProxyInstance(m.getClass().getClassLoader(), m.getClass().getInterfaces(), h2);
        m3.move();

    }
}
