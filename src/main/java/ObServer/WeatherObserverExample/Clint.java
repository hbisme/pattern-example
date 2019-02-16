package ObServer.WeatherObserverExample;

public class Clint {
    public static void main(String[] args) {
        // 1. 创建一个目标
        ConcreteWeatherSubject weather = new ConcreteWeatherSubject();

        // 2. 创建观察者
        ConcreteObserver observerGirl = new ConcreteObserver();
        observerGirl.setObserverName("黄明女朋友");
        observerGirl.setRemindThing("约会");

        ConcreteObserver observerMother = new ConcreteObserver();
        observerMother.setObserverName("黄明的妈妈");
        observerMother.setRemindThing("购物");

        // 3. 注册观察者到观察者列表
        weather.attach(observerGirl);
        weather.attach(observerMother);

        // 4. 在目标处发布天气预告
        weather.setWeatherContent("明天天气晴天");

    }
}
