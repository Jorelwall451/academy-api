package com.academy.ValueObjects;

import com.academy.Exceptions.ValidatorException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class PhoneNumber {
    public PhoneNumber(String phoneNumber) throws ValidatorException{
        this.validate(phoneNumber);
    }

    private void validate(String phoneNumber) throws ValidatorException  {
        String phoneNumberPattern = "^[1-9]{2}9?[0-9]{8}$";
        Pattern pattern = Pattern.compile(phoneNumberPattern);
        Matcher matcher = pattern.matcher(phoneNumber);

        if(!matcher.matches()){
            throw new ValidatorException("The phone number " + phoneNumber + " is invalid");
        }
    }
}
