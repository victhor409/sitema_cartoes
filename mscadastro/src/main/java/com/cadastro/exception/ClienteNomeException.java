package com.cadastro.exception;

public class ClienteNomeException extends Exception{

    public ClienteNomeException(){
        super("Nome do Cliente invalido, por favor informe o nome");
    }
}
