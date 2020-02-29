package com.example.testx.api;


import com.example.testx.model.Client;
import com.example.testx.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Client")
public class ClientResource {

    @Autowired
    private ClientService clientService;

    @PostMapping
    public Client addClient(@RequestBody Client client){


        return clientService.addClient(client);
    }

    @GetMapping
    public List<Client> getClient(){
        return clientService.getClientList();
    }

    @GetMapping("/{clientid}")
    public Client getClient( @PathVariable("clientid") int clientid){

        return clientService.getClient(clientid);
    }



}
