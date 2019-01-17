package com.hnam.test.decorator;

public class ConcreteDecorator2 extends BaseDecorator{


    public ConcreteDecorator2(Component wrappee) {
        super(wrappee);
    }

    @Override
    public void execute() {
        System.out.println("ConcreteDecorator2() -> invoked");
        super.execute();

    }
}
