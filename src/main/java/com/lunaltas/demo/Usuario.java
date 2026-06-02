package com.lunaltas.demo;

public class Usuario {
    private String nome;
    private String email;

    // Construtor
    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // Getters SÃO OBRIGATÓRIOS para a Tabela!
    public String getNome() { return nome; }
    public String getEmail() { return email; }
}
