package command.example1;

public class SwitchCommand  implements  Command{
    private Device device;

    public SwitchCommand(Device device) {
        this.device = device;
    }

    @Override
    public void exec() {
        // 执行命令调用开机操作
        device.on();
    }

    @Override
    public void unexec() {
        // 反执行命令调用关机操作
        device.off();
    }
}
