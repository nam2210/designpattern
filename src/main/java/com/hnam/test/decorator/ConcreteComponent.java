package com.hnam.test.decorator;

public class ConcreteComponent implements Component {

    @Override
    public void execute() {
        System.out.println("concrete component executed");
    }
}
