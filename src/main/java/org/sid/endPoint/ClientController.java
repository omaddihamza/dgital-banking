package org.sid.endPoint;

import org.sid.dto.ClientDTO;
import org.sid.services.IClientMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> ajouterClient(ClientDTO clientDTO) {
        clientMetier.ajouterClient(clientDTO);
        return  ResponseEntity.status(HttpStatus.CREATED).body("Client added successfully");
    }
}
