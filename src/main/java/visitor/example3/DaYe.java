package visitor.example3;

/**
 * @author hubin
 * @date 2022年01月24日 4:27 下午
 */
public class DaYe implements Visitor {
    @Override
    public void visit(SanTanYinYue sanTanYinYue) {
        System.out.println("大爷游玩" + sanTanYinYue.getViewName() + ",感觉很喜欢");
    }

    @Override
    public void visit(HuaGangGuanYu huaGangGuanYu) {
        System.out.println("大爷游玩" + huaGangGuanYu.getView() + ",感觉一般");
    }
}
