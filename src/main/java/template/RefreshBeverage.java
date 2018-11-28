package template;

/*
 * 模板方法模式的例子
 *
 * 实现要素:
 *   准备一个抽象类,将部分逻辑以具体方法的形式实现,
 *   然后声明一些抽象方法交给由子类实现,用钩子方法给与更大的灵活性.
 *   最后将方法汇总构成一个不可改变的模板方法
 *
 * 适用场景:
 *   1. 算法或操作遵循相似的逻辑
 *   2. 重构时(把相同的代码抽取到父类)
 *   3. 重要,复杂的算法,核心算法设计为模板算法
 *
 * 模板模式的优点:
 *   1. 封装性好
 *   2. 复用性好
 *   3. 屏蔽细节
 *   4. 便于维护
 *
 * 模板方法的缺点:
 *   无法继承其他类了.
 *
 * 抽象基类, 为所有子类提供一个顶级不变的算法框架
 *
 * 提神饮料
 *
 * */
public abstract class RefreshBeverage {

    /*
     * 制备饮料的模板方法
     * 封装了所有子类共同遵循的算法框架
     * 设置final,防止子类改变顶级逻辑
     * */

    protected final void prepareBeverageTemplate() {
        // 步骤1. 将水煮沸
        boilWater();

        // 步骤2. 泡制饮料
        brew();

        // 步骤3. 将饮料倒入杯中
        pourInCup();

        if(isCustomerWantsCondiments()) {
            // 步骤4. 加入调味料
            addCondiments();
        }

    }

    /* 基本方法, 将水煮沸,
     * 对所有子类,这个方法是相同的,所以这里实现它,声明为private,向下屏蔽细节
     *  */
    private void boilWater() {
        System.out.println("将水煮沸.");
    }

    /*
     * 抽象方法, 泡制饮料, 不同子类,不同实现
     * */
    protected abstract void brew();

    /* 基本方法, 将饮料倒入杯中,
     * 对所有子类,这个方法是相同的,所以这里实现它,声明为private
     *  */
    private void pourInCup() {
        System.out.println("倒入杯中");
    }


    /*
     * 抽象方法, 加入调料,不同子类,不同实现
     * */
    protected abstract void addCondiments();

    /*
    * Hook, 钩子函数, 提供一个默认或空的实习
    * 具体的子类可以自行决定是否挂钩以及如何挂钩(选择勾住,就是覆写方法)
    * 询问用户是否加入调料
    *
    * */
    protected boolean isCustomerWantsCondiments() {

        return true;
    }

}
