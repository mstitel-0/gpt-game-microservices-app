package org.example.authenticationservice.Exceptions;

public class UserNotActivatedException extends RuntimeException{
    public UserNotActivatedException(String message){
        super(message);
    }
}
