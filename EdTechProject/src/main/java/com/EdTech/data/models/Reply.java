package com.EdTech.data.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
public class Reply {
    @Id
    private String id;
    @ManyToOne
    @JoinColumn(name = "questionId")
    private Question question;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private Role userRole;
    private String content;
    private LocalDateTime repliedDate;
}
