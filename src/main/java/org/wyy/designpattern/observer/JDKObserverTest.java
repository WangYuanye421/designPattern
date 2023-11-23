package org.wyy.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * JDK自带的观察者模式
 * 需要被监控观察的对象man 继承了Observable,并自定义哪些行为变更需要通知,如setName()
 * 所有的观察者会收到通知以及变更的数据
 */
public class JDKObserverTest {
    public static void main(String[] args) {
        Man man = new Man();
        MyObserver o = new MyObserver();
        MyObserver2 o1 = new MyObserver2();
        man.addObserver(o);
        man.addObserver(o1);
        System.out.println("被观察者是否变化:" + man.hasChanged());
        // 仅指定行为被监控
        man.setName("wyy");
        man.setName("wyy111");
        man.setAge(10);
    }
}

class Man extends Observable{
    private String name;
    private int age;
    // 这样重写没有意义
    @Override
    protected synchronized void setChanged() {
        super.setChanged();
    }

    public Man() {
    }

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.getName();
        this.name = name;
        // 这样使用才对,在需要通知的地方主动调用
        setChanged();
        // 将变更信息传过去
        notifyObservers(oldName + "-" + name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class MyObserver implements java.util.Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("myObserver update..." + arg);
    }
}

class MyObserver2 implements java.util.Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("myObserver2 update..." + arg);
    }
}
