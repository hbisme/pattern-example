package adapter.interfaceAdapter;

/**
 * @author hubin
 * @date 2023年01月04日 20:41
 */
public class App {
    public static void main(String[] args) {
        PassportForThirdAdapter passportForThirdAdapter = new PassportForThirdAdapter();
        ResultMsg id_qq = passportForThirdAdapter.loginForQQ("id_qq");
        System.out.println(id_qq);


        ResultMsg id_wx = passportForThirdAdapter.loginForWechat("id_wx");
        System.out.println(id_wx);

    }
}
