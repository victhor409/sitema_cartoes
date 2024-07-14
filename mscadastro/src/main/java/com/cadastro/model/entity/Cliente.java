package com.cadastro.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.springframework.boot.autoconfigure.web.WebProperties;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;
    private String nome;
    private String email;
    private Date dataNascimento;
    private BigDecimal renda;
    private String cpf;


}
