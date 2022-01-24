package command.example2;

/**
 * 开发中断的命令
 */
public class SuspendCommand extends Command {
    public SuspendCommand(Developer developer) {
        super(developer);
    }

    @Override
    public void execute(Requirement requirement) {
        this.developer.suspend(requirement);
    }
}

