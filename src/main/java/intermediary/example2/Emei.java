package intermediary.example2;

/**
 * 峨眉派
 */
public class Emei extends United {
    public Emei(WulinAlliance wulinAlliance) {
        super(wulinAlliance);
    }

    public void sendAlliance(String message) {
        wulinAlliance.notice(message, Emei.this);
    }

    public void getNotice(String message) {
        System.out.println("峨眉派收到消息: " + message);
    }
}
