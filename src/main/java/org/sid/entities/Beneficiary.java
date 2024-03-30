package org.sid.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Beneficiary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String accountNumber;
    private String bankName;
    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;
}
