package visitor;


/**
 * 抽象访问者,
 */
public interface Visitor {
    void visit(Engine engine);
    void visit(Body body);

}

