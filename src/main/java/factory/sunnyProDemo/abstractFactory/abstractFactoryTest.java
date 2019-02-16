package factory.sunnyProDemo.abstractFactory;

public class abstractFactoryTest {
    public static void main(String[] args) {
        // 圣诞系列工厂
        PersonFactory factory = new MCFactory();
        Boy boy1 = factory.getBoy();
        Girl girl1 = factory.getGirl();
        boy1.drawMain();
        girl1.drawWoman();

        System.out.println("--------");

        // 元旦系列工厂
        PersonFactory factory2 = new HNFactory();
        Boy boy2 = factory2.getBoy();
        Girl girl2 = factory2.getGirl();
        boy2.drawMain();
        girl2.drawWoman();



    }
}
