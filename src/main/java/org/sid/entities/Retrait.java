package org.sid.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.Date;

@Entity
@DiscriminatorValue("R")
public class Retrait extends Operation {
    public Retrait(Date dateOperation, double montante, Compte compte) {
        super(dateOperation, montante, compte);
    }

    public Retrait() {
        super();
    }
}

