package org.sid.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_OP", discriminatorType = DiscriminatorType.STRING, length = 1)
public abstract class Operation {
    @Id
    @GeneratedValue
    private Long numero;
    private Date dateOperation;
    private double montante;
    @ManyToOne
    @JoinColumn(name="CODE_CPTE")
    private Compte compte;

    public Operation(Date dateOperation, double montante, Compte compte) {
        this.dateOperation = dateOperation;
        this.montante = montante;
    }
}
