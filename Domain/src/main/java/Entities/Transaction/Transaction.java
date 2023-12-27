package Entities.Transaction;

import java.time.LocalDateTime;
import java.util.UUID;

public final class Transaction {
    private final UUID id;
    private final UUID fromUserId;
    private final UUID toUserId;
    private Float amount;
    private LocalDateTime createdAt;

    public Transaction(UUID id, UUID fromUserId, UUID toUserId) {
        this.id = id;
        this.fromUserId = fromUserId;
        this.toUserId = toUserId;
    }

    public UUID getId() {
        return id;
    }

    public UUID getFromUserId() {
        return fromUserId;
    }

    public UUID getToUserId() {
        return toUserId;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
