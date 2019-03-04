/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

/**
 * Clase carro perzonalizado que extiende de la clase carro
 * @author Cristian
 */
public class CustomCart extends Car{
    /**
     * En esta variable se almacena informacion sobre el interior del coche 
     */
    private String inside;
    /**
     * En esta variable se almacena informacion sobre el exterior del coche
     */
    private String outside;
    /**
     * constructor de la clase CustomCart
     * @param reference
     * @param brand
     * @param model
     * @param color
     * @param state
     * @param mileage
     * @param year
     * @param price
     * @param inside
     * @param outside 
     */
    public CustomCart(String reference, String brand, String model, String color, String state, int mileage, int year, double price, String inside,String outside) {
        super(reference, brand, model, color, state, mileage, year, price);
        this.inside = inside;
        this.outside = outside;
    }

    public String getInside() {
        return inside;
    }

    public void setInside(String inside) {
        this.inside = inside;
    }

    public String getOutside() {
        return outside;
    }

    public void setOutside(String outside) {
        this.outside = outside;
    }
    
    
    
}
