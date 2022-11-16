package visitor.example3;

/**
 * 三潭印月, 具体元素角色
 *
 * @author hubin
 * @date 2022年01月24日 4:05 下午
 */
public class SanTanYinYue implements Visitable {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
