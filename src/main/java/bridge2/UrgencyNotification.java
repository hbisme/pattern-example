package bridge2;

public class UrgencyNotification extends Notification{
    public UrgencyNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        System.out.print("[重要告警] -> ");
        msgSender.send(message);
    }
}
