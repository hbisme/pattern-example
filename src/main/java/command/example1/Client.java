package command.example1;

public class Client {
    public static void main(String[] args) {
        System.out.println("===客户端用【可编程式遥控器】操作电器===");

        Device tv = new Tv();
        Device radio = new Radio();
        Controller controller = new Controller();

        //绑定【电视机】的【命令】到【控制器按键】
        controller.bindOKCommand(new SwitchCommand(tv));

        controller.bindVerticalCommand(new ChannelCommand(tv));

        controller.bindHorizontalCommand(new VolumeCommand(tv));

        controller.buttonOKHold();
        controller.buttonUpClick();
        controller.buttonUpClick();
        controller.buttonDownClick();
        controller.buttonLeftClick();

        // 绑定【收音机】的【命令】到【控制器按键】
        System.out.println("------------");

        controller.bindOKCommand(new SwitchCommand(radio));
        controller.bindVerticalCommand(new ChannelCommand(radio));
        controller.bindHorizontalCommand(new VolumeCommand(radio));

        controller.buttonOKHold();
        controller.buttonUpClick();
        controller.buttonUpClick();
        controller.buttonDownClick();
        controller.buttonLeftClick();
    }
}
