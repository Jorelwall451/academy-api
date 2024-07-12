package Exceptions;

public final class ValidatorException extends DomainException {

    public ValidatorException(String message) {
        super(message);
    }

    @Override
    public void setMessage(String message) throws DomainException {
        throw new RuntimeException(message);
    }
}
