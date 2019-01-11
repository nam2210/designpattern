package com.hnam.test.observer;

public class SimpleObserver implements Observer<Integer> {


    @Override
    public void onDataAvailable(Integer data) {
        System.out.println("data=" + data);
    }
}
