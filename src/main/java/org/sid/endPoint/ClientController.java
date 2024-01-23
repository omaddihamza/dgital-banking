package org.sid.endPoint;

import org.sid.entities.Client;
import org.sid.services.IClientMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/Client")
@CrossOrigin("*")
public class ClientController {
    @Autowired
    private IClientMetier clientMetier;

    @PostMapping("/ajouter")
    public void ajouterClient(Client client) {
        clientMetier.ajouterClient(client);
    }
}
