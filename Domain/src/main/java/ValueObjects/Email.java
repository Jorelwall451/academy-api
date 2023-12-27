package ValueObjects;

import Exceptions.ValidatorException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Email {
    public Email(String email){
        this.validate(email);
    }

    public void validate(String email){
        String EmailPattern = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(EmailPattern);

        Matcher matcher = pattern.matcher(email);

        if(!matcher.matches()){
            new ValidatorException().setMessage("Email " + email + "is invalid!");
        }
    }
}
