package Entities.User;

import Entities.Transaction.Transaction;
import Exceptions.ValidatorException;
import ValueObjects.Email;
import ValueObjects.Cpf;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class UserTest {
    private final UUID userId = UUID.randomUUID();
    private final User user = new User(userId);

    @Test
    public void testGetId(){
        Assertions.assertEquals(userId, user.getId());
    }

    @Test
    public void testGetSetName(){
        String testName = "David";
        user.setName(testName);
        Assertions.assertEquals(testName, user.getName());
    }

    @Test
    public void testGetSetDescription(){
        String testDescription = "My name is David and I love bridges!";
        user.setDescription(testDescription);
        Assertions.assertEquals(testDescription, user.getDescription());
    }

    @Test
    public void testGetSetPassword(){
        String testPassword = "DavidBridge8492%";
        user.setPassword(testPassword);
        Assertions.assertEquals(testPassword, user.getPassword());
    }

    @Test
    public void testGetSetPhotoUrl(){
        String testPhotoUrl = "https://www.academy.com/user/ec9f424e-7620-453e-b512-5cc25ef26241/photo.jpeg";
        user.setPhotoUrl(testPhotoUrl);
        Assertions.assertEquals(testPhotoUrl, user.getPhotoUrl());
    }

    @Test
    void testGetSetAge(){
        Integer testAge = 5;
        user.setAge(testAge);
        Assertions.assertEquals(testAge, user.getAge());
    }

    @Test
    public void testGetSetEmail() throws ValidatorException {
        Email testEmail = new Email("david@example.com");
        user.setEmail(testEmail);
        Assertions.assertEquals(testEmail, user.getEmail());
    }

    @Test
    public void testGetSetCpf() throws ValidatorException {
        Cpf testCpf = new Cpf("12345678909");
        user.setCpf(testCpf);
        Assertions.assertEquals(testCpf, user.getCpf());
    }

    @Test
    public void testGetSetPixKey() {
        String testPixKey = "123456789";
        user.setPixKey(testPixKey);
        Assertions.assertEquals(testPixKey, user.getPixKey());
    }

    @Test
    public void testGetSetTransactions(){
        List<Transaction> testTransactions = new ArrayList<>();

        for(int transactionIndex = 0; transactionIndex < 10; transactionIndex++){
            Transaction newTransaction = new Transaction(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID());
            testTransactions.add(newTransaction);
        }

        user.setTransactions(testTransactions);

        for(int transactionIndex = 0; transactionIndex < 10; transactionIndex++){
            Assertions.assertEquals(testTransactions.get(transactionIndex), user.getTransactions().get(transactionIndex));
        }
    }

    @Test
    public void testGetSetTransaction(){
        Transaction testTransaction = new Transaction(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID());

        user.setTransaction(testTransaction);
        Assertions.assertTrue(user.getTransactions().contains(testTransaction));
    }

    @Test
    public void testGetSetBirthdate() {
        LocalDateTime testBirthdate = LocalDateTime.now().minusYears(30);
        user.setBirthdate(testBirthdate);
        Assertions.assertEquals(testBirthdate, user.getBirthdate());
    }

    @Test
    public void testGetSetLoginAt(){
        LocalDateTime testLoginAt = LocalDateTime.now().minusDays(4);
        user.setLoginAt(testLoginAt);
        Assertions.assertEquals(testLoginAt, user.getLoginAt());
    }

    @Test
    public void testGetSetCreatedAt() {
        LocalDateTime testCreatedAt = LocalDateTime.now().minusDays(5);
        user.setCreatedAt(testCreatedAt);
        Assertions.assertEquals(testCreatedAt, user.getCreatedAt());
    }

    @Test
    public void testGetSetUpdatedAt() {
        LocalDateTime testUpdatedAt = LocalDateTime.now().minusDays(2);
        user.setUpdatedAt(testUpdatedAt);
        Assertions.assertEquals(testUpdatedAt, user.getUpdatedAt());
    }
}
