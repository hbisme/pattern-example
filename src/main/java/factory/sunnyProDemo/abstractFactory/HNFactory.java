package factory.sunnyProDemo.abstractFactory;

/**
 * 元旦系列加工厂
 * */
public class HNFactory implements PersonFactory {
    @Override
    public Boy getBoy() {
        return new HNBoy();
    }

    @Override
    public Girl getGirl() {
        return new HNGirl();
    }
}
