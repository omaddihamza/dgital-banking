package org.sid.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.sid.enumeration.TransactionType;

import java.util.Date;

@Entity
@Data
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;
    @ManyToOne(fetch = FetchType.LAZY)
    private Account fromAccount;
    @ManyToOne(fetch = FetchType.LAZY)
    private Account toAccount;
    private double amount;
    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;
    private String description;
    private Date transactionDate;
}
