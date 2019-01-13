package com.hnam.test.chain;

public class ConcreteHandler extends BaseHandler {

    @Override
    public void handler(Integer integer) {
        if (canHandle(integer)){
            System.out.println("ConcreteHandler() -> invoked");
        } else {
            super.handler(integer);
        }
    }

    public boolean canHandle(Integer integer){
        return integer == 1;
    }
}
