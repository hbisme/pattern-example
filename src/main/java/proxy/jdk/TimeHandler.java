package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {

    private Object targer;

    public TimeHandler(Object targer) {
        super();
        this.targer = targer;
    }

    /**
     * @param proxy:  被代理对象.
     * @param method: 被代理对象的方法
     * @param args:   方法的参数
     * @return 方法的返回值
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        long startTime = System.currentTimeMillis();
        System.out.println("汽车启动...");
        method.invoke(targer);
        long endTime = System.currentTimeMillis();
        System.out.println("汽车停止...");
        System.out.println("汽车行驶结束,行驶时间为:" + (endTime - startTime));
        return null;

    }
}
