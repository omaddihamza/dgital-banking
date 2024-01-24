package org.sid.services;

import org.modelmapper.ModelMapper;
import org.sid.dto.ClientDTO;
import org.sid.entities.Client;
import org.sid.entities.CompteCourant;
import org.sid.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientMetierImpl implements IClientMetier {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private ClientRepository clientRepository;
    @Override
    public void ajouterClient(ClientDTO clientDTO) {
        Client client = modelMapper.map(clientDTO, Client.class);
        clientRepository.save(client);
    }
}
