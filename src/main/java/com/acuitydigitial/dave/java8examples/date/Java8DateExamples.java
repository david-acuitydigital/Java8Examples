package com.acuitydigitial.dave.java8examples.date;

import java.time.Clock;
import java.time.LocalDateTime;

/**
 * Created by David on 9/6/2016.
 */
public class Java8DateExamples {
    public static void main(String[] args){
        LocalDateTime timestamp = LocalDateTime.now();
        System.out.println(timestamp);
        timestamp = LocalDateTime.of(2014,12,1,22,33,45,123123123);
        System.out.println(timestamp);
        try {
            timestamp = LocalDateTime.of(2014,12,1,22,33,45,1231231231);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
