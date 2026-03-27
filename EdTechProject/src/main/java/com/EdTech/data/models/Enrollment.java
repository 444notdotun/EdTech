package com.EdTech.data.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Enrollment {
    @Id
    private String enrollmentId;
    @ManyToOne
    @JoinColumn(name = "studentId")
    private User user;
    @ManyToOne
    @JoinColumn(name = "courseId")
    private Course course;
    @ManyToOne
    @JoinColumn(name = "paymentId")
    private Payment payment;
    private EnrollmentStatus status;
    private LocalDateTime enrolledAt;
    private Set<String> completedLessons;

    public  Enrollment() {
        this.completedLessons = new HashSet<>();
    }
}
