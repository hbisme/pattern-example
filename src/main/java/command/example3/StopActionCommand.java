package command.example3;

/**
 * @author hubin
 * @date 2023年01月07日 11:02
 */
public class StopActionCommand implements IActionCommand {
    private GPlayer gPlayer;

    public StopActionCommand(GPlayer gPlayer) {
        this.gPlayer = gPlayer;
    }

    @Override
    public void execute() {
        gPlayer.stop();
    }
}
