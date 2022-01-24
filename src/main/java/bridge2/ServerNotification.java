package bridge2;

public class ServerNotification extends Notification {
    public ServerNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        System.out.print("普通告警 -> ");
        msgSender.send(message);
    }
}
