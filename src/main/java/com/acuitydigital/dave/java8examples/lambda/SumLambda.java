package com.acuitydigital.dave.java8examples.lambda;

import java.math.BigDecimal;

/**
 * Created by David on 9/6/2016.
 */
public class SumLambda extends SumLoop {

    @Override
    public Number sum() {
        BigDecimal sum = new BigDecimal(getValues().stream().mapToInt(v -> v.getValue().intValue()).sum());
        return sum;
    }
}
