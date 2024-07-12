package com.academy.Entities;

import Entities.Plan;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

public class PlanTest {
    UUID planId = UUID.randomUUID();
    Plan plan = new Plan(planId);

    @Test
    public void testGeId() {
        Assertions.assertEquals(planId, plan.getId());
    }

    @Test
    public void testGetSetName() {
        String name = "Basic Plan";
        plan.setName(name);
        Assertions.assertEquals(name, plan.getName());
    }

    @Test
    public void testGetSetDescription() {
        String description = "A simple plan";
        plan.setDescription(description);
        Assertions.assertEquals(description, plan.getDescription());
    }

    @Test
    public void testGetSetPrice() {
        Float price = 29.99f;
        plan.setPrice(price);
        Assertions.assertEquals(price, plan.getPrice());
    }

    @Test
    public void testGetSetCreatedAt() {
        LocalDateTime createdAt = LocalDateTime.now();
        plan.setCreatedAt(createdAt);
        Assertions.assertEquals(createdAt, plan.getCreatedAt());
    }

    @Test
    public void testGetSetUpdatedAt() {
        LocalDateTime updatedAt = LocalDateTime.now();
        plan.setUpdatedAt(updatedAt);
        Assertions.assertEquals(updatedAt, plan.getUpdatedAt());
    }
}