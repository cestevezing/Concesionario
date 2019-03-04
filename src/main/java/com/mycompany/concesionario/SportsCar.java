/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

/**
 * Clase carro deportivo extiende de la clase carro
 * @author Crsitian
 */
public class SportsCar extends Car{
    private int horsePower;

    /**
     * constructor de la clase SportsCar
     * @param reference
     * @param brand
     * @param model
     * @param color
     * @param state
     * @param mileage
     * @param year
     * @param price
     * @param horsePower 
     */
    public SportsCar(String reference, String brand, String model, String color, String state, int mileage, int year, double price,int horsePower) {
        super(reference, brand, model, color, state, mileage, year, price);
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
      
}
