package visitor.example3;

/**
 * @author hubin
 * @date 2022年01月24日 4:27 下午
 */
public class DaYe implements Visitor {
    @Override
    public void visit(SanTanYinYue daMa) {
        System.out.println("大爷游玩三潭印月,感觉很喜欢");
    }

    @Override
    public void visit(HuaGangGuanYu daYe) {
        System.out.println("大爷游玩花港观鱼,感觉一般");
    }
}
