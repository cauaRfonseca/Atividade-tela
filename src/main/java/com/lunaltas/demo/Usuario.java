package com.lunaltas.demo;

public class Usuario {
    private String nome;
    private String email;
    private double imc;

    public Usuario(String nome, String email, double imc) {
        this.nome = nome;
        this.email = email;
        this.imc = imc;
    }

    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public double getImc() { return imc; }
}
