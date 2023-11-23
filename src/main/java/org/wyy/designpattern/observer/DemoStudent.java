package org.wyy.designpattern.observer;

import java.util.ArrayList;

public class DemoStudent implements DemoObserved {
    private ArrayList<DemoObserver> list;
    private String name;

    public void setName(String name) {
        this.name = name;
        notifyObserver(this, name);
    }

    public String getName(){
        return this.name;
    }
    @Override
    public void addObserver(DemoObserver demoObserver) {
        if(list == null) {
            list = new ArrayList<>();
        }
        list.add(demoObserver);
    }

    @Override
    public void removeObserver(DemoObserver demoObserver) {
        if(list == null || list.size() == 0) {
            return;
        }
        list.remove(demoObserver);
    }

    @Override
    public void notifyObserver(DemoObserved demoObserved, Object obj) {
        if(list != null && list.size() > 0) {
            list.forEach( e -> {
                e.update(demoObserved, obj);
            });
        }
    }
}
