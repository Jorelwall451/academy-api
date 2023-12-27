package ValueObjects;

import Exceptions.ValidatorException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class PixKey {
    public PixKey(String pixKey){
        this.validate(pixKey);
    }

    public void validate(String pixKey){
        String pixKeyPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(pixKeyPattern);

        Matcher matcher = pattern.matcher(pixKey);

        if(!matcher.matches()){
            new ValidatorException().setMessage("Pix key " + pixKey + "is invalid!");
        }
    }
}
