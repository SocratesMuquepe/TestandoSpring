/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.osti.spring.Logica;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author len
 */
@Controller
public class OlaSpringController {

 
  @RequestMapping(value="/ola", method= RequestMethod.GET)
    public String index(ModelMap map) {
        map.addAttribute("hello", "Hello Spring from Netbeans!!");
        return "index";
    }
//  public String execute() {
//      System.out.println("Executando a lógica com Spring MVC");
//      return "request";
//  }
}