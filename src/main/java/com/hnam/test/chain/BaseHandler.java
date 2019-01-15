package com.hnam.test.chain;

public class BaseHandler implements Handler<Integer>{
    private Handler<Integer> next;

    @Override
    public void setNext(Handler<Integer> handler) {
        this.next = handler;
    }

    @Override
    public void handler(Integer integer) {
        if (next != null){
            next.handler(integer);
        } else {
            System.out.println("no handler");
        }
    }
}
