package com.hnam.test.facade;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class TestFacadePattern {

    @Test
    public void createMyFacadeSuccess(){
        MyFacade facade = Mockito.mock(MyFacadeImpl.class);

        facade.print3Module();
        Mockito.verify(facade).print3Module();
    }
}
