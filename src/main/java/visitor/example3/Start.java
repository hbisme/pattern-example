package visitor.example3;

/**
 * 案例: 大爷,大妈(访问者) 访问  三潭印月和花港观鱼(元素)
 *      这样当有新的访问者时就比较好扩展.
 * @author hubin
 * @date 2022年01月24日 4:21 下午
 */
public class Start {
    public static void main(String[] args) {
        WestLake westLake = new WestLake();
        SanTanYinYue shanTanYinYue = new SanTanYinYue();
        HuaGangGuanYu huaGangGuanYu = new HuaGangGuanYu();
        westLake.addElement(shanTanYinYue).add(huaGangGuanYu);

        DaMa daMa = new DaMa();
        westLake.evaluate(daMa);

        System.out.println("-------");
        DaYe daYe = new DaYe();
        westLake.evaluate(daYe);
    }
}
