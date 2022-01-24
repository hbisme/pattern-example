package visitor.example1;

/**
 * 具体元素,实现accept方法,在accept方法中调用访问者的访问方法以便完成一个元素的操作.
 */
public class Body implements Visitable {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
