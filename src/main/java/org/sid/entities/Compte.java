package org.sid.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_CPTE", discriminatorType = DiscriminatorType.STRING, length = 2)
public abstract class Compte {
    @Id
    private String codeCompte;
    private Date dateCreation;
    private double solde;
    @ManyToOne
    @JoinColumn(name ="CODE_CLI" )
    private Client client;

    public Compte(String codeCompte, Date dateCreation, double solde, Client client) {
        this.codeCompte = codeCompte;
        this.dateCreation = dateCreation;
        this.solde = solde;
        this.client = client;
    }
}
