package ValueObjects;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CpfTest {
    @Test
    public void testValidCpf(){
        String testCpf = "12345678909";

        try {
            Cpf cpf = new Cpf(testCpf);
            Assertions.assertNotNull(cpf);
        }catch(Exception e){
            Assertions.fail("Test invalid. The validator block the valid cpf " + testCpf);
        }
    }

    @Test
    public void testInvalidCpf(){
        String testCpf = "123456789";

        try {
            new Cpf(testCpf);
            Assertions.fail("Test invalid. The validator allow the invalid cpf " + testCpf);
        }catch(Exception e){
            Assertions.assertTrue(e.getMessage().contains(testCpf));
        }
    }
}
