package intermediary.example2;

public class Client {
    public static void main(String[] args) {
        Hb hb = new Hb();
        Wudang wudang = new Wudang(hb);
        Shaolin shaolin = new Shaolin(hb);
        Emei emei = new Emei(hb);
        hb.setWudang(wudang);
        hb.setEmei(emei);
        hb.setShaolin(shaolin);

        wudang.sendAlliance("武当弟子被少林大力金刚指所杀");
        emei.sendAlliance("峨眉弟子被少林大力金刚指所杀");
        shaolin.sendAlliance("少林弟子绝不会做出这种事情");

    }
}
