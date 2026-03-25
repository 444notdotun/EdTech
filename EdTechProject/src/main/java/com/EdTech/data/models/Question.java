package com.EdTech.data.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Question {
    @Id
    private String id;
    @ManyToOne
    @JoinColumn(name = "studentId")
    private Student student;
    @ManyToOne
    @JoinColumn(name = "lessonId")
    private Lesson lesson;
    private String content;
    private LocalDateTime date;
}
