package adapter.interfaceAdapter;

/**
 * @author hubin
 * @date 2023年01月04日 20:34
 */
public class PassportForThirdAdapter implements IpassportForThird {
    @Override
    public ResultMsg loginForQQ(String openId) {
        return processLogin(openId, LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWechat(String openId) {
        return processLogin(openId, LoginForWechatAdapter.class);
    }

    private ResultMsg processLogin(String id, Class<? extends ILoginAdapter> clazz) {
        ILoginAdapter adapter = null;

        try {
            adapter = clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }


        if (adapter.support(adapter)) {
            return adapter.login(id, adapter);
        } else {
            return null;
        }
    }
}
