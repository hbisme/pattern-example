package factory.sunnyProDemo;

/**
 * 模拟客户端的实现
 */
public class SunnyTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {

        // 普通方式来创建发型
        HairInterface left = new LeftHair();
        left.draw();

        HairInterface right = new RightHair();
        right.draw();
        System.out.println("--------------");
        // ---------------------

        /*
         * 使用工厂方法来创建发型对象
         * */
        HairFactory factory = new HairFactory();
        HairInterface left2 = factory.getHair("left");
        left2.draw();

        /*
         * 使用工厂里的反射来创建发型对象
         * */
        HairInterface right2 = factory.getHairByClass("factory.sunnyProDemo.RightHair");
        right2.draw();

    }

}
