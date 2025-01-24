package edu.michel.garcia.actividades.actividad2.ui;

import edu.michel.garcia.actividades.actividad2.process.NameValidator;
import edu.michel.garcia.actividades.actividad2.process.NumberGenerator;

import java.util.Scanner;


public class CLI {

    public static void showMenu(){
        System.out.println("Menu");
        System.out.println("1. Validador de nombres");
    }

    public static void runApp(){
        showMenu();
        Scanner Scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();scanner.nextLine();
        while(opcion!= 3){
        switch(opcion) {
            case 1:
                System.out.println("Introduce un nombre: ");
                String name = scanner.nextLine();
                if(NameValidator.validateName(name)){
                   System.out.println("El nombre existe en la Base de Datos");
                }else{

               System.out.println("El nombre no existe en la Base de Datos");  
                }
                break;
            default:
        }      
        showMenu();
        opcion = scanner.nextInt();scanner.nextLine();
       }
    
    }

}