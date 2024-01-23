package org.sid.services;

import jakarta.transaction.Transactional;
import org.sid.entities.*;
import org.sid.repository.ClientRepository;
import org.sid.repository.CompteRepository;
import org.sid.repository.OperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Transactional
public class BanqueMetierImpl implements IBanqueMetier{

    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private CompteRepository compteRepository;
    @Autowired
    private OperationRepository operationRepository;
    @Override
    public Compte consulterCompte(String codeCpte) {
        Compte cp = compteRepository.findById(codeCpte).get();
        if(cp==null) throw new RuntimeException("Compte introuvable");
        return cp;
    }

    @Override
    public void verser(String codeCpte, double montant) {
        Compte cp = compteRepository.findById(codeCpte).get();
        Versement v = new Versement(new Date(),montant, cp);
        operationRepository.save(v);
        cp.setSolde(cp.getSolde()+montant);
        compteRepository.save(cp);
    }

    @Override
    public void retirer(String codeCpte, double montant) {
        Compte cp = compteRepository.findById(codeCpte).get();
        double facilitesCaisse = 0;
        if (cp instanceof CompteCourant)
            facilitesCaisse = ((CompteCourant) cp).getDecouvert();
        if(facilitesCaisse+cp.getSolde()<montant)
            throw new RuntimeException("solde insuffisant");
        Retrait r = new Retrait(new Date(),montant, cp);
        operationRepository.save(r);
        cp.setSolde(cp.getSolde()-montant);
        compteRepository.save(cp);
    }

    @Override
    public void virement(String codeCpteA, String codeCpteB, double montant) {
       retirer(codeCpteA,montant);
       verser(codeCpteB,montant);
    }

    @Override
    public Page<Operation> listOperations(String codeCpte, Pageable pageable) {
        return operationRepository.listoperations(codeCpte, pageable);
    }
}
