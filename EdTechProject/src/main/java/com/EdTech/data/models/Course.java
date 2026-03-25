package com.EdTech.data.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@Data
@Entity
public class Course {
    @Id
    @Column(unique = true, nullable = false)
    private String courseId;
    private String courseName;
    private String courseDescription;
    private BigDecimal coursePrice;
    private List<String> facilitators;
    private  CourseStatus status;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;

    public Course (){
        this.facilitators = new ArrayList<>();
    }
}
