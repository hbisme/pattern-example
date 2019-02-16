package ObServer.WeatherObserverExample;

/**
 * 具体的目标对象,负责把有关状态存入到相应的观察者对象中
 */
public class ConcreteWeatherSubject extends WeatherSubject {
    // 获取天气的内容信息
    private String weatherContent;


    public String getWeatherContent() {
        return weatherContent;
    }

    // 当有新的天气内容时,调用这个方法
    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
        this.notifyObservers();
    }
}
