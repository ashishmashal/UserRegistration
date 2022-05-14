package com.bridgelabz;

public class InvalidUserException extends Exception {
    String message;
    public InvalidUserException(String message){
        super(message);
    }
}
