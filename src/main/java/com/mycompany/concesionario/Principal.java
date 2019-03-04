/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

import java.util.Scanner;

/**
 *Clase principal, esta clase contiene el diseño del menu principal
 * @author Cristian
 */
public class Principal {
    DataBase data = new DataBase();
    int seller;
    
    Scanner scanner = new Scanner(System.in);
    String option;
    String a = "hola"; 
    
    /**
     * constructor de la clase principal
     */
    public Principal(){
        System.out.println("--------Inciar sesion-------");
        System.out.println("Ingrese la identificacion del vendedor");
        seller = scanner.nextInt();
        
        do {
            System.out.println("----------Inicio----------");
            System.out.println("1.Generar pedido.");
            System.out.println("2.Consultas.");
            System.out.println("3.Administrar datos.");
            System.out.println("4.Salir");
            scanner.nextLine();
            System.out.println("Seleccione una opcion: ");
            option = scanner.nextLine();
            switch (option){
                    case "1":
                        generateOrder();
                    break;
                    case "2": 
                        queries();
                    break;
                    case "3": 
                        admin();
                    break;
            }
        
        } while (!option.equals("4")); 
        
        
        
                      
    }//end principal
    
    /**
     * Este metodo instancia la clase Sales, la cual hace el proceso de la venta del coche. 
     */
    private void generateOrder(){
        Sales s = new Sales();
        s.generateSale(data,seller);
    }//end GenerateOrder
    
    /**
     *Este metodo instancia la clase queries, la cual hace todo el proseso de las consultas
     * como mas vendido,menos vendido,etc.
     */     
    private void queries(){
        
        
    }//end Queries
    
    /**
     * Este metodo instancia la clase admin, la cual nos permite 
     * modificar,agregar y eliminar elementos de las listas.
     */    
    private void admin(){
        Admin ad = new Admin();
        ad.menuAdmin(data);
        
    }//end admin
    
    
    
}//end class
