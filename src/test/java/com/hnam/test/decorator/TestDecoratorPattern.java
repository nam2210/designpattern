package com.hnam.test.decorator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestDecoratorPattern {

    @Test
    public void testDecoratorPattern(){
        ConcreteComponent a = new ConcreteComponent();
        ConcreteDecorator1 b = new ConcreteDecorator1(a);
        ConcreteDecorator2 c = new ConcreteDecorator2(b);

        c.execute();
    }
}
