package org.sid.services;

import org.sid.dto.ClientDTO;
import org.sid.entities.Client;

public interface IClientMetier {
    void ajouterClient(ClientDTO clientDTO);
}
