package flyweight;

public class FlyWeightTest {
    public static void main(String[] args) {
        drawByXiaoMing();
        drawByXiaoHong();
    }

    public static void drawByXiaoMing() {
        ICrayon greenCrayon = CrayonFactory.getCrayon("绿色");
        greenCrayon.draw("草");

        ICrayon grayCrayon = CrayonFactory.getCrayon("灰色");
        grayCrayon.draw("路");
    }

    public static void drawByXiaoHong() {
        ICrayon greenCrayon = CrayonFactory.getCrayon("绿色");
        greenCrayon.draw("叶子");

        ICrayon grayCrayon = CrayonFactory.getCrayon("灰色");
        grayCrayon.draw("房子");
    }
}
