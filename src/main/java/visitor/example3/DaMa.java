package visitor.example3;

/**
 * @author hubin
 * @date 2022年01月24日 4:24 下午
 */
public class DaMa implements Visitor {
    @Override
    public void visit(SanTanYinYue sanTanYinYue) {
        System.out.println("大妈游玩" + sanTanYinYue.getViewName() + ",感觉一般");
    }

    @Override
    public void visit(HuaGangGuanYu huaGangGuanYu) {
        System.out.println("大妈游玩" + huaGangGuanYu.getView() + ",感觉很喜欢");
    }
}
