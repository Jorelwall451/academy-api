package com.academy.Entities;

import Entities.Assessment;
import Entities.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class StudentTest {
    private final UUID studentId = UUID.randomUUID();
    private final Student student = new Student(studentId);

    @Test
    void getTeacherId() {
        Assertions.assertEquals(studentId, student.getId());
    }

    @Test
    void getAssessments() {
        List<Assessment> testAssessments = new ArrayList<>();

        for(int assessmentIndex = 0; assessmentIndex < 10; assessmentIndex++){
            Assessment newAssessment = new Assessment(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID());

            testAssessments.add(newAssessment);
        }

        student.setAssessments(testAssessments);

        for(int assessmentIndex = 0; assessmentIndex < 10; assessmentIndex++){
            Assertions.assertEquals(testAssessments.get(assessmentIndex), student.getAssessments().get(assessmentIndex));
        }
    }

    @Test
    void getPlans() {
    }
}