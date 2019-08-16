package obServer.WeatherObserverExample;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象,它知道观察它的观察者,并提供注册(添加)和删除观察者的接口
 * */
public class WeatherSubject {
    // 用来保持注册的观察者对象
    private List<Observer> observers = new ArrayList<Observer>();


    // 把订阅天气的人添加到订阅者列表中
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // 删除列表中的指定订阅天气的人
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    // 通知所有订阅天气的人
    protected void notifyObservers() {
        for(Observer observer :observers) {
            observer.update(this);
        }
    }



}
