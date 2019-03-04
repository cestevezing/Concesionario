/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

/**
 * Clase carro estandar extiende de la clase carro
 * @author Cristian
 */
public class StandardCar extends Car{
    
    /**
     * constructo de la clase StandardCar
     * @param plate
     * @param brand
     * @param model
     * @param color
     * @param state
     * @param mileage
     * @param year
     * @param price 
     */
    public StandardCar(String plate, String brand, String model, String color, String state, int mileage, int year, double price) {
        super(plate, brand, model, color, state, mileage, year, price);
    }
    
}
