package visitor.example3;

/**
 * 抽象元素角色
 */
public interface Visitable {
    void accept(Visitor visitor);
}
