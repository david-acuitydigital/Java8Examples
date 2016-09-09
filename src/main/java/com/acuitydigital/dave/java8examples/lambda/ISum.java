package com.acuitydigital.dave.java8examples.lambda;

import java.util.Collection;

/**
 * Created by David on 9/6/2016.
 */
public interface ISum {
    Number sum();
    void setValues(Collection<IValue> values);
    Collection<IValue> getValues();
    void addValue(IValue value);
}
