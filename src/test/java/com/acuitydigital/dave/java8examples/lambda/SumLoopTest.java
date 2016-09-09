package com.acuitydigital.dave.java8examples.lambda;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by David on 9/6/2016.
 */
public class SumLoopTest {
    protected ISum sum;

    @Before
    public void before() {
        sum = new SumLoop();
    }

    @Test
    public void testSum() {
        sum.addValue(new SimpleValue(1));
        sum.addValue(new SimpleValue(3));
        assertEquals(4, sum.sum().intValue());
    }
}
