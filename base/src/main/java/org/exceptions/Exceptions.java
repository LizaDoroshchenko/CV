package org.exceptions;

public class Exceptions {

    public static void main(String[] args){

        ClassWithExceptions exc = new ClassWithExceptions();
        System.out.println(exc.div(10, 0));
    }
}
