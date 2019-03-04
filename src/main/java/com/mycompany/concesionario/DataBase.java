/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase hace a funcion de base de datos para almacenar todos los datos del aplicativo
 * @author Cristian
 */
public class DataBase {
    /**
     * Lista para almacenar carros estandar
     */
    private final List<StandardCar> listStandar = new ArrayList<>();
    /**
     * Lista para almacenar carros deportivos
     */
    private final List<SportsCar> listSports = new ArrayList<>();
    /**
     * Lista para almacenar mquinaria
     */
    private final List<MachineryCar> listMachinery = new ArrayList<>();
    /**
     * Lista para almacenar carros personalizados
     */
    private final List<CustomCart> listCustom = new ArrayList<>();
    /**
     * Lista para almacenar vendedores
     */
    private final List<Seller> listSeller = new ArrayList<>();
    /**
     * Lista para almacenar clientes
     */
    private final List<Client> listClint = new ArrayList<>();
    /**
     * Lista para almacenar las venatas ralizadas
     */
    private final List<SalesControl> listSalesControl = new ArrayList<>();
    
    /**
     * constructor de la clase DataBase
     * Dentro de este metodo se crean unos valores por defecto para todas las listas
     */
    public DataBase() {
        for(int i=0;i< 5;i++){
            StandardCar car = new StandardCar("abc" + i,"audi", "cabrio", "rojo", "nuevo", 10000, 2010, 2000.2);
            listStandar.add(car);
            
            SportsCar carS = new SportsCar("bcd" + i,"audi", "A8", "rojo", "nuevo", 10000, 2010, 2000.2,450);
            listSports.add(carS);
            
            MachineryCar carM = new MachineryCar("cde" + i,"BMW", "serie 1", "verde", "nuevo", 10000, 2010, 2000.2,"Tractor");
            listMachinery.add(carM);
            
            CustomCart carC = new CustomCart("def" + i,"BMW", "serie 2", "red", "verde", 10000, 2010, 2000.2,"Cuero","Luces");
            listCustom.add(carC);
            
            Client person = new Client(i, "Tatiana", "Duarte", "Tel");
            listClint.add(person);
            
            Seller personS = new Seller(i, "Cristian", "Estevez", "tel", 0);
            listSeller.add(personS);
            
            SalesControl control = new SalesControl(i, 1, 2, "1", 12000,i);
            listSalesControl.add(control);
            
        }
    }

    public List<StandardCar> getListStandar() {
        return listStandar;
    }

    public List<SportsCar> getListSports() {
        return listSports;
    }

    public List<MachineryCar> getListMachinery() {
        return listMachinery;
    }

    public List<CustomCart> getListCustom() {
        return listCustom;
    }

    public List<Seller> getListSeller() {
        return listSeller;
    }

    public List<Client> getListClint() {
        return listClint;
    }

    public List<SalesControl> getListSalesControl() {
        return listSalesControl;
    }
    
}
