package command.example1;

// 控制器类
public class Controller {
    private Command okCommand;
    private Command verticalCommand;
    private Command horizontalCommand;

    // 绑定OK键命令
    public void bindOKCommand(Command okCommand) {
        this.okCommand = okCommand;
    }

    // 绑定上下方向键命令
    public void bindVerticalCommand(Command verticalCommand) {
        this.verticalCommand = verticalCommand;
    }

    // 绑定左右方向键命令
    public void bindHorizontalCommand(Command horizontalCommand) {
        this.horizontalCommand = horizontalCommand;
    }

    //
    public void buttonOKHold() {
        System.out.println("长按ok键..");
        okCommand.exec();
    }


    public void buttonOKClick() {
        System.out.println("单击ok键");
        okCommand.unexec();
    }


    public void buttonUpClick() {
        System.out.println("单击↑按键");
        verticalCommand.exec();
    }

    public void buttonDownClick() {
        System.out.println("单击↓按键…");
        verticalCommand.unexec();
    }


    public void buttonLeftClick() {
        System.out.println("单击←按键");
        horizontalCommand.exec();
    }

    public void buttonRightClick() {
        System.out.println("单击→按键…");
        horizontalCommand.unexec();
    }

}
