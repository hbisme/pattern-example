package visitor;

/**
 * 抽象元素,定义一个accept方法,该方法通常以一个抽象访问者作为参数.
 */
public interface Visitable {
    void accept(Visitor visitor);
}
