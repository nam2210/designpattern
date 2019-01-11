package com.hnam.test.observer;

public interface Observer<T> {
    void onDataAvailable(T data);
}
