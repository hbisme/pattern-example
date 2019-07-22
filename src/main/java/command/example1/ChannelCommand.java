package command.example1;

public class ChannelCommand implements Command {

    private Device device;

    public ChannelCommand(Device device) {
        this.device = device;
    }


    @Override
    public void exec() {
        device.channelUp();
    }

    @Override
    public void unexec() {
        device.channelDown();
    }
}
