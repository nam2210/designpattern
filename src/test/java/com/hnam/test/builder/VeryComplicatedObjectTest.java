package com.hnam.test.builder;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class VeryComplicatedObjectTest {

    @Test
    public void createVeryComplicatedObjectSuccess(){
        VeryComplicatedObject object = new VeryComplicatedObject.Builder()
                .setA("a")
                .setB("b")
                .setC("c")
                .setD(true)
                .setE(false)
                .setF(1)
                .setG(0).build();
        Assert.assertEquals("a", object.a);
        Assert.assertEquals("b", object.b);
        Assert.assertEquals("c", object.c);
        Assert.assertEquals(true, object.d);
        Assert.assertEquals(false, object.e);
        Assert.assertEquals(1, object.f);
        Assert.assertEquals(0, object.g);
    }

    @Test
    public void testBuilderCreatesCorrectlyTheObjectWithNoFluidApiUsage(){
        VeryComplicatedObject.Builder builder = new VeryComplicatedObject.Builder();
        builder.setA("a");
        builder.setB("b");
        builder.setC("c");
        builder.setD(true);
        builder.setE(false);
        VeryComplicatedObject object = builder.build();

        Assert.assertEquals("a", object.a);
        Assert.assertEquals("b", object.b);
        Assert.assertEquals("c", object.c);
        Assert.assertEquals(true, object.d);
        Assert.assertEquals(false, object.e);
    }
}