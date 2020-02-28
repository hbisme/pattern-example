package visitor;

/**
 * 具体访问者
 */
public class CheckCar implements Visitor {
    @Override
    public void visit(Engine engine) {
        System.out.println("Check engine");
    }

    @Override
    public void visit(Body body) {
        System.out.println("Check body");
    }

}
