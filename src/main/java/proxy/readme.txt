
代理模式定义:
为其他对象提供一种代理,以控制这个对象的访问.

比如:
    购买火车票,不去火车站, 去车票代售点,这个代售点就是 代理对象,
 代理对象 可以增加功能,比如: 电话购票, 也能减少功能,比如: 不能退票.

 一般分静态代理和动态代理:
 静态代理: 代理和被代理对象在代理之前是确定的.他们都是实现相同的接口或者继承相同的抽象类.在程序运行前就已经存在代理类的字节码文件.

 动态代理:
    动态代理的源码是在程序运行期间由JVM根据反射等机制动态的生成，所以在运行前并不存在代理类的字节码文件.
    JDK 动态代理位于java.lang.reflect包下,一般主要涉及到以下两个类:
    1. Interface InvocationHandler: 该接口中仅定义了一个方法.
        public object invoke(Object obj, Method method, Object[] args)
        第一个参数指代理类, method指被代理的方法, args为该方法的参数数组.
        这个抽象方法在代理类中动态实现.

    2. Proxy: 该类即为动态代理类
        static Object newProxyInstance(ClassLoader loader, Class[] interfaces, InvocationHandler h)
        返回代理类的一个实例,返回后的代理类可以被当做代理类使用(可使用被代理类在接口中声明过的方法)

    所谓动态代理是这样一种class:
    它在运行时生成的class
    该class需要实现一组interface
    使用动态代理时,必须实现invocationHander接口

    实现步骤:
    1. 创建一个实现接口InvocationHandler的类,它必须实现invoke方法.
    2. 创建被代理的类和接口
    3. 调用Proxy中的静态方法,创建一个代理类
        newProxyInstance(ClassLoader loader(被代理类的类加载器), Class[] interfaces(被代理类实现的接口), InvocationHandler h)
    4. 通过代理调用方法

JDK 动态代理与CGLIB动态代理区别
    1. JDK动态代理 只能代理实现类带接口的类
    2. CGLIB动态代理针对类来实现代理的,对指定目标类产生一个子类,通过方法拦截技术,拦截所有父类方法的调用.




