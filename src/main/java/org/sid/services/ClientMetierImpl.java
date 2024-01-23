package org.sid.services;

import org.sid.entities.Client;
import org.sid.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientMetierImpl implements IClientMetier {

    @Autowired
    private ClientRepository clientRepository;
    @Override
    public void ajouterClient(Client client) {
        clientRepository.save(client);
    }
}
