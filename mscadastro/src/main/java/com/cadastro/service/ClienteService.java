package com.cadastro.service;

import com.cadastro.exception.ClienteException;
import com.cadastro.exception.ClienteNomeException;
import com.cadastro.model.dto.ClienteDTO;
import com.cadastro.model.entity.Cliente;
import com.cadastro.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    @Transactional
    public ClienteDTO criarCliente(ClienteDTO dto) throws ClienteException, ClienteNomeException {

        if(dto.getCpf() == null || dto.getCpf().equals("")){
            throw new ClienteException();
        }

        if(dto.getNome().equals("") || dto.getNome() == null){
            throw new ClienteNomeException();
        }

        Cliente cliente = new Cliente();

        cliente.setId(dto.getId());
        cliente.setNome(dto.getNome());
        cliente.setCpf(dto.getCpf());
        cliente.setEmail(dto.getEmail());
        cliente.setRenda(dto.getRenda());
        cliente.setDataNascimento(dto.getDataNascimento());


        Cliente newCliente = repository.save(cliente);
        return new ClienteDTO(newCliente);
    }
}
