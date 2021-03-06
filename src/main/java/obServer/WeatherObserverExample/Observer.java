package obServer.WeatherObserverExample;

/**
 * 这是一个观察者接口, 定义一个更新的接口给那些在目标(WeatherSubject)发生改变时候被通知的对象
 */
public interface Observer {
    /**
     * 更新的接口
     * @param subject 传入目标对象,方便获取相应的目标对象的状态
     */
    void update(WeatherSubject subject);

}
