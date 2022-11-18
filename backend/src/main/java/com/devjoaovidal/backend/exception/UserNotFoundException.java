package com.devjoaovidal.backend.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("Couldn't found the user with the id");
    }
}
