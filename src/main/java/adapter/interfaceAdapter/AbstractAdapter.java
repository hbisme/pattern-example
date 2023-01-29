package adapter.interfaceAdapter;

/**
 * @author hubin
 * @date 2023年01月04日 20:12
 */
public abstract class AbstractAdapter extends PassportService implements ILoginAdapter {
    @Override
    public ResultMsg login(String id, Object adapter) {
        return new ResultMsg(200, "注册成功", adapter);
    }
}
