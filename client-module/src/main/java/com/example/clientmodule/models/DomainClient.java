package com.example.clientmodule.models;

import org.example.models.Cliente;

public class DomainClient extends Cliente {
    public DomainClient(String nome, int quantidade, double price) {
        super(nome, quantidade, price);
    }
}
