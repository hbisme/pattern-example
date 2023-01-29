package command.example3;

/**
 * 控制器(controller)与播放器内核(gPlayer)解耦
 * 如果以后想扩展命令,只需增加Action类,控制器类无需改动.
 *
 */
public class App {
    public static void main(String[] args) {
        Controller controller = new Controller();
        GPlayer gPlayer = new GPlayer();
        PlayActionCommand playActionCommand = new PlayActionCommand(gPlayer);
        PauseActionCommand pauseAction = new PauseActionCommand(gPlayer);
        StopActionCommand stopActionCommand = new StopActionCommand(gPlayer);

        controller.execute(playActionCommand);
        System.out.println("------------");
        controller.addAction(pauseAction);
        controller.addAction(stopActionCommand);
        controller.executes();


    }
}
