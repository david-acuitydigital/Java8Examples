package com.acuitydigital.dave.java8examples.lambda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by David on 9/6/2016.
 */
public class SumLoop implements ISum, IValue {
    private Collection<IValue> values = new ArrayList<>();

    public SumLoop() {
    }

    public SumLoop(Collection<IValue> values) {
        values.addAll(values);
    }

    public Number sum() {
        BigDecimal sum = BigDecimal.ZERO;
        if (values != null) {
            for (IValue value : values) {
                if (value != null && value.getValue() != null) {
                    sum = new BigDecimal(value.getValue().toString()).add(sum);
                }
            }
        } else {
            sum = BigDecimal.ZERO;
        }
        return sum;
    }

    @Override
    public Collection<IValue> getValues() {
        return new ArrayList<>(values);
    }

    @Override
    public void setValues(Collection<IValue> values) {
        this.values = new ArrayList<>(values);
    }

    @Override
    public void addValue(IValue value) {
        values.add(value);
    }

    @Override
    public Number getValue() {
        return sum();
    }
}
