package template;

/*
 * 具体子类, 实现了抽象基类方法, 提供了柠檬茶饮料的做法
 * */
public class Tea extends RefreshBeverage {
    protected void brew() {
        System.out.println("用热水泡茶3分钟.");
    }

    protected void addCondiments() {
        System.out.println("加入柠檬.");
    }

    /*
    * 覆写钩子函数, 不需要加入调味料
    * */
    @Override
    protected boolean isCustomerWantsCondiments() {
        System.out.println("   选择不加调料.");
        return false;
    }
}
