package visitor;

/**
 * 具体访问者
 */
public class PrintCar implements Visitor {
    @Override
    public void visit(Engine engine) {
        System.out.println("Visiting engine");
    }

    @Override
    public void visit(Body body) {
        System.out.println("Visiting body");
    }

}
