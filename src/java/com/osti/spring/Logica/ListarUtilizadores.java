/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.osti.spring.Logica;

import com.osti.spring.Modelo.Utilizador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author len
 */
public class ListarUtilizadores {
     public static List<Utilizador> listar(){
       List<Utilizador> utilizadores = new ArrayList<>();
       for(int i =40; i < 50; i++){
           Utilizador utilizador = new Utilizador("Agente"+i,"Agente"+i+"@hitman.com","hitagente"+i, "***"+(30*i)+"****");
           utilizadores.add(utilizador);
       }
       return utilizadores;
    }
     public static void main(String[] args) {
         for(Utilizador utilizador : listar()){
             System.out.println(utilizador.getNome() + " : " + utilizador.getUtilizador() + " : " + utilizador.getEmail() + " : " + utilizador.getSenha());
         }
         
    }
}
