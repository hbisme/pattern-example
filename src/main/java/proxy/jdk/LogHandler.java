package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogHandler implements InvocationHandler {
    private Object targer;

    public LogHandler(Object targer){
        this.targer = targer;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开启行车记录仪");
        method.invoke(targer);
        System.out.println("关闭行车记录仪");
        return null;
    }
}
