package Entities.Student;

import Entities.Assessment.Assessment;
import Entities.Plan.Plan;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class Student {
    private UUID teacherId;
    private List<Assessment> assessments = new ArrayList<>();
    private List<Plan> plans = new ArrayList<>();

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
