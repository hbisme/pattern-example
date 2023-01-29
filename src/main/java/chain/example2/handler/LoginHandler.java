package chain.example2.handler;

import chain.example2.Member;

/**
 * @author hubin
 * @date 2023年01月05日 13:13
 */
public class LoginHandler extends Handler {
    @Override
    public void doHandler(Member member) {
        System.out.println(member.getLoginName() + "-账号密码检查完成");
        nextHandler.doHandler(member);
    }
}
