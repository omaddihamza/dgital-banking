package org.sid.services;

import org.sid.entities.CompteCourant;
import org.sid.entities.CompteEpargne;
import org.sid.repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompteMetierImpl implements ICompteMetier{

    @Autowired
    private CompteRepository compteRepository;
    @Override
    public void ajouterCompteCourant(CompteCourant compteCourant) {
         compteRepository.save(compteCourant);
    }
    @Override
    public void ajouterCompteEpargne(CompteEpargne compteEpargne) {
         compteRepository.save(compteEpargne);
    }
}
