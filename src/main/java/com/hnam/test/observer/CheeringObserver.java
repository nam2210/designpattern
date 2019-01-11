package com.hnam.test.observer;

public class CheeringObserver implements Observer<Integer> {
    @Override
    public void onDataAvailable(Integer data) {
        System.out.println("data=" + data);
    }
}
