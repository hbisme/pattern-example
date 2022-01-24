package bridge2;

import java.util.ArrayList;
import java.util.List;

public class Starter {
    public static void main(String[] args) {
        List<String> mail = new ArrayList<>();
        mail.add("hb.com");
        EmailMsgSender emailMsgSender = new EmailMsgSender(mail);

        List<String> phone = new ArrayList<>();
        phone.add("hb");
        TelephoneMsgSender telephoneMsgSender = new TelephoneMsgSender(phone);

        ServerNotification serverNotification = new ServerNotification(emailMsgSender);
        UrgencyNotification urgencyNotification = new UrgencyNotification(telephoneMsgSender);

        List<Notification> alerts = new ArrayList<>();
        alerts.add(serverNotification);
        alerts.add(urgencyNotification);

        alerts.forEach(x -> x.notify("发送告警"));
    }
}
