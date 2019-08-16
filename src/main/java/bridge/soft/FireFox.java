package bridge.soft;

import bridge.Phone;
import bridge.Software;

public class FireFox implements Software {
    @Override
    public void open(Phone phone) {
        System.out.println("打开" + phone.getSystem() + "手机的Firefox浏览器");
    }
}
