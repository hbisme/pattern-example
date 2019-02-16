package factory.sunnyProDemo.abstractFactory;

import factory.sunnyProDemo.abstractFactory.Girl;

/**
 * 元旦系列女孩
 * */
public class HNGirl implements Girl {
    @Override
    public void drawWoman() {
        System.out.println("--元旦系列女孩--");
    }
}
