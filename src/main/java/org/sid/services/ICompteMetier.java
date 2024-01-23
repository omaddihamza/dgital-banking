package org.sid.services;

import org.sid.entities.CompteCourant;
import org.sid.entities.CompteEpargne;

public interface ICompteMetier {
    void ajouterCompteCourant(CompteCourant compteCourant);
    void ajouterCompteEpargne(CompteEpargne compteEpargne);
}
