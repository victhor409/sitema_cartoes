package com.cadastro.resource;

import com.cadastro.exception.ClienteException;
import com.cadastro.exception.ClienteNomeException;
import com.cadastro.model.dto.ClienteDTO;
import com.cadastro.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cliente")
public class ClienteResource {

    @Autowired
    private ClienteService service;

    @PostMapping
    public ResponseEntity criarCliente(@RequestBody ClienteDTO dto) throws ClienteNomeException, ClienteException {
        ClienteDTO newCliente = service.criarCliente(dto);
        return ResponseEntity.ok().body(newCliente);
    }
}
