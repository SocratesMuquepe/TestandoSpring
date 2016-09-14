/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.osti.spring.Logica;

import com.osti.spring.Modelo.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author len
 */
public class PersonLogic {

    public static List<Person> list() {
        List<Person> list = new ArrayList<Person>();
        
        for (int i = 40; i < 50; i++) {
            Person person = new Person("Agent" + i, 20 + i);

            list.add(person);
        }
        return list;
    }
}
