package org.wyy.designpattern.observer;


/**
 * 被观察者
 */
public interface DemoObserved {
    // 注册观察者
    void addObserver(DemoObserver demoObserver);
    // 移除观察者
    void removeObserver(DemoObserver demoObserver);
    // 通知观察者
    void notifyObserver(DemoObserved demoObserved, Object obj);
}
