package command.example2;

public class TechnicalManager {
    private String name;
    private Command command;

    public TechnicalManager(String name) {
        this.name = name;
    }

    public void action(Requirement requirement) {
        command.execute(requirement);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
