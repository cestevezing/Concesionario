/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

/**
 * clase cliente, que extiende de la clase persona
 * @author HTTP
 */
public class Client extends Person{
    /**
     * Constructor de la clase cliente
     * @param id
     * @param name
     * @param lastName
     * @param phone 
     */
    public Client(int id, String name, String lastName, String phone) {
        super(id, name, lastName, phone);
    }
    
}
