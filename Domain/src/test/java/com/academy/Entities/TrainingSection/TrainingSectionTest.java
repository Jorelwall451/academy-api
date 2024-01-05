package com.academy.Entities.TrainingSection;

import com.academy.Entities.TrainingSection.TrainingSection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

public final class TrainingSectionTest {
    private final UUID trainingSectionId = UUID.randomUUID();
    private final TrainingSection trainingSection = new TrainingSection(trainingSectionId);

    @Test
    public void testGetId(){
        Assertions.assertEquals(trainingSectionId, trainingSection.getId());
    }

    @Test
    public void testGetSetName(){
        String testName = "Leg Section Training";
        trainingSection.setName(testName);
        Assertions.assertEquals(testName, trainingSection.getName());
    }

    @Test
    public void testGetSetDescription(){
        String testDescription = "Example";
        trainingSection.setDescription(testDescription);
        Assertions.assertEquals(testDescription, trainingSection.getDescription());
    }

    @Test
    public void testGetSetCreatedAt(){
        LocalDateTime testCreatedAt = LocalDateTime.now().minusDays(2);
        trainingSection.setCreatedAt(testCreatedAt);
        Assertions.assertEquals(testCreatedAt, trainingSection.getCreatedAt());
    }

    @Test
    public void testGetSetUpdatedAt(){
        LocalDateTime testUpdatedAt = LocalDateTime.now().minusDays(2);
        trainingSection.setUpdatedAt(testUpdatedAt);
        Assertions.assertEquals(testUpdatedAt, trainingSection.getUpdatedAt());
    }
}