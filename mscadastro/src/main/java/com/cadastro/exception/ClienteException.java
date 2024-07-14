package com.cadastro.exception;

public class ClienteException extends Exception{

    public ClienteException(){
        super("CPF Cliente nao encontrado, cadastre um cpf valido");
    }
}
