package factory.sunnyProDemo.abstractFactory;

import factory.sunnyProDemo.abstractFactory.Boy;

/**
 * 圣诞系列男孩
 * */
public class MCBoy implements Boy {
    @Override
    public void drawMain() {
        System.out.println("--圣诞系列男孩--");
    }
}
