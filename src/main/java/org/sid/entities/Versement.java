package org.sid.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.Date;

@Entity
@DiscriminatorValue("V")
public class Versement extends Operation{

    public Versement(Date dateOperation, double montante, Compte compte) {
        super(dateOperation, montante, compte);
    }

    public Versement() {
        super();
    }
}
