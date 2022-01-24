package visitor.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构,是一个元素的集合,用于存放元素对象,且提供遍历其内部元素的方法.
 */
public class Car {
    private List<Visitable> visit = new ArrayList<>();
    public void addVisit(Visitable visitable) {
        visit.add(visitable);
    }

    public void show(Visitor visitor) {
        for (Visitable visitable : visit) {
            visitable.accept(visitor);
        }
    }

}
