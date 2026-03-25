package com.EdTech.data.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;


import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@DiscriminatorValue("Student")
public class Student extends User {
 private Set<Enrollment>  enrollments;
 public Student() {
     this.setRole(Role.STUDENT);
     this.setAccountStatus(AccountStatus.ACTIVE);
     this.enrollments = new LinkedHashSet<>();
 }

}
