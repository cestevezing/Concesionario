/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Sales {
    
    Scanner scanner = new Scanner(System.in);
    private DataBase data = new DataBase();
    private String reference;
    private int carType;
    private int doc;
    private int seller;
    int option2 = 0;
    
    /**
     * Constructor de la clase sales
     */
    public Sales() {
        
    }
    
    /**
     * Esta clase contiene el diseño del menu de ventas,donde
     * se puede seleccionar tipo de carro que deseas comprar y ver los atributos de cada uno.
     * @param data
     * @param seller 
     */
    public void generateSale(DataBase data,int seller){
        this.seller = seller;
        this.data = data;
        System.out.println("-----Generar pedido-----");
        System.out.println("Ingrese el documento del cliente: ");
        doc = scanner.nextInt();
        
        while ( option2 !=5) {      
            
            System.out.println("Seleccione el tipo de carro que desea. ");
            System.out.println("1.Deportivo");
            System.out.println("2.Estandar");
            System.out.println("3.Maquinaria");
            System.out.println("4.Personalizado");
            System.out.println("5.Atras");            
            System.out.println("Seleccione:  ");
            
            option2 = scanner.nextInt();
            
            switch (option2) {
                case 1:
                    viewSports();
                    storeSale();
                                     
                    break;
                case 2:
                    viewStandar();
                    storeSale();
                    break;
                case 3:
                    viewMachinery();
                    storeSale();
                    break;
                case 4:
                    viewCustom();
                    storeSale();
                    break;
                
            }
            
        } 
        
    }//end generateSale
    
    /**
     * Este metodo muestra todos los coches del tipo deportivo
     */
    private void viewSports(){
        System.out.println("-----SPORTS-----");
        System.out.println("-Referencia   -Marca   -Modelo   -Color   -Estado   -Kilometros   -Precio   -Caballos de Fuerza ");
        for (SportsCar spo : data.getListSports()) {
            System.out.println(" *" + spo.getReference()+ "    *" + spo.getBrand() + "     *" +spo.getModel() + "    *" +
                    spo.getColor() + "    *" + spo.getState() + "    *" + spo.getMileage() + "    *" +spo.getPrice() + "    *" +
                    spo.getHorsePower());
        }
        scanner.nextLine();
        System.out.println("Ingrese la placa del auto que desea: ");
        reference = scanner.nextLine();
        carType = 1;
    }//end viewSports
    
    /**
     * Este metodo muestra todos los coches del tipo estandar
     */
    private  void viewStandar(){
        
        System.out.println("-----ESTANDAR-----");
        System.out.println("-Referencia   -Marca   -Modelo   -Color   -Estado   -Kilometros   -Precio   ");
        for (StandardCar sta : data.getListStandar()) {
            System.out.println(" *" + sta.getReference()+ "    *" + sta.getBrand() + "     *" +sta.getModel() + "    *" +
                    sta.getColor() + "    *" + sta.getState() + "    *" + sta.getMileage() + "    *" +sta.getPrice() );
        }
        scanner.nextLine();
        System.out.println("Ingrese la placa del auto que desea: ");
        reference = scanner.nextLine();
        carType = 2;
    }//end viewStrandar
    
    /**
     * Este metodo muestra toda la maquinaria disponible
     */
    private void viewMachinery(){
        
        System.out.println("-----MAQUINARIA-----");
        System.out.println("-Referencia   -Marca   -Modelo   -Color   -Estado   -Kilometros   -Precio   -Sub-Tipo");
        for (MachineryCar mac : data.getListMachinery()) {
            System.out.println(" *" + mac.getReference()+ "    *" + mac.getBrand() + "     *" +mac.getModel() + "    *" +
                    mac.getColor() + "    *" + mac.getState() + "    *" + mac.getMileage() + "    *" +mac.getPrice() + "    *" +mac.getSubType() );
        }
        scanner.nextLine();
        System.out.println("Ingrese la placa del auto que desea: ");
        reference = scanner.nextLine();
        carType = 3;
    }//end viewMachinery
    
    /**
     * Este metodo nos muestra los coches del tipo personalizado
     */
    private  void viewCustom(){
        System.out.println("-----PERSONALIZADO-----");
        System.out.println("-Referencia   -Marca   -Modelo   -Color   -Estado   -Kilometros   -Precio   -Interior   -Exterior");
        for (CustomCart cus : data.getListCustom()) {
            System.out.println(" *" + cus.getReference()+ "    *" + cus.getBrand() + "     *" +cus.getModel() + "    *" +
                    cus.getColor() + "    *" + cus.getState() + "    *" + cus.getMileage() + "    *" +cus.getPrice() + 
                    "    *" +cus.getInside() + "    *" + cus.getOutside() );
        }
        scanner.nextLine();
        System.out.println("Ingrese la placa del auto que desea: ");
        reference = scanner.nextLine();
        carType = 4;
        
    }//end viewCustom
        
    /**
     * En este metodo se realiza el proceso final de la venta, agrega todo los datos a 
     * la lista de las ventas realizadas.  
     */
    public void storeSale(){
        switch (carType) {
                case 1:
                    for (SportsCar spo : data.getListSports()) {
                        if(spo.getReference().equals(reference)){
                            SalesControl control = new SalesControl(data.getListSalesControl().size() + 2 , doc, carType, reference,spo.getPrice(),seller);
                            data.getListSalesControl().add(control);
                            discount(spo.getPrice());
                            System.out.println("La compra fue realizada exitosamente.");
                            option2 = 5;
                        }
                    }
                    
                    break;
                case 2:
                    for (StandardCar sta : data.getListStandar()) {
                        if(sta.getReference().equals(reference)){
                            SalesControl control = new SalesControl(data.getListSalesControl().size() + 2 , doc, carType, reference,sta.getPrice(),seller);
                            data.getListSalesControl().add(control);
                            discount(sta.getPrice());
                            option2 = 5;
                        }
                    }
                    break;
                case 3:
                    for (MachineryCar mac : data.getListMachinery()) {
                        if(mac.getReference().equals(reference)){
                            SalesControl control = new SalesControl(data.getListSalesControl().size() + 2 , doc, carType, reference,mac.getPrice(),seller);
                            data.getListSalesControl().add(control);
                            discount(mac.getPrice());
                            option2 = 5;
                        }
                    }
                    break;
                case 4:
                    for (CustomCart cus : data.getListCustom()) {
                        if(cus.getReference().equals(reference)){
                            SalesControl control = new SalesControl(data.getListSalesControl().size() + 2 , doc, carType, reference,cus.getPrice(),seller);
                            data.getListSalesControl().add(control);
                            discount(cus.getPrice());
                            option2 = 5;
                        }
                    }
                    break;
                
            }
        
        
    }//end storeSale
    
    /**
     * este metodo calcula la bonificacion del vendedor y se lo agrega a la cuenta 
     * @param price 
     */
    public void discount(double price){
        double bonus;
        for (Seller sel : data.getListSeller()) {
            if(sel.getId()==seller){
                bonus = price * 0.05;
                bonus = bonus + sel.getBonus();
                sel.setBonus(bonus);
            }
            
        }
    }//discount
    
}//end class
