package edu.jespinoza.testng;

public class McdCalculator {
    long getMcd(long a, long b) {
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
