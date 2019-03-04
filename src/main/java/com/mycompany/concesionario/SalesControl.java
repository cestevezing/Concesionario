/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

/**
 * Esta clase almacena los datos de una venta de coche
 * @author Cristian
 */
public class SalesControl {
    private int code;
    private int client;
    private int carType; 
    private String carReference;
    private double totalPrice;
    private int idSeller;

    /**
     * Costructor de la clase SalesControl
     * @param code
     * @param client
     * @param carType
     * @param carReference
     * @param totalPrice
     * @param idSeller 
     */
    public SalesControl(int code, int client, int carType, String carReference,double totalPrice,int idSeller) {
        this.code = code;
        this.client = client;
        this.carType = carType;
        this.carReference = carReference;
        this.totalPrice = totalPrice;
        this.idSeller = idSeller;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getClient() {
        return client;
    }

    public void setClient(int client) {
        this.client = client;
    }

    public int getCarType() {
        return carType;
    }

    public void setCarType(int carType) {
        this.carType = carType;
    }

    public String getCarReference() {
        return carReference;
    }

    public void setCarReference(String carReference) {
        this.carReference = carReference;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getIdSeller() {
        return idSeller;
    }

    public void setIdSeller(int idSeller) {
        this.idSeller = idSeller;
    }    
    
    
}
