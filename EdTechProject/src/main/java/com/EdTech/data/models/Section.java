package com.EdTech.data.models;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class Section {
    @Id
    @Column(unique = true, nullable = false)
    private   String sectionId;
    private String sectionName;
    @ManyToOne
    @JoinColumn(name = "courseId")
    private Course course;
    private String title;
}
