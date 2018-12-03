package proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CglibProxy implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();

    /**
     * 得到代理类
     * @param clazz 被代理类的类对象
     */
    public Object getProxy(Class clazz) {

        // 设置创建子类的类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /**
     * 拦截所有目标类方法的调用
     *
     * @param obj         目标类的实例
     * @param method      目标方法的反射对象
     * @param args        方法的参数
     * @param methodProxy 代理类的实例
     */
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("火车出发...");
        methodProxy.invokeSuper(obj, args);
        System.out.println("火车到达...");
        return null;
    }
}
