/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

/**
 * Clase maquinaria que extiende de la clase carro
 * @author Cristian
 */
public class MachineryCar extends Car{
    /**
     * Esta variable almacena el tipo de maquinaria que es.
     */
    private String subType;

    /**
     * Constructor de la clase MachineryCar
     * @param plate
     * @param brand
     * @param model
     * @param color
     * @param state
     * @param mileage
     * @param year
     * @param price
     * @param subType 
     */    
    public MachineryCar(String plate, String brand, String model, String color, String state, int mileage, int year, double price, String subType) {
        super(plate, brand, model, color, state, mileage, year, price);
        this.subType = subType;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }
    
    
}
