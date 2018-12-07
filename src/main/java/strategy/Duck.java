package strategy;

/**
 * 超类, 所有的鸭子都要继承此类
 * 抽象了鸭子的行为: 显示和鸣叫
 */
public abstract class Duck {

    /*
     * 鸭子发出叫声
     * 通用行为,由超类实现
     * */
    public void quack() {
        System.out.println("嘎嘎嘎");
    }

    /*
     * 显示鸭子的外观
     * 鸭子的外观各不相同, 声明为 abstract, 由子类实现
     * */
    public abstract void display();


    // 飞行接口
    private FlyingStragety flyingStragety;

    // 多态调用接口的飞行方法
    public void fly() {
        flyingStragety.performFly();
    }

    public void show() {
        this.quack();
        this.display();
        this.fly();
    }

    public FlyingStragety getFlyingStragety() {
        return flyingStragety;
    }

    public void setFlyingStragety(FlyingStragety flyingStragety) {
        this.flyingStragety = flyingStragety;
    }
}
