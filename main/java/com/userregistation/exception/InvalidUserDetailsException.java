package com.userregistation.exception;

public class InvalidUserDetailsException extends RuntimeException{
    InvalidUserDetailsException(String message){
        super(message);
    }
}