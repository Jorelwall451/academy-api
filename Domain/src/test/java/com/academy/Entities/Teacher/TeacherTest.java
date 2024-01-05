package com.academy.Entities.Teacher;

import com.academy.Entities.Assessment.Assessment;
import com.academy.Entities.Student.Student;
import com.academy.Entities.Teacher.Teacher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class TeacherTest {
    private final UUID teacherId = UUID.randomUUID();
    private final Teacher teacher = new Teacher(teacherId);

    @Test
    public void testGetId(){
        Assertions.assertEquals(teacherId, teacher.getId());
    }

    @Test
    public void testGetSetStudents(){
        List<Student> testStudents = new ArrayList<>();

        for(int studentIndex = 0; studentIndex < 10; studentIndex++){
            Student newTestStudent = new Student(UUID.randomUUID());

            testStudents.add(newTestStudent);
        }

        teacher.setStudents(testStudents);

        for(int studentIndex = 0; studentIndex < 10; studentIndex++){
            Assertions.assertEquals(testStudents.get(studentIndex), teacher.getStudents().get(studentIndex));
        }
    }

    @Test
    public void testGetSetAssessments(){
        List<Assessment> testAssessments = new ArrayList<>();

        for(int assessmentIndex = 0; assessmentIndex < 10; assessmentIndex++){
            Assessment newAssessment = new Assessment(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID());

            testAssessments.add(newAssessment);
        }

        teacher.setAssessments(testAssessments);

        for(int assessmentIndex = 0; assessmentIndex < 10; assessmentIndex++){
            Assertions.assertEquals(testAssessments.get(assessmentIndex), teacher.getAssessments().get(assessmentIndex));
        }
    }
}
