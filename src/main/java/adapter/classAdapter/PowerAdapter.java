package adapter.classAdapter;

/**
 * @author hubin
 * @date 2023年01月04日 19:38
 */
public class PowerAdapter extends AC220 implements DC5V {

    @Override
    public int output5V() {
        int input = super.outputAC220V();
        int output = input / 44;
        System.out.println("[类适配器]Adapter将电压从:" + input + " 转换输出电压为: " + output + "V");
        return output;
    }
}
