package ValueObjects;

import Exceptions.ValidatorException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class PixKey {
    public PixKey(String pixKey) throws ValidatorException {
        this.validate(pixKey);
    }

    private void validate(String pixKey) throws ValidatorException {
        String pixKeyPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(pixKeyPattern);

        Matcher matcher = pattern.matcher(pixKey);

        if(!matcher.matches()){
            throw new ValidatorException("Pix key " + pixKey + "is invalid!");
        }
    }
}
