package Exceptions;

public abstract class DomainException extends Exception {
    public DomainException(String message) {
        super(message);
    }

    public abstract void setMessage(String message) throws DomainException;
}
