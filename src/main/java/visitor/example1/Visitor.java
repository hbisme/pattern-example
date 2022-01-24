package visitor.example1;


import visitor.example1.Body;
import visitor.example1.Engine;

/**
 * 抽象访问者,
 */
public interface Visitor {
    void visit(Engine engine);
    void visit(Body body);

}

