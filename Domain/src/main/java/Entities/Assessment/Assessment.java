package Entities.Assessment;

import java.time.LocalDateTime;
import java.util.UUID;

public final class Assessment {
    private final UUID id;
    private final UUID teacherId;
    private final UUID studentId;

    private String description;
    private Integer rating;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Assessment(UUID id, UUID teacherId, UUID studentId) {
        this.id = id;
        this.teacherId = teacherId;
        this.studentId = studentId;
    }

    public UUID getId() {
        return id;
    }

    public UUID getTeacherId() {
        return teacherId;
    }

    public UUID getStudentId() {
        return studentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
