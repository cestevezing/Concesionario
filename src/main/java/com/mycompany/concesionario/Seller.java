/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

/**
 * Clase vendedor extiende de la clase persona 
 * @author Cristaian
 */
public class Seller extends Person{
    private double bonus;
    /**
     * constructor de la clase Seller
     * @param id
     * @param name
     * @param lastName
     * @param phone
     * @param bonus 
     */
    public Seller(int id, String name, String lastName, String phone,double bonus) {
        super(id, name, lastName, phone);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    
}
