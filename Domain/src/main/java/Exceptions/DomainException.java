package Exceptions;

abstract public class DomainException extends Exception {
    public abstract void setMessage(String message) throws DomainException;
}
