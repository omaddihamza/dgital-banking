package org.sid.services;

import org.sid.dto.ClientDTO;
import org.sid.entities.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IClientMetier {
    void ajouterClient(ClientDTO clientDTO);
    Page<Client> listClients(Pageable pageable);
}
