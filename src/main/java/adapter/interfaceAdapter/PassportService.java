package adapter.interfaceAdapter;

/**
 * 老系统中的登录方法
 */
public class PassportService {
    public ResultMsg regist(String username, String password) {
        return new ResultMsg(200, "注册成功", username);
    }

    // public ResultMsg login(String username, String password) {
    //     return null;
    // }

}
