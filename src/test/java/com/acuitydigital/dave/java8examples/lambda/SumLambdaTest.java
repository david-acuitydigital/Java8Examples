package com.acuitydigital.dave.java8examples.lambda;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by David on 9/6/2016.
 */
public class SumLambdaTest extends SumLoopTest {
    @Override
    public void before() {
        sum = new SumLambda();
    }

    @Test
    public void testSumLambaValue(){
        sum.addValue(() -> 4);
        sum.addValue(() -> 1);
        assertEquals(5, sum.sum().intValue());
    }
}
