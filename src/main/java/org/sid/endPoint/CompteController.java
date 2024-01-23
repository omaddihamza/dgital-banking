package org.sid.endPoint;

import org.sid.entities.CompteCourant;
import org.sid.entities.CompteEpargne;
import org.sid.services.ICompteMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/compte")
public class CompteController {
    @Autowired
    private ICompteMetier compteMetier;

    @PostMapping("/ajouter/comptercourant")
    public void ajouterCompteCourant(CompteCourant compteCourant) {
        compteMetier.ajouterCompteCourant(compteCourant);
    }

    @PostMapping("ajouter/compteepargne")
    public void ajouterCompteEpargne(CompteEpargne compteEpargne) {
        compteMetier.ajouterCompteEpargne(compteEpargne);
    }
}
