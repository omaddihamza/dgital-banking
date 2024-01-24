package org.sid.endPoint;

import org.sid.dto.CompteCourantDTO;
import org.sid.dto.CompteEpargneDTO;
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
    public void ajouterCompteCourant(CompteCourantDTO compteCourantDTO) {
        compteMetier.ajouterCompteCourant(compteCourantDTO);
    }

    @PostMapping("ajouter/compteepargne")
    public void ajouterCompteEpargne(CompteEpargneDTO compteEpargneDTO) {
        compteMetier.ajouterCompteEpargne(compteEpargneDTO);
    }
}
