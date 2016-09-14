/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.osti.spring.Modelo;

/**
 *
 * @author len
 */
public class Utilizador {
    private String nome;
    private String email;
    private String utilizador;
    private String senha;

    public Utilizador(String nome, String email, String utilizador, String senha) {
        this.nome = nome;
        this.email = email;
        this.utilizador = utilizador;
        this.senha = senha;
    }

    public String getUtilizador() {
        return utilizador;
    }

    public void setUtilizador(String utilizador) {
        this.utilizador = utilizador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
