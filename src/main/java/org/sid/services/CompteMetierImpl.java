package org.sid.services;

import org.modelmapper.ModelMapper;
import org.sid.dto.CompteCourantDTO;
import org.sid.dto.CompteEpargneDTO;
import org.sid.entities.Client;
import org.sid.entities.CompteCourant;
import org.sid.entities.CompteEpargne;
import org.sid.repository.ClientRepository;
import org.sid.repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompteMetierImpl implements ICompteMetier{

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private CompteRepository compteRepository;
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public void ajouterCompteCourant(CompteCourantDTO compteCourantDTO) {
        CompteCourant compteCourant = mapCompteCourant(compteCourantDTO);
         compteRepository.save(compteCourant);
    }
    @Override
    public void ajouterCompteEpargne(CompteEpargneDTO compteEpargneDTO) {
         CompteEpargne compteEpargne = mapCompteEpargne(compteEpargneDTO);
         compteRepository.save(compteEpargne);
    }

    private CompteCourant mapCompteCourant(CompteCourantDTO compteCourantDTO){
        CompteCourant compteCourant = modelMapper.map(compteCourantDTO, CompteCourant.class);
        Client client= clientRepository.findById(compteCourantDTO.getClientId()).get();
        compteCourant.setClient(client);
        return compteCourant;
    }

    private CompteEpargne mapCompteEpargne(CompteEpargneDTO compteEpargneDTO){
        CompteEpargne compteEpargne = modelMapper.map(compteEpargneDTO, CompteEpargne.class);
        Client client= clientRepository.findById(compteEpargneDTO.getClientId()).get();
        compteEpargne.setClient(client);
        return compteEpargne;
    }

}


