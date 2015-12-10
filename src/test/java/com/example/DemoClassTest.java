package com.example;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author John Hall Date: 12/8/15
 */
public class DemoClassTest {

    @Test
    public void saySomethingToo() {
        Assert.assertEquals("Hello World Again!", DemoClass.saySomethingToo());
    }

    @Test
    public void addingMissingTestCase() {
        Assert.assertEquals("Are you tired of Hello World yet??", DemoClass.saySomethingThree());
    }
}