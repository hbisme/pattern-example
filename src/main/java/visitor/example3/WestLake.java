package visitor.example3;

import java.util.ArrayList;
import java.util.List;

/**
 * 西湖类,元素的容器类的数据结构
 *
 * @author hubin
 * @date 2022年01月24日 4:11 下午
 */
public class WestLake {
    List<Visitable> list = new ArrayList<Visitable>();

    public List<Visitable> addElement(Visitable visitable) {
        list.add(visitable);
        return list;
    }


    public void evaluate(Visitor visitor) {
        for (Visitable visitable : list) {
            visitable.accept(visitor);
        }
    }


}
