package com.academy.Entities.Training;

import Entities.Training;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

public final class TrainingTest {
    private final UUID trainingId = UUID.randomUUID();
    private final Training training = new Training(trainingId);

    @Test
    void testGetId() {
        Assertions.assertEquals(trainingId, training.getId());
    }

    @Test
    void testGetSetName() {
        String testName = "Leg Training";
        training.setName(testName);
        Assertions.assertEquals(testName, training.getName());
    }

    @Test
    void testGetSetDescription() {
        String testDescription = "Leg Training";
        training.setDescription(testDescription);
        Assertions.assertEquals(testDescription, training.getDescription());
    }

    @Test
    void testGetSetCreatedAt() {
        LocalDateTime testCreatedAt = LocalDateTime.now().minusDays(2);
        training.setCreatedAt(testCreatedAt);
        Assertions.assertEquals(testCreatedAt, training.getCreatedAt());
    }

    @Test
    void testGetSetUpdatedAt() {
        LocalDateTime testUpdatedAt = LocalDateTime.now().minusDays(2);
        training.setUpdatedAt(testUpdatedAt);
        Assertions.assertEquals(testUpdatedAt, training.getUpdatedAt());
    }
}