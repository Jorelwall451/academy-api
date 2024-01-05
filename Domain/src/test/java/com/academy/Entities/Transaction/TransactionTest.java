package com.academy.Entities.Transaction;

import com.academy.Entities.Transaction.Transaction;
import com.academy.Entities.User.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

public final class TransactionTest {
    private final UUID transactionId = UUID.randomUUID();
    private final User fromUser = new User(UUID.randomUUID());
    private  final User toUser = new User(UUID.randomUUID());
    private final Transaction transaction = new Transaction(transactionId, fromUser.getId(), toUser.getId());

    @Test
    public void testGetId(){
        Assertions.assertEquals(transactionId, transaction.getId());
    }

    @Test
    public void testGetSetAmount() {
        Float amount = 100.0f;
        transaction.setAmount(amount);
        Assertions.assertEquals(amount, transaction.getAmount());
    }

    @Test
    public void testGetSetCreatedAt() {
        LocalDateTime createdAt = LocalDateTime.now();
        transaction.setCreatedAt(createdAt);
        Assertions.assertEquals(createdAt, transaction.getCreatedAt());
    }
}
