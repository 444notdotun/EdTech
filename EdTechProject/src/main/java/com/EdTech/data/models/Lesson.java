package com.EdTech.data.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Lesson {
    @Id
    @Column(unique = true, nullable = false)
    private String lessonId;
    @ManyToOne
    @JoinColumn(name = "sectionId")
    private Section section;
    private String title;
    private String description;
    private String contentUrl;
    private LessonStatus status;
}
