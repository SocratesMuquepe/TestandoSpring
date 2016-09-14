/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.osti.spring.Modelo;

import java.util.Date;

/**
 *
 * @author Samuel Mavungo
 */
public class Teste {
    private String tituilo;
    private int numero;
    Date data;

    public String getTituilo() {
        return tituilo;
    }

    public void setTituilo(String tituilo) {
        this.tituilo = tituilo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

  public Date getData(){
      return data;
  }

    public void setData(Date data){
        this.data = data;
    }
    public class Teste2{
      private String nome, sexo;
      private int idade;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getSexo() {
            return sexo;
        }

        public void setSexo(String sexo) {
            this.sexo = sexo;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public Date getNasc_mento() {
            return nasc_mento;
        }

        public void setNasc_mento(Date nasc_mento) {
            this.nasc_mento = nasc_mento;
        }
      private Date nasc_mento;
    }
}
