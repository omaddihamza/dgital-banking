package org.sid.services;

import org.sid.entities.Compte;
import org.sid.entities.Operation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBanqueMetier {
    public Compte consulterCompte(String codeCpte);
    public void verser(String codeCpte, double montant);
    public void retirer(String codeCpte, double montant);
    public void virement(String codeCpteA, String codeCpteB, double montant);
    public Page<Operation> listOperations(String codeCpte, Pageable pageable);
}
