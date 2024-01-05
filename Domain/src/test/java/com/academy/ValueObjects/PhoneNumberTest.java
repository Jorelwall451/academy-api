package com.academy.ValueObjects;

import com.academy.ValueObjects.PhoneNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneNumberTest {
    @Test
    public void testValidPhoneNumber(){
        String testPhoneNumber = "55975171592";

        try {
            new PhoneNumber(testPhoneNumber);
            Assertions.assertNotNull(testPhoneNumber);
        }catch(Exception e){
            Assertions.fail("Test invalid. The validator block the valid phone number " + testPhoneNumber);
        }
    }

    @Test
    public void testInvalidPhoneNumber(){
        String testPhoneNumber = "+182481248284824";

        try {
            new PhoneNumber(testPhoneNumber);
            Assertions.fail("Test invalid. The validator allow the invalid phone number " + testPhoneNumber);
        }catch(Exception e){
            Assertions.assertTrue(e.getMessage().contains(testPhoneNumber));
        }
    }
}
