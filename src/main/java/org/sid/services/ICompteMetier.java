package org.sid.services;

import org.sid.dto.CompteCourantDTO;
import org.sid.dto.CompteEpargneDTO;
import org.sid.entities.CompteEpargne;

public interface ICompteMetier {
    void ajouterCompteCourant(CompteCourantDTO CompteCourantDTO);
    void ajouterCompteEpargne(CompteEpargneDTO compteEpargneDTO);
}
