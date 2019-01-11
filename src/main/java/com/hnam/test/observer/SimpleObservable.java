package com.hnam.test.observer;

import java.util.ArrayList;
import java.util.List;

public class SimpleObservable implements Observable<Integer> {

    List<Observer<Integer>> observers;

    public SimpleObservable() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer<Integer> observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer<Integer> observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer<Integer> o : observers){
            o.onDataAvailable(1);
        }
    }
}
