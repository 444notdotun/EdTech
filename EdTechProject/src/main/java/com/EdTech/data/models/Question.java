package com.EdTech.data.models;

import com.EdTech.utils.IdGenerator;
import com.EdTech.utils.Type;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Question {
    @Id
    private String questionId;
    @ManyToOne
    @JoinColumn(name = "studentId")
    private Student student;
    @ManyToOne
    @JoinColumn(name = "lessonId")
    private Lesson lesson;
    private String content;
    private LocalDateTime date;


    @PrePersist
    public void prePersist() {
        this.setQuestionId(IdGenerator.generateId(Type.QUESTION));
    }
}
