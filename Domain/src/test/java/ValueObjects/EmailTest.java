package ValueObjects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class EmailTest {
    @Test
    public void testValidEmail() {
        String testEmail = "david@gmail.com";

        try {
            Email email = new Email(testEmail);
            Assertions.assertNotNull(email);
        }catch(Exception e){
            Assertions.fail("Test invalid. The validator block the valid email " + testEmail);
        }
    }

    @Test
    public void testInvalidEmail(){
        String testEmail = "david_gmail.com";

        try {
            new Email(testEmail);
            Assertions.fail("Test invalid. The validator allow the invalid email " + testEmail);
        }catch(Exception e){
            Assertions.assertTrue(e.getMessage().contains(testEmail));
        }
    }
}
