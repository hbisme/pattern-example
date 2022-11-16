package visitor.example3;

/**
 * @author hubin
 * @date 2022年01月24日 4:24 下午
 */
public class DaMa implements Visitor{
    @Override
    public void visit(SanTanYinYue daMa) {
        System.out.println("大妈游玩三潭印月,感觉一般");
    }

    @Override
    public void visit(HuaGangGuanYu daYe) {
        System.out.println("大妈游玩花港观鱼,感觉很喜欢");
    }
}
