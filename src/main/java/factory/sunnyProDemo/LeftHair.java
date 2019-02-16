package factory.sunnyProDemo;

// 画了一个左偏分的发型
public class LeftHair implements HairInterface {
    @Override
    public void draw() {
        System.out.println("---左偏分发型---");
    }
}
