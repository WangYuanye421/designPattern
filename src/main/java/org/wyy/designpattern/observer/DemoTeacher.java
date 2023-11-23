package org.wyy.designpattern.observer;

public class DemoTeacher implements DemoObserver {
    @Override
    public void update(DemoObserved demoObserved, Object obj) {
        System.out.println(demoObserved.getClass().getName());
        System.out.println(obj);
    }
}
