package Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class Teacher extends User {
    List<Student> students = new ArrayList<>();
    List<Assessment> assessments = new ArrayList<>();

    public Teacher(UUID id) {
        super(id);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Assessment> getAssessments() {
        return assessments;
    }

    public void setAssessments(List<Assessment> assessments) {
        this.assessments = assessments;
    }
}
