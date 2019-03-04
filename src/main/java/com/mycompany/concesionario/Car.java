/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

/**
 * 
 * @author Cristian
 */
public class Car {
    private String reference;
    private String brand;
    private String model;
    private String color;
    private String state;
    private int mileage;
    private int year;
    private double price;

    /**
     * Constructor de la clase carro
     * @param reference
     * @param brand
     * @param model
     * @param color
     * @param state
     * @param mileage
     * @param year
     * @param price 
     */
    public Car(String reference, String brand, String model, String color, String state, int mileage, int year, double price) {
        this.reference = reference;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.state = state;
        this.mileage = mileage;
        this.year = year;
        this.price = price;
    }

    public String getReference() {
        return reference;
    }

    public void setRefetence(String reference) {
        this.reference = reference;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }    

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
      
    
}
