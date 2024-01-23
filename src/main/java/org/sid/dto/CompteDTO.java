package org.sid.dto;

import lombok.Data;

import java.util.Date;

@Data
public abstract class CompteDTO {
    private String codeCompte;
    private Date dateCreation;
    private double solde;
    private Long clientId;
}
