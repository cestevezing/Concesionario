/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

import java.util.Scanner;

/**
 * Clase administrador
 * 
 * @author Cristian
 */
public class Admin {
    DataBase data = new DataBase();
    Scanner scanner = new Scanner(System.in);
    int option3 = 0;
    /**
     * Constructor de la clase Admin
     */
    public Admin() {
        
    }   
    
    /**
     * Este metodo contiene el diseño del menu, que nos permite hacer cambios 
     * en las listas de coches, clientes y vendedores.
     * @param dat 
     */
    public void menuAdmin(DataBase dat){
        this.data = dat;
        while (option3 != 4) {            
            System.out.println("-----ADMINISTRAR-----");
            System.out.println("1.Modificar.");
            System.out.println("2.Agregar.");
            System.out.println("3.Eliminar.");
            System.out.println("4.Atras.");
            System.out.println("seleccione un opcion: ");
            option3 = scanner.nextInt();
            switch(option3){
                case 1:
                    System.out.println("------MODIFICAR------");
                    System.out.println("1.Clientes.");
                    System.out.println("2.Vendedores.");
                    System.out.println("3.Deportivos.");
                    System.out.println("4.Estandar.");
                    System.out.println("5.Maquinaria.");
                    System.out.println("6.Perzonalizados.");
                    System.out.println("7.Atras.");
                    System.out.println("seleccione una oocion: ");
                    int option4 = scanner.nextInt();
                    switch(option4){
                        case 1:
                            editClient();
                            break;
                        case 2:
                            editSeller();
                            break;
                        case 3:
                            editSports();
                            break;
                        case 4:
                            editStandard();
                            break;
                        case 5:
                            editMachinery();
                            break;
                        case 6:
                            editCustom();
                            break; 
                    }

                    break;
                case 2:
                    System.out.println("-------AGREGAR-------");
                    System.out.println("1.Clientes.");
                    System.out.println("2.Vendedores.");
                    System.out.println("3.Deportivos.");
                    System.out.println("4.Estandar.");
                    System.out.println("5.Maquinaria.");
                    System.out.println("6.Perzonalizados.");
                    System.out.println("7.Atras.");
                    System.out.println("seleccione una oocion: ");
                    int option5 = scanner.nextInt();
                    switch(option5){
                        case 1:
                            addClient();
                            break;
                        case 2:
                            addSeller();
                            break;
                        case 3:
                            addSports();
                            break;
                        case 4:
                            addStandard();
                            break;
                        case 5:
                            addMachinery();
                            break;
                        case 6:
                            addCustom();
                            break; 
                    }
                    break;
                case 3 :
                    System.out.println("-------ELIMINAR-------");
                    System.out.println("1.Clientes.");
                    System.out.println("2.Vendedores.");
                    System.out.println("3.Deportivos.");
                    System.out.println("4.Estandar.");
                    System.out.println("5.Maquinaria.");
                    System.out.println("6.Perzonalizados.");
                    System.out.println("7.Atras.");
                    System.out.println("seleccione una oocion: ");
                    int option6 = scanner.nextInt();
                    switch(option6){
                        case 1:
                            deleteClient();
                            break;
                        case 2:
                            deleteSeller();
                            break;
                        case 3:
                            deleteSports();
                            break;
                        case 4:
                            deleteStandard();
                            break;
                        case 5:
                            deleteMachinery();
                            break;
                        case 6:
                            deleteCustom();
                            break; 
                    }
                    break;  

            }
        }
        
    }//end menuAdmin
    
        
    //-----------edit 
    /**
     * Este metodo nos permite modificar un vendedor en especifico
     */
    private void editSeller(){   
        int option;
        System.out.println("------EDITAR VENDEDOR");
        int i = 1;
        System.out.println(" #    id    nombre    apellido    telefono   bonificacion");
        for (Seller sel : data.getListSeller()) {
            System.out.println(i+".  *"+ sel.getId()+"  *"+sel.getName()+"  *"+sel.getLastName()+"  *"+sel.getPhone()+"  *"+sel.getBonus());
            i=i+1;
        }
        System.out.println("ingrese el vendedor que quiere modificar: ");
        option = scanner.nextInt();
        Seller sel = data.getListSeller().get(option-1);
        System.out.println("------Datos Vendedor");
        System.out.println("1.Nombre :" +sel.getName());
        System.out.println("2.Apellido :" + sel.getLastName());
        System.out.println("3.Telefono :"+ sel.getPhone());
        System.out.println("4.Bonificaion  :"+ sel.getBonus());
        System.out.println("5.cancelar.");
        System.out.println("Seleccione el valor que desea cambiar");
        int option2 = scanner.nextInt();
        switch(option2){
            case 1:
                scanner.nextLine();
                System.out.println("Ingrese el nuevo nombre:");
                String name = scanner.nextLine();
                data.getListSeller().get(option-1).setName(name);
                System.out.println("Se actualiso con exito.");
                break;
            case 2:
                scanner.nextLine();
                System.out.println("Ingrese el nuevo apellido:");
                String lastName = scanner.nextLine();
                data.getListSeller().get(option-1).setLastName(lastName);
                System.out.println("Se actualisocon exito.");
                break;
            case 3:
                scanner.nextLine();
                System.out.println("Ingrese el nuevo telefono:");
                String phone = scanner.nextLine();
                data.getListSeller().get(option-1).setPhone(phone);
                System.out.println("Se actualisocon exito.");
                break;
            case 4:
                scanner.nextLine();
                System.out.println("Ingrese la nueva bonificacion:");
                double bonus = Double.parseDouble(scanner.nextLine());
                data.getListSeller().get(option-1).setBonus(bonus);
                System.out.println("Se actualisocon exito.");
                break;
        }
        
    }//end edit seller
    
    /**
     * Este metodo nos permite modificar un cliente en especifico
     */
    private void editClient(){
        int option;
        System.out.println("------EDITAR CLIENTE");
        int i = 1;
        System.out.println(" #    id    nombre    apellido    telefono ");
        for (Client cli : data.getListClint()) {
            System.out.println(i+".  *"+ cli.getId()+"  *"+cli.getName()+"  *"+cli.getLastName()+"  *"+cli.getPhone());
            i=i+1;
        }
        System.out.println("ingrese el cliente que quiere modificar: ");
        option = scanner.nextInt();
        
        Client cli = data.getListClint().get(option-1);
        System.out.println("------DATOS CLIENTE");
        System.out.println("1.Nombre :" +cli.getName());
        System.out.println("2.Apellido :" + cli.getLastName());
        System.out.println("3.Telefono :"+ cli.getPhone());
        System.out.println("4.cancelar.");
        System.out.println("Seleccione el valor que desea cambiar");
        int option2 = scanner.nextInt();
        switch(option2){
            case 1:
                scanner.nextLine();
                System.out.println("Ingrese el nuevo nombre:");
                String name = scanner.nextLine();
                data.getListClint().get(option-1).setName(name);
                System.out.println("Se actualiso con exito.");
                break;
            case 2:
                scanner.nextLine();
                System.out.println("Ingrese el nuevo apellido:");
                String lastName = scanner.nextLine();
                data.getListClint().get(option-1).setLastName(lastName);
                System.out.println("Se actualisocon exito.");
                break;
            case 3:
                scanner.nextLine();
                System.out.println("Ingrese el nuevo telefono:");
                String phone = scanner.nextLine();
                data.getListClint().get(option-1).setPhone(phone);
                System.out.println("Se actualisocon exito.");
                break;
        }
    }//end edit cliente
    
    /**
     * Este metodo nos permite modificar un coche del tipo deportivo
     */
    private void editSports(){
        System.out.println("-----EDITAR CARROS DEPORTIVOS");
        int i = 1;
        System.out.println("#  Referencia    Marca    Modelo    Color    Estado    Kilometros    Año    Precio    Caballos de fuerza");
        for (SportsCar spo : data.getListSports()) {
            System.out.println(i+".  *" + spo.getReference()+ "    *" + spo.getBrand() + "     *" +spo.getModel() + "    *" +
                    spo.getColor() + "    *" + spo.getState() + "    *" + spo.getMileage()+ "    *" +spo.getYear() + "    *" +spo.getPrice() 
                    +"    *" +spo.getHorsePower());
        }
        System.out.println("ingrese el cliente que quiere modificar: ");
        int option = scanner.nextInt();
        SportsCar spo = data.getListSports().get(option-1);
        System.out.println("------CARACTERISTICAS DEL CARRO");
        System.out.println("1.Marca :" + spo.getBrand());
        System.out.println("2.Modelo :" + spo.getModel());
        System.out.println("3.Color :" + spo.getColor());
        System.out.println("4.Estado :" + spo.getState());
        System.out.println("5.Kilometros :" + spo.getMileage());
        System.out.println("6.Año :"+ spo.getYear() );
        System.out.println("7.Precio :" + spo.getPrice());
        System.out.println("8.Caballos de fuerza" + spo.getHorsePower());
        System.out.println("9.cancelar.");
        
        System.out.println("Seleccione el valor que desea cambiar");
        int option2 = scanner.nextInt();
        switch(option2){
            case 1:
                scanner.nextLine();
                System.out.println("Ingrese la nueva marca:");
                String brand = scanner.nextLine();
                data.getListSports().get(option-1).setBrand(brand);
                System.out.println("Se actualiso con exito.");
                break;
            case 2:
                scanner.nextLine();
                System.out.println("Ingrese el nuevo modelo:");
                String model = scanner.nextLine();
                data.getListSports().get(option-1).setModel(model);
                System.out.println("Se actualisocon exito.");
                break;
            case 3:
                scanner.nextLine();
                System.out.println("Ingrese el nuevo color:");
                String color = scanner.nextLine();
                data.getListSports().get(option-1).setColor(color);
                System.out.println("Se actualisocon exito.");
                break;
            case 4:
                scanner.nextLine();
                System.out.println("Ingrese el nuevo estado:");
                String state = scanner.nextLine();
                data.getListSports().get(option-1).setState(state);
                System.out.println("Se actualisocon exito.");
                break;
            case 5:
                scanner.nextLine();
                System.out.println("Ingrese el nuevo Kilometraje:");
                int Mileage = scanner.nextInt();
                data.getListSports().get(option-1).setMileage(Mileage);
                System.out.println("Se actualisocon exito.");
                break;
            case 6:
                scanner.nextLine();
                System.out.println("Ingrese el nuevo Año:");
                int year = scanner.nextInt();
                data.getListSports().get(option-1).setYear(year);
                System.out.println("Se actualisocon exito.");
                break;
            case 7:
                scanner.nextLine();
                System.out.println("Ingrese el nuevo precio:");
                double price = Double.parseDouble(scanner.nextLine());
                data.getListSports().get(option-1).setPrice(price);
                System.out.println("Se actualisocon exito.");
                break;
            case 8:
                scanner.nextLine();
                System.out.println("Ingrese los nuevos caballos de fuerza:");
                int horsePower = scanner.nextInt();
                data.getListSports().get(option-1).setHorsePower(horsePower);
                System.out.println("Se actualisocon exito.");
                break;
              
        }
    }//end edit sports
    
    /**
     * Este metodo nos permite modificar un coche del tipo estandar
     */
    private void editStandard(){
        System.out.println("-----EDITAR CARROS ESTANDAR");
        int i = 1;
        System.out.println("#  Referencia    Marca    Modelo    Color    Estado    Kilometros    Año    Precio   ");
        for (StandardCar sta : data.getListStandar()) {
            System.out.println(i+".  *" + sta.getReference()+ "    *" + sta.getBrand() + "     *" +sta.getModel() + "    *" +
                    sta.getColor() + "    *" + sta.getState() + "    *" + sta.getMileage()+ "    *" +sta.getYear() + "    *" +sta.getPrice() );
        }
        System.out.println("ingrese el cliente que quiere modificar: ");
        int option = scanner.nextInt();
        StandardCar sta = data.getListStandar().get(option-1);
        System.out.println("------CARACTERISTICAS DEL CARRO");
        System.out.println("1.Marca :" + sta.getBrand());
        System.out.println("2.Modelo :" + sta.getModel());
        System.out.println("3.Color :" + sta.getColor());
        System.out.println("4.Estado :" + sta.getState());
        System.out.println("5.Kilometros :" + sta.getMileage());
        System.out.println("6.Año :"+ sta.getYear() );
        System.out.println("7.Precio :" + sta.getPrice());
        System.out.println("8.cancelar.");
        
        System.out.println("Seleccione el valor que desea cambiar");
        int option2 = scanner.nextInt();
        switch(option2){
            case 1:
                scanner.nextLine();
                System.out.println("Ingrese la nueva marca:");
                String brand = scanner.nextLine();
                data.getListStandar().get(option-1).setBrand(brand);
                System.out.println("Se actualiso con exito.");
                break;
            case 2:
                scanner.nextLine();
                System.out.println("Ingrese el nuevo modelo:");
                String model = scanner.nextLine();
                data.getListStandar().get(option-1).setModel(model);
                System.out.println("Se actualisocon exito.");
                break;
            case 3:
                scanner.nextLine();
                System.out.println("Ingrese el nuevo color:");
                String color = scanner.nextLine();
                data.getListStandar().get(option-1).setColor(color);
                System.out.println("Se actualisocon exito.");
                break;
            case 4:
                scanner.nextLine();
                System.out.println("Ingrese el nuevo estado:");
                String state = scanner.nextLine();
                data.getListStandar().get(option-1).setState(state);
                System.out.println("Se actualisocon exito.");
                break;
            case 5:
                scanner.nextLine();
                System.out.println("Ingrese el nuevo Kilometraje:");
                int Mileage = scanner.nextInt();
                data.getListStandar().get(option-1).setMileage(Mileage);
                System.out.println("Se actualisocon exito.");
                break;
            case 6:
                scanner.nextLine();
                System.out.println("Ingrese el nuevo Año:");
                int year = scanner.nextInt();
                data.getListStandar().get(option-1).setYear(year);
                System.out.println("Se actualisocon exito.");
                break;
            case 7:
                scanner.nextLine();
                System.out.println("Ingrese el nuevo precio:");
                double price = Double.parseDouble(scanner.nextLine());
                data.getListStandar().get(option-1).setPrice(price);
                System.out.println("Se actualisocon exito.");
                break;
              
        }
        
    }//end edit standard
    
    /**
     * Este metodo nos permite modificar maquinaria
     */
    private void editMachinery(){
        System.out.println("-----EDITAR MAQUINARIA");
        int i = 1;
        System.out.println("#  Referencia    Marca    Modelo    Color    Estado    Kilometros    Año    Precio    Sub-tipo");
        for (MachineryCar mac : data.getListMachinery()) {
            System.out.println(i+".  *" + mac.getReference()+ "    *" + mac.getBrand() + "     *" +mac.getModel() + "    *" +
                    mac.getColor() + "    *" + mac.getState() + "    *" + mac.getMileage()+ "    *" +mac.getYear() + "    *" 
                    +mac.getPrice() +"    *"+mac.getSubType());
        }
        System.out.println("ingrese el cliente que quiere modificar: ");
        int option = scanner.nextInt();
        MachineryCar mac = data.getListMachinery().get(option-1);
        System.out.println("------CARACTERISTICAS DEL CARRO");
        System.out.println("1.Marca :" + mac.getBrand());
        System.out.println("2.Modelo :" + mac.getModel());
        System.out.println("3.Color :" + mac.getColor());
        System.out.println("4.Estado :" + mac.getState());
        System.out.println("5.Kilometros :" + mac.getMileage());
        System.out.println("6.Año :"+ mac.getYear() );
        System.out.println("7.Precio :" + mac.getPrice());
        System.out.println("8.Sub-tipo :" + mac.getSubType() );
        System.out.println("9.Cancelar.");
        
        System.out.println("Seleccione el valor que desea cambiar");
        int option2 = scanner.nextInt();
        switch(option2){
            case 1:
                scanner.nextLine();
                System.out.println("Ingrese la nueva marca:");
                String brand = scanner.nextLine();
                data.getListMachinery().get(option-1).setBrand(brand);
                System.out.println("Se actualiso con exito.");
                break;
            case 2:
                scanner.nextLine();
                System.out.println("Ingrese el nuevo modelo:");
                String model = scanner.nextLine();
                data.getListMachinery().get(option-1).setModel(model);
                System.out.println("Se actualisocon exito.");
                break;
            case 3:
                scanner.nextLine();
                System.out.println("Ingrese el nuevo color:");
                String color = scanner.nextLine();
                data.getListMachinery().get(option-1).setColor(color);
                System.out.println("Se actualisocon exito.");
                break;
            case 4:
                scanner.nextLine();
                System.out.println("Ingrese el nuevo estado:");
                String state = scanner.nextLine();
                data.getListMachinery().get(option-1).setState(state);
                System.out.println("Se actualisocon exito.");
                break;
            case 5:
                scanner.nextLine();
                System.out.println("Ingrese el nuevo Kilometraje:");
                int Mileage = scanner.nextInt();
                data.getListMachinery().get(option-1).setMileage(Mileage);
                System.out.println("Se actualisocon exito.");
                break;
            case 6:
                scanner.nextLine();
                System.out.println("Ingrese el nuevo Año:");
                int year = scanner.nextInt();
                data.getListMachinery().get(option-1).setYear(year);
                System.out.println("Se actualisocon exito.");
                break;
            case 7:
                scanner.nextLine();
                System.out.println("Ingrese el nuevo precio:");
                double price = Double.parseDouble(scanner.nextLine());
                data.getListMachinery().get(option-1).setPrice(price);
                System.out.println("Se actualisocon exito.");
                break;
            case 8:
                scanner.nextLine();
                System.out.println("Ingrese el nuevo precio:");
                String subType = scanner.nextLine();
                data.getListMachinery().get(option-1).setSubType(subType);
                System.out.println("Se actualisocon exito.");
                break;
              
        }
    }//end edit Machinery
    
    /**
     * Este metodo nos permite modificar un coche personalizado
     */
    private void editCustom(){
        System.out.println("-----EDITAR CARROS PERSONALIZADOS");
        int i = 1;
        System.out.println("#  Referencia    Marca    Modelo    Color    Estado    Kilometros    Año    Precio    Interior    Exterior");
        for (CustomCart cus : data.getListCustom()) {
            System.out.println(i+".  *" + cus.getReference()+ "    *" + cus.getBrand() + "     *" +cus.getModel() + "    *" +
                    cus.getColor() + "    *" + cus.getState() + "    *" + cus.getMileage()+ "    *" +cus.getYear() + "    *" 
                    +cus.getPrice() + "    *"+cus.getInside() + "    *" + cus.getOutside());
        }
        System.out.println("ingrese el cliente que quiere modificar: ");
        int option = scanner.nextInt();
        CustomCart cus = data.getListCustom().get(option-1);
        System.out.println("------CARACTERISTICAS DEL CARRO");
        System.out.println("1.Marca :" + cus.getBrand());
        System.out.println("2.Modelo :" + cus.getModel());
        System.out.println("3.Color :" + cus.getColor());
        System.out.println("4.Estado :" + cus.getState());
        System.out.println("5.Kilometros :" + cus.getMileage());
        System.out.println("6.Año :"+ cus.getYear() );
        System.out.println("7.Precio :" + cus.getPrice());
        System.out.println("8.Interior :" + cus.getInside());
        System.out.println("9.Exterior :" + cus.getOutside());
        System.out.println("10.cancelar.");
        
        System.out.println("Seleccione el valor que desea cambiar");
        int option2 = scanner.nextInt();
        switch(option2){
            case 1:
                scanner.reset();
                System.out.println("Ingrese la nueva marca:");
                String brand = scanner.next();
                data.getListCustom().get(option-1).setBrand(brand);
                System.out.println("Se actualiso con exito.");
                break;
            case 2:
                scanner.reset();
                System.out.println("Ingrese el nuevo modelo:");
                String model = scanner.next();
                data.getListCustom().get(option-1).setModel(model);
                System.out.println("Se actualisocon exito.");
                break;
            case 3:
                scanner.reset();
                System.out.println("Ingrese el nuevo color:");
                String color = scanner.next();
                data.getListCustom().get(option-1).setColor(color);
                System.out.println("Se actualisocon exito.");
                break;
            case 4:
                scanner.reset();
                System.out.println("Ingrese el nuevo estado:");
                String state = scanner.next();
                data.getListCustom().get(option-1).setState(state);
                System.out.println("Se actualisocon exito.");
                break;
            case 5:
                scanner.reset();
                System.out.println("Ingrese el nuevo Kilometraje:");
                int Mileage = scanner.nextInt();
                data.getListCustom().get(option-1).setMileage(Mileage);
                System.out.println("Se actualisocon exito.");
                break;
            case 6:
                scanner.reset();
                System.out.println("Ingrese el nuevo Año:");
                int year = scanner.nextInt();
                data.getListCustom().get(option-1).setYear(year);
                System.out.println("Se actualisocon exito.");
                break;
            case 7:
                scanner.reset();
                System.out.println("Ingrese el nuevo precio:");
                double price = Double.parseDouble(scanner.next());
                data.getListCustom().get(option-1).setPrice(price);
                System.out.println("Se actualisocon exito.");
                break;
            case 8:
                scanner.reset();
                System.out.println("Ingrese el nuevo interior:");
                String inside = scanner.next();
                data.getListCustom().get(option-1).setInside(inside);
                System.out.println("Se actualisocon exito.");
                break;
            case 9:
                scanner.reset();
                System.out.println("Ingrese el nuevo exterior:");
                String outside = scanner.next();
                data.getListCustom().get(option-1).setOutside(outside);
                System.out.println("Se actualisocon exito.");
                break;
              
        }
    }//end edit custom
    
    
    
    //-----------add
    
    /**
     * Agrega un nuevo objeto a la lista de vendedorea
     */
    private void addSeller(){
        scanner.reset();
        System.out.println("--------AGREGAR VENDEDOR");
        System.out.println("1.Identificacion :");
        int id = scanner.nextInt();
        scanner.reset();
        
        System.out.println("2.Nombre :");
        String name = scanner.next();
        scanner.reset();
        
        System.out.println("3.Apellido :");
        String lastName = scanner.next();
        scanner.reset();
        
        System.out.println("4.telefono");
        String phone = scanner.next();
        scanner.reset();
        
        Seller n = new Seller(id, name, lastName, phone, 0.0);        
        data.getListSeller().add(n);
        
        System.out.println("Fue agregado con exito.");
        
    }//end add seller
    
    /**
     * Agrega un nuevo objeto a la lista de clientes
     */
    private void addClient(){
        scanner.reset();
        System.out.println("--------AGREGAR CLIENTE");
        System.out.println("1.Identificacion :");
        int id = scanner.nextInt();
        scanner.reset();
        
        System.out.println("2.Nombre :");
        String name = scanner.next();
        scanner.reset();
        
        System.out.println("3.Apellido :");
        String lastName = scanner.next();
        scanner.reset();
        
        System.out.println("4.telefono :");
        String phone = scanner.next();
        
        Client c = new Client(id, name, lastName, phone);
        data.getListClint().add(c);
        
        System.out.println("Fue agregado con exito.");
        
    }//end add cliente
    
    /**
     * Agrega un nuevo objeto a la lista de Deportivos
     */
    private void addSports(){
        scanner.reset();
        System.out.println("-------AGREGAR DEPORTIVO");
        System.out.println("1.Referencia :");
        String reference = scanner.next();
        scanner.reset();
        
        System.out.println("2.Marca :");
        String brand = scanner.next();
        scanner.reset();
        
        System.out.println("3.Modelo :");
        String model = scanner.next();
        scanner.reset();
        
        System.out.println("4.Color :");
        String color = scanner.next();
        scanner.reset();
        
        System.out.println("5.Estado :");
        String state = scanner.next();
        scanner.reset();
        
        System.out.println("6.Kilometraje");
        int mileage = scanner.nextInt();
        scanner.reset();
        
        System.out.println("7.Año :");
        int year = scanner.nextInt();
        scanner.reset();
        
        System.out.println("8.Precio :");
        double price = Double.parseDouble(scanner.next());
        scanner.reset();
        
        System.out.println("9.Caballos de fuerz :");
        int horsePower = scanner.nextInt();
        
        SportsCar sc = new SportsCar(reference, brand, model, color, state, mileage, year, price, horsePower);        
        data.getListSports().add(sc);
        
        System.out.println("Fue agregado con exito.");
        
    }//end add sports
    
    /**
     * Agrega un nuevo objeto a la lista de Estandar
     */
    private void addStandard(){
        scanner.reset();
        System.out.println("-------AGREGAR ESTANDAR");
        System.out.println("1.Referencia :");
        String reference = scanner.next();
        scanner.reset();
        
        System.out.println("2.Marca :");
        String brand = scanner.next();
        scanner.reset();
        
        System.out.println("3.Modelo :");
        String model = scanner.next();
        scanner.reset();
        
        System.out.println("4.Color :");
        String color = scanner.next();
        scanner.reset();
        
        System.out.println("5.Estado :");
        String state = scanner.next();
        scanner.reset();
        
        System.out.println("6.Kilometraje");
        int mileage = scanner.nextInt();
        scanner.reset();
        
        System.out.println("7.Año :");
        int year = scanner.nextInt();
        scanner.reset();
        
        System.out.println("8.Precio :");
        double price = Double.parseDouble(scanner.next());
        
        StandardCar sta = new StandardCar(reference, brand, model, color, state, mileage, year, price);        
        data.getListStandar().add(sta);
        
        System.out.println("Fue agregado con exito.");
        
    }//end add standard
    
    /**
     * Agrega un nuevo objeto a la lista de maquinaria
     */
    private void addMachinery(){
        scanner.reset();
        System.out.println("-------AGREGAR MAQUINARIA");
        System.out.println("1.Referencia :");
        String reference = scanner.next();
        scanner.reset();
        
        System.out.println("2.Marca :");
        String brand = scanner.next();
        scanner.reset();
        
        System.out.println("3.Modelo :");
        String model = scanner.next();
        scanner.reset();
        
        System.out.println("4.Color :");
        String color = scanner.next();
        scanner.reset();
        
        System.out.println("5.Estado :");
        String state = scanner.next();
        scanner.reset();
        
        System.out.println("6.Kilometraje");
        int mileage = scanner.nextInt();
        scanner.reset();
        
        System.out.println("7.Año :");
        int year = scanner.nextInt();
        scanner.reset();
        
        System.out.println("8.Precio :");
        double price = Double.parseDouble(scanner.next());
        scanner.reset();
        
        System.out.println("9.Sub-Tipo :");
        String subType = scanner.next();
        
        MachineryCar mc = new MachineryCar(reference, brand, model, color, state, mileage, year, price, subType);
        data.getListMachinery().add(mc);
        
        System.out.println("Fue agregado con exito.");
        
    }//end add Machinery
    
    /**
     * Agrega un nuevo objeto a la lista de personalizados
     */
    private void addCustom(){
        scanner.reset();
        System.out.println("-------AGREGAR PERZONALIZADO");
        System.out.println("1.Referencia :");
        String reference = scanner.next();
        scanner.reset();
        
        System.out.println("2.Marca :");
        String brand = scanner.next();
        scanner.reset();
        
        System.out.println("3.Modelo :");
        String model = scanner.next();
        scanner.reset();
        
        System.out.println("4.Color :");
        String color = scanner.next();
        scanner.reset();
        
        System.out.println("5.Estado :");
        String state = scanner.next();
        scanner.reset();
        
        System.out.println("6.Kilometraje");
        int mileage = scanner.nextInt();
        
        System.out.println("7.Año :");
        int year = scanner.nextInt();
        scanner.reset();
        
        System.out.println("8.Precio :");
        double price = Double.parseDouble(scanner.next());
        scanner.reset();
        
        System.out.println("9.Interior :");
        String inside = scanner.next();
        scanner.reset();
        
        System.out.println("10.Exterior :");
        String outside = scanner.next();
        
        CustomCart cc = new CustomCart(reference, brand, model, color, state, mileage, year, price, inside, outside);
        data.getListCustom().add(cc);
        
        System.out.println("Fue agregado con exito.");
        
    }//end add custom
    
    
    //-----------delete
    
    /**
     * este metodo elimina un vendedor en especifico
     */
    private void deleteSeller(){
        int option;
        System.out.println("------ELIMINAR VENDEDOR");
        int i = 1;
        System.out.println(" #    id    nombre    apellido    telefono   bonificacion");
        for (Seller sel : data.getListSeller()) {
            System.out.println(i+".  *"+ sel.getId()+"  *"+sel.getName()+"  *"+sel.getLastName()+"  *"+sel.getPhone()+"  *"+sel.getBonus());
            i=i+1;
        }
        System.out.println("Seleccione el elemento a eliminar:");
        option = scanner.nextInt();
        
        data.getListSeller().remove(option);
        
    }//end delete seller
    
    /**
     * este metodo elimina un cliente en especifico
     */
    private void deleteClient(){
        int option;
        System.out.println("------ELIMINAR CLIENTE");
        int i = 1;
        System.out.println(" #    id    nombre    apellido    telefono ");
        for (Client cli : data.getListClint()) {
            System.out.println(i+".  *"+ cli.getId()+"  *"+cli.getName()+"  *"+cli.getLastName()+"  *"+cli.getPhone());
            i=i+1;
        }
        System.out.println("Seleccione el elemento a eliminar:");
        option = scanner.nextInt();
        
        data.getListClint().remove(option);
    }//end delete client
    
    /**
     * este metodo elimina un carro deportivo en especifico
     */
    private void deleteSports(){
        int option;
        System.out.println("-----ELIMINAR CARROS DEPORTIVOS");
        int i = 1;
        System.out.println("#  Referencia    Marca    Modelo    Color    Estado    Kilometros    Año    Precio    Caballos de fuerza");
        for (SportsCar spo : data.getListSports()) {
            System.out.println(i+".  *" + spo.getReference()+ "    *" + spo.getBrand() + "     *" +spo.getModel() + "    *" +
                    spo.getColor() + "    *" + spo.getState() + "    *" + spo.getMileage()+ "    *" +spo.getYear() + "    *" +spo.getPrice() 
                    +"    *" +spo.getHorsePower());
        }
        System.out.println("Seleccione el elemento a eliminar:");
        option = scanner.nextInt();
        
        data.getListSports().remove(option);
    }//end delete Sports
    
    /**
     * este metodo elimina un carro estandar en especifico
     */
    private void deleteStandard(){
        int option;
        System.out.println("-----ELIMINAR CARROS ESTANDAR");
        int i = 1;
        System.out.println("#  Referencia    Marca    Modelo    Color    Estado    Kilometros    Año    Precio   ");
        for (StandardCar sta : data.getListStandar()) {
            System.out.println(i+".  *" + sta.getReference()+ "    *" + sta.getBrand() + "     *" +sta.getModel() + "    *" +
                    sta.getColor() + "    *" + sta.getState() + "    *" + sta.getMileage()+ "    *" +sta.getYear() + "    *" +sta.getPrice() );
        }
        
        System.out.println("Seleccione el elemento a eliminar:");
        option = scanner.nextInt();
        
        data.getListStandar().remove(option);
    }//end delete standard
    
    /**
     * este metodo elimina una maquina en especifico
     */
    private void deleteMachinery(){
        int option;
        System.out.println("-----ELIMINAR MAQUINARIA");
        int i = 1;
        System.out.println("#  Referencia    Marca    Modelo    Color    Estado    Kilometros    Año    Precio    Sub-tipo");
        for (MachineryCar mac : data.getListMachinery()) {
            System.out.println(i+".  *" + mac.getReference()+ "    *" + mac.getBrand() + "     *" +mac.getModel() + "    *" +
                    mac.getColor() + "    *" + mac.getState() + "    *" + mac.getMileage()+ "    *" +mac.getYear() + "    *" 
                    +mac.getPrice() +"    *"+mac.getSubType());
        }
        
        System.out.println("Seleccione el elemento a eliminar:");
        option = scanner.nextInt();
        
        data.getListMachinery().remove(option);
        
    }//end delete machinery
    
    /**
     * este metodo elimina un carro personalizado en especifico
     */
    private void deleteCustom(){
        int option;
        System.out.println("-----ELIMINAR CARROS PERSONALIZADOS");
        int i = 1;
        System.out.println("#  Referencia    Marca    Modelo    Color    Estado    Kilometros    Año    Precio    Interior    Exterior");
        for (CustomCart cus : data.getListCustom()) {
            System.out.println(i+".  *" + cus.getReference()+ "    *" + cus.getBrand() + "     *" +cus.getModel() + "    *" +
                    cus.getColor() + "    *" + cus.getState() + "    *" + cus.getMileage()+ "    *" +cus.getYear() + "    *" 
                    +cus.getPrice() + "    *"+cus.getInside() + "    *" + cus.getOutside());
        }
        System.out.println("Seleccione el elemento a eliminar:");
        option = scanner.nextInt();
        
        data.getListCustom().remove(option);
    }//end delete custom
    
    
}
