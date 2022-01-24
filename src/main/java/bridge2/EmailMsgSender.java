package bridge2;

import java.util.List;

public class EmailMsgSender implements MsgSender {
    private List<String> mail;

    public EmailMsgSender(List<String> mail) {
        this.mail = mail;
    }

    @Override
    public void send(String message) {
        System.out.println("邮箱发送消息");
    }
}

