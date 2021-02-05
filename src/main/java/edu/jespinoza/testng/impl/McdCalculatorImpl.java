package edu.jespinoza.testng.impl;

import edu.jespinoza.testng.McdCalculator;

public class McdCalculatorImpl implements McdCalculator {
    private static McdCalculatorImpl ourInstance;

    public static McdCalculatorImpl getInstance() {
        if(ourInstance == null) {
            ourInstance = new McdCalculatorImpl();
        }
        return ourInstance;
    }

    private McdCalculatorImpl() {
    }

    public long getMcd(long a, long b) {
        if(b == 0) {
            return a;
        }
        long temp;
        while(a > 0) {
            if(a < b) {
                temp = a;
                a = b;
                b = temp;
            }
            a -= b;
        }
        return b;
    }
}
