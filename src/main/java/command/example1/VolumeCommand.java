package command.example1;

public class VolumeCommand implements Command {
    private Device device;

    public VolumeCommand(Device device) {
        this.device = device;
    }

    @Override
    public void exec() {
        // 执行命令调用音量+操作
        device.volumeUp();
    }

    @Override
    public void unexec() {
        // 反执行命令调用音量-操作
        device.volumeDown();
    }
}
