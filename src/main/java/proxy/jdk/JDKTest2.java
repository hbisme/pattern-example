package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import proxy.Car;
import proxy.Moveable;

/**
 * 泛型的动态代理
 * @author hubin
 * @date 2022年11月23日 15:00
 */
public class JDKTest2 {
    public static <T, E> E getTimeHandlerProxy(T target, Class<E> clazz) {

        // 2. 获取对应的 ClassLoader
        ClassLoader classLoader = target.getClass().getClassLoader();

        // 3. 获取所有接口的Class
        Class<?>[] interfaces = target.getClass().getInterfaces();

        // 4. 创建一个将传给代理类的调用请求处理器，处理所有的代理对象上的方法调用
        InvocationHandler handler1 = new TimeHandler(target);

        E o = (E) (Proxy.newProxyInstance(classLoader, interfaces, handler1));
        return o;

    }

    public static void main(String[] args) throws InterruptedException {
        Car car = new Car();
        Moveable proxy = JDKTest2.getTimeHandlerProxy(car, Moveable.class);
        proxy.move();

        System.out.println("------------");




    }
}
