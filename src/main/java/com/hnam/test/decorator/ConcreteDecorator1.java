package com.hnam.test.decorator;

public class ConcreteDecorator1 extends BaseDecorator{


    public ConcreteDecorator1(Component wrappee) {
        super(wrappee);
    }

    @Override
    public void execute() {
        System.out.println("ConcreteDecorator1() -> invoked");
        super.execute();

    }
}
