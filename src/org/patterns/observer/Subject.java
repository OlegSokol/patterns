package org.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;


    public int getState() {
        return state;
    }

    public Subject setState(int state) {
        this.state = state;
        notifyAllObservers();
        return this;
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    private void notifyAllObservers() {
        observers.forEach(Observer::update);
    }
}
