package com.example;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author John Hall Date: 12/8/15
 */
public class DemoServiceTest {

    @Test
    public void testHello() {
        Assert.assertEquals("Hello World!", DemoService.saySomethingThatMeetsStandard());
    }
}