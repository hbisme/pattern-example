package bridge;

import bridge.soft.Chrome;
import bridge.soft.FireFox;

public class BridgeTest {
    public static void main(String[] args) {
        Software chrome = new Chrome();

        Software firefox = new FireFox();

        Phone androidPhone = new AndroidPhone(chrome);
        androidPhone.openSoftware();

        androidPhone.setSoftware(firefox);
        androidPhone.openSoftware();


        Phone iosPhone = new IOSPhone(chrome);
        iosPhone.openSoftware();

        iosPhone.setSoftware(firefox);
        iosPhone.openSoftware();




    }
}
