package template;

/*
* 具体子类, 实现了抽象基类方法, 提供了咖啡饮料的做法
* */
public class Coffee extends RefreshBeverage{


    protected void brew() {
        System.out.println("研磨咖啡豆.");
    }

    protected void addCondiments() {
        System.out.println("添加糖和牛奶");
    }

}
