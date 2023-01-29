package command.example3;

/**
 * @author hubin
 * @date 2023年01月07日 11:01
 */
public class PauseActionCommand implements IActionCommand {
    private GPlayer gPlayer;

    public PauseActionCommand(GPlayer gPlayer) {
        this.gPlayer = gPlayer;
    }

    @Override
    public void execute() {
        gPlayer.pause();
    }
}
