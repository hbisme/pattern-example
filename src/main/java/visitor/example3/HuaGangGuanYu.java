package visitor.example3;

/**
 * 花港观鱼, 具体元素角色
 *
 * @author hubin
 * @date 2022年01月24日 4:07 下午
 */
public class HuaGangGuanYu implements Visitable {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getView() {
        return "花港观鱼的风景";
    }
}
