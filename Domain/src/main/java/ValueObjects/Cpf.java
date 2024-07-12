package ValueObjects;

import Exceptions.ValidatorException;

public final class Cpf {
    public Cpf(String cpf) throws ValidatorException {
        this.validate(cpf);
    }

    private void validate(String cpf) throws ValidatorException {
        if(cpf.length() != 11){
            throw new ValidatorException("The cpf " + cpf + " is invalid");
        }

        int[] numbers = new int[11];
        for (int i = 0; i < 11; i++) {
            numbers[i] = Integer.parseInt(cpf.substring(i, i + 1));
        }

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += numbers[i] * (10 - i);
        }

        int digit1 = 11 - (sum % 11);
        digit1 = (digit1 >= 10) ? 0 : digit1;

        sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += numbers[i] * (11 - i);
        }

        int digit2 = 11 - (sum % 11);
        digit2 = (digit2 >= 10) ? 0 : digit2;

        if (digit1 != numbers[9] || digit2 != numbers[10]) {
            throw new ValidatorException("The email " + cpf + " is invalid");
        }
    }
}
