package command.example2;

public class CommandTest {
    public static void main(String[] args) {
        Developer xiaoMing = new Developer("小明");
        Command developCommand = new DevelopCommand(xiaoMing);
        Command suspendCommand = new SuspendCommand(xiaoMing);
        Requirement requirement = new Requirement("新增黑名单需求");
        TechnicalManager technicalManager = new TechnicalManager("大明");
        technicalManager.setCommand(developCommand);
        technicalManager.action(requirement);
        System.out.println("==========");
        technicalManager.setCommand(suspendCommand);
        technicalManager.action(requirement);






    }
}
