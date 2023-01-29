package command.example3;

/**
 * 实际的命令
 */
public class PlayActionCommand implements IActionCommand {
    private GPlayer gPlayer;

    public PlayActionCommand(GPlayer gPlayer) {
        this.gPlayer = gPlayer;
    }

    @Override
    public void execute() {
        gPlayer.play();
    }
}
