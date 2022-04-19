package org.exceptions;

public class ClassWithExceptions {

    public double div(int a, int b) {
        try {
            return a / b;
        } catch (Exception e) {
            if (b == 0) {
                System.out.println("It's not allowed to divide by zero");
            }
            throw e;
        }
    }
}
