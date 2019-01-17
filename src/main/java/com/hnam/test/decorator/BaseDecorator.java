package com.hnam.test.decorator;

public class BaseDecorator implements Component{

    private Component wrappee;

    public BaseDecorator(Component wrappee) {
        this.wrappee = wrappee;
    }


    @Override
    public void execute() {
        this.wrappee.execute();
    }
}
