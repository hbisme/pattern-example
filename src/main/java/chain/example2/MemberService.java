package chain.example2;

import chain.example2.handler.AuthHandler;
import chain.example2.handler.LoginHandler;
import chain.example2.handler.ValidateHadnler;

/**
 * @author hubin
 * @date 2023年01月05日 13:15
 */
public class MemberService {
    public static void login(Member member) {
        ValidateHadnler validateHadnler = new ValidateHadnler();
        LoginHandler loginHandler = new LoginHandler();
        AuthHandler authHandler = new AuthHandler();
        validateHadnler.next(loginHandler);
        loginHandler.next(authHandler);
        validateHadnler.doHandler(member);
    }
}
