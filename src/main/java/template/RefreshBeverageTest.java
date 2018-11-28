package template;

/*
* 模板模式测试类
* */
public class RefreshBeverageTest {
    public static void main(String[] args) {

        // 测试咖啡饮料类
        System.out.println("咖啡制作开始.");
        // 用接口类来定义,面向接口编程
        RefreshBeverage coffee = new Coffee();
        coffee.prepareBeverageTemplate();
        System.out.println("咖啡制作结束.");
        System.out.println("------------");

        // 测试 柠檬茶饮料类
        System.out.println("柠檬茶制作开始.");
        RefreshBeverage tea = new Tea();

        tea.prepareBeverageTemplate();
        System.out.println("柠檬茶制作结束.");

    }


}
