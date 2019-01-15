package com.hnam.test.facade;

public class MyFacadeImpl implements MyFacade {

    private Module1 module1;
    private Module2 module2;
    private Module3 module3;

    public MyFacadeImpl(){
        module1 = new Module1();
        module2 = new Module2();
        module3 = new Module3();
    }

    @Override
    public void print3Module() {
        module1.print();
        module2.print();
        module3.print();
    }
}
