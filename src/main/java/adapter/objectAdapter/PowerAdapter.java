package adapter.objectAdapter;


/**
 * 对象适配器模式
 *
 */
public class PowerAdapter implements DC5V {
    AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int output5V() {
        int input = ac220.outputAC220V();
        int output = input / 44;
        System.out.println("[对象适配器]Adapter将电压从:" + input + " 转换输出电压为: " + output + "V");
        return output;
    }
}
