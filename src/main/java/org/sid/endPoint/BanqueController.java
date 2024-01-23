package org.sid.endPoint;

import org.sid.entities.Compte;
import org.sid.entities.Operation;
import org.sid.services.IBanqueMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BanqueController {
    @Autowired
    private IBanqueMetier banqueMetier;

    public Compte consulterCompte(String codeCpte) {
        return banqueMetier.consulterCompte(codeCpte);
    }

    public void verser(String codeCpte, double montant) {
        banqueMetier.verser(codeCpte, montant);
    }

    public void retirer(String codeCpte, double montant) {
        banqueMetier.retirer(codeCpte, montant);
    }

    public void virement(String codeCpteA, String codeCpteB, double montant) {
        banqueMetier.virement(codeCpteA, codeCpteB, montant);
    }

    public Page<Operation> listOperations(String codeCpte, Pageable pageable) {
        return banqueMetier.listOperations(codeCpte, pageable);
    }
}
