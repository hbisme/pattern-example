package command.example3;

import java.util.ArrayList;
import java.util.List;

/**
 * 控制类
 * @author hubin
 * @date 2023年01月07日 11:03
 */
public class Controller {
    private List<IActionCommand> actions = new ArrayList<>();

    public void addAction(IActionCommand iActionCommand) {
        actions.add(iActionCommand);
    }

    public void execute(IActionCommand iActionCommand) {
        iActionCommand.execute();
    }

    public void executes() {
        for (IActionCommand action : actions) {
            action.execute();
        }
    }

}
