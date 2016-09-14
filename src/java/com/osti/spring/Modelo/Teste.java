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
}
