package com.example.manali.salonflow.controller;

import com.example.manali.salonflow.model.Client;
import com.example.manali.salonflow.repository.ClientRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    private final ClientRepository clientRepository;

    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }
    @GetMapping ("/show")
    public List<Client> view() {
        return clientRepository.findAll();
    }

    @PostMapping ("/new")
    public void create(@RequestBody Client client){
        clientRepository.save(client);

}
}
