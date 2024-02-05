package org.sid.endPoint;

import org.sid.dto.ClientDTO;
import org.sid.entities.Client;
import org.sid.services.IClientMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/client")
@CrossOrigin("*")
public class ClientController {
    @Autowired
    private IClientMetier clientMetier;

    @PostMapping("/ajouter")
    public ResponseEntity<String> ajouterClient(@RequestBody ClientDTO clientDTO) {
        clientMetier.ajouterClient(clientDTO);
        return  ResponseEntity.status(HttpStatus.CREATED).body("Client added successfully");
    }

    @GetMapping("/list")
    public ResponseEntity<Page<Client>>  listClients(@RequestParam(defaultValue ="0") int page,@RequestParam(defaultValue ="10") int size) {
        Page<Client> clients = clientMetier.listClients(PageRequest.of(page, size));
        return ResponseEntity.ok(clients);
    }
}
