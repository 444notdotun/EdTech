package com.EdTech.data.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
@Entity
@DiscriminatorValue("admin")
public class Admin extends User {
    private List<User> bannedUsers;
    public Admin(){
        this.bannedUsers = new ArrayList<>();
    }
}
