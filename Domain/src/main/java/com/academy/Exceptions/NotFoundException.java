package com.academy.Exceptions;

public class NotFoundException extends DomainException {
    public NotFoundException(String message) {
        super(message);
    }

    @Override
    public void setMessage(String message) throws DomainException {
        throw new RuntimeException(message);
    }
}
