package chain.example2.handler;

import chain.example2.Member;
import chain.example2.handler.Handler;

/**
 * @author hubin
 * @date 2023年01月05日 13:10
 */
public class ValidateHadnler extends Handler {
    @Override
    public void doHandler(Member member) {
        System.out.println(member.getLoginName() + "-非空检查完成.");
        nextHandler.doHandler(member);
    }
}
