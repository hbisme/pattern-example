package ObServer;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象,它知道观察它的观察者,并提供注册(添加)和删除观察者的接口
 * */
public class Subject {
    // 用来保持注册的观察者对象
    private List<Observer> observers = new ArrayList<Observer>();

    // 添加观察者到观察者列表
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // 删除列表中的指定观察者
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    // 通知所有的订阅者
    protected void notifyObservers() {
        for(Observer observer :observers) {
            observer.update(this);
        }
    }



}
