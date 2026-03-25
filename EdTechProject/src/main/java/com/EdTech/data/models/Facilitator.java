package com.EdTech.data.models;

import jakarta.persistence.DiscriminatorValue;
import lombok.Data;

import java.math.BigDecimal;
@Data
@DiscriminatorValue("facilitator")
public class Facilitator extends User {
    private BigDecimal balance;
    private String About;

    public Facilitator() {
        this.setRole(Role.FACILITATOR);
        this.setAccountStatus(AccountStatus.PENDING_APPROVAL);
        this.setBalance(new BigDecimal(0));
    }
}
