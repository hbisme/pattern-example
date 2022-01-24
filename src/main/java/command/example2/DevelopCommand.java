package command.example2;

/**
 * 开始开发的命令
 */
public class DevelopCommand extends Command {

    public DevelopCommand(Developer developer) {
        super(developer);
    }

    @Override
    public void execute(Requirement requirement) {
        developer.develop(requirement);
    }
}
