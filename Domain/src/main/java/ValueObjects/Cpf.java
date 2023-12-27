package ValueObjects;

import Exceptions.ValidatorException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Cpf {
    public Cpf(String cpf){
        this.validate(cpf);
    }

    public void validate(String cpf){
        String CpfPattern = "^(?!000\\.000\\.000-00)(\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2})$";
        Pattern pattern = Pattern.compile(CpfPattern);

        Matcher matcher = pattern.matcher(cpf);

        if(!matcher.matches()){
            new ValidatorException().setMessage("Cpf " + cpf + "is invalid!");
        }
    }
}
