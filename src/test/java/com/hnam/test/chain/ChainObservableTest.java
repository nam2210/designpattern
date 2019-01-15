package com.hnam.test.chain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ChainObservableTest {

    @Test
    public void createChainOfResponsibility(){
        ConcreteHandler handler = new ConcreteHandler();
        Concrete1Handler handler1 = new Concrete1Handler();
        Concrete2Handler handler2 = new Concrete2Handler();

        handler.setNext(handler1);
        handler1.setNext(handler2);

        handler.handler(3);
    }
}
