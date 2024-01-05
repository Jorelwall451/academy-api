package com.academy.Entities.Student;

import com.academy.Entities.Assessment.Assessment;
import com.academy.Entities.Plan.Plan;
import com.academy.Entities.User.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class Student extends User {
    private UUID teacherId;
    private List<Assessment> assessments = new ArrayList<>();
    private List<Plan> plans = new ArrayList<>();

    public Student(UUID id) {
        super(id);
    }

    public UUID getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(UUID teacherId) {
        this.teacherId = teacherId;
    }

    public List<Assessment> getAssessments() {
        return assessments;
    }

    public void setAssessments(List<Assessment> assessments) {
        this.assessments = assessments;
    }

    public List<Plan> getPlans() {
        return plans;
    }

    public void setPlans(List<Plan> plans) {
        this.plans = plans;
    }
}
