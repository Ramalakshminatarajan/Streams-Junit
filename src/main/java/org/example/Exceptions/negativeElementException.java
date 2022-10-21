package org.example.Exceptions;

public class negativeElementException extends Exception{

    public String message;
    public negativeElementException(String msg) {
        super(msg);
        this.message = msg;
        System.out.println(msg);
    }
}
