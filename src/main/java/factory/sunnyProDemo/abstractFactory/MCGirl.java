package factory.sunnyProDemo.abstractFactory;

import factory.sunnyProDemo.abstractFactory.Girl;

/**
 * 圣诞系列的女孩
 * */
public class MCGirl implements Girl {
    @Override
    public void drawWoman() {
        System.out.println("---圣诞系列的女孩---");
    }
}
