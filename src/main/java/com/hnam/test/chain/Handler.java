package com.hnam.test.chain;

public interface Handler<T> {

    void setNext(Handler<T> handler);

    void handler(T t);
}
