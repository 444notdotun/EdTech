package com.EdTech.data.models;

import com.EdTech.utils.IdGenerator;
import com.EdTech.utils.Type;
import jakarta.persistence.*;
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


    @PrePersist
    public void prePersist() {
        this.setCourseId(IdGenerator.generateId(Type.COURSE));
    }

    public Course (){
        this.facilitators = new ArrayList<>();
    }
}
