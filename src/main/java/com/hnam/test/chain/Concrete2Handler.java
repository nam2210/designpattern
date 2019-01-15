package com.hnam.test.chain;

public class Concrete2Handler extends BaseHandler {

    @Override
    public void handler(Integer integer) {
        if (canHandle(integer)){
            System.out.println("ConcreteHandler == 2 -> invoked");
        } else {
            super.handler(integer);
        }
    }

    public boolean canHandle(Integer integer){
        return integer == 2;
    }
}
