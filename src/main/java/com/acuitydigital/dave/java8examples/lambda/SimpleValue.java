package com.acuitydigital.dave.java8examples.lambda;

/**
 * Created by David on 9/6/2016.
 */
public class SimpleValue implements IValue{
    private Number value;

    public SimpleValue() {
    }

    public SimpleValue(Number value) {
        this.value = value;
    }

    public Number getValue() {
        return value;
    }

    public SimpleValue setValue(Number value) {
        this.value = value;
        return this;
    }
}
