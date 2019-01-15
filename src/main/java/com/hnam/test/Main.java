package com.hnam.test;

import com.hnam.test.chain.Concrete1Handler;
import com.hnam.test.chain.Concrete2Handler;
import com.hnam.test.chain.ConcreteHandler;

public class Main {

    public static void main(String[] args){
        ConcreteHandler handler = new ConcreteHandler();
        Concrete1Handler handler1 = new Concrete1Handler();
        Concrete2Handler handler2 = new Concrete2Handler();

        handler.setNext(handler1);
        handler1.setNext(handler2);

        //handler.handler(0);
        //handler.handler(1);
        //handler.handler(2);
        handler.handler(3);
    }
}
