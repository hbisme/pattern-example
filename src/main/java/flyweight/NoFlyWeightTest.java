package flyweight;

import flyweight.Crayon;
import flyweight.ICrayon;

/**
 * 小红和小明都使用 绿色和灰色蜡笔做画, 但是每个人都创建自己的蜡笔,没有共享同颜色的蜡笔
 */
public class NoFlyWeightTest {
    public static void main(String[] args) {

        drawByXiaoMing();
        drawByXiaoMing();
    }


    public static void drawByXiaoMing() {
        ICrayon greenCrayon = new Crayon("绿色");
        greenCrayon.draw("草");

        ICrayon grayCrayon = new Crayon("灰色");
        grayCrayon.draw("路");
    }

    public static void drawByXiaoHong() {
        ICrayon blueCrayon = new Crayon("蓝色");
        blueCrayon.draw("蓝天");

        ICrayon greenCrayon = new Crayon("绿色");
        greenCrayon.draw("树");

    }


}
