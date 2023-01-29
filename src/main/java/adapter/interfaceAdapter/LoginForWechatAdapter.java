package adapter.interfaceAdapter;

/**
 * 微信登录
 * @author hubin
 * @date 2023年01月04日 20:28
 */
public class LoginForWechatAdapter extends AbstractAdapter {


    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWechatAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        if (!support(adapter)) {
            return null;
        }

        return super.login(id, "微信登录");

    }
}
