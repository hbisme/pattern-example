package chain.example2.handler;

import chain.example2.Member;

/**
 * @author hubin
 * @date 2023年01月05日 13:14
 */
public class AuthHandler extends Handler{
    @Override
    public void doHandler(Member member) {
        System.out.println(member.getLoginName() + "-角色权限检查完成");

    }
}
