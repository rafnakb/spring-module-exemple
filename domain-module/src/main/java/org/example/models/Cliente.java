package org.example.models;

public class Cliente {
    private String nome;
    private int quantidade;
    private double price;

    public Cliente(String nome, int quantidade, double price) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.price = price;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
