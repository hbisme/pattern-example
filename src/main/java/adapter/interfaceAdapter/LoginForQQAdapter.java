package adapter.interfaceAdapter;

import java.util.Date;

/**
 *
 * QQ登录
 */
public class LoginForQQAdapter extends AbstractAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        if (!support(adapter)) {
            return null;
        }

        return super.login(id, "QQ登录");

    }
}
