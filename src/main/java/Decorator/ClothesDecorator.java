package Decorator;

public abstract class ClothesDecorator implements Person {

    /** 装饰器中要使用 被装饰器的对象(老王), 构造方法传入 */
    protected Person person;

    public ClothesDecorator(Person person) {
        this.person = person;
    }

}
