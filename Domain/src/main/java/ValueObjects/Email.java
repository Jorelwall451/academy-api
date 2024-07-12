package ValueObjects;

import Exceptions.ValidatorException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Email {
    public Email(String email) throws ValidatorException {
        validate(email);
    }

    private void validate(String email) throws ValidatorException {
        String emailPattern = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);

        if (!matcher.matches()) {
            throw new ValidatorException("The email " + email + " is invalid");
        }
    }
}
