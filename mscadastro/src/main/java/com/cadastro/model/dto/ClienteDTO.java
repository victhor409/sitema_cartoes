package com.cadastro.model.dto;

import com.cadastro.model.entity.Cliente;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
public class ClienteDTO {

    private Long id;
    private String nome;
    private String email;
    private Date dataNascimento;
    private BigDecimal renda;
    private String cpf;

    public ClienteDTO(Cliente entity){
        this.id = entity.getId();
        this.nome = entity.getNome();
        this.email = entity.getEmail();
        this.dataNascimento = entity.getDataNascimento();
        this.cpf = entity.getCpf();
        this.renda = entity.getRenda();

    }
}
