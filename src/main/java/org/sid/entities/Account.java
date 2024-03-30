package org.sid.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.enumeration.AccountType;
import org.sid.enumeration.Currency;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String account_number;
    @Enumerated(EnumType.STRING)
    private AccountType account_type;
    private double Balance;
    @Enumerated(EnumType.STRING)
    private Currency currency;
    private Date created_at;
    private Date updated_at;
    @ManyToOne
    private Customer customer;
}
