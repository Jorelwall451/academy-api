package Entities.Student;

import Entities.Assessment.Assessment;
import Entities.Plan.Plan;

import java.util.List;
import java.util.UUID;

public final class Student {
    private UUID teacherId;
    private List<Assessment> assessments;
    private List<Plan> plans;
}
