package ru.serj.app.ws.exceptions;

public class UserServiceException extends RuntimeException {

    public static final long serialVersionUID = 123421342143L;

    public UserServiceException(String message) {
        super(message);
    }
}
