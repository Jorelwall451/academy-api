package Entities.Teacher;

import Entities.Assessment.Assessment;
import Entities.Student.Student;
import Entities.User.User;

import java.util.List;
import java.util.UUID;

public final class Teacher extends User {
    List<Student> students;
    List<Assessment> assessments;

    public Teacher(UUID id) {
        super(id);
    }
}
