/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_carlapolanco;

import java.util.Scanner;

/**
 *
 * @author carla
 */
public class Lab3_carlaPolanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Scanner teclado=new Scanner(System.in); 
        int opcion;
        int opcion2=0;
        int respuesta;
        
        while(opcion2==0){
            System.out.println(" *********** BIENVENIDO ************");
            System.out.println("    ¿Que desea hacer?");
            System.out.println("   1. Inicial sesion.");
            System.out.println("   2. Registrarse.");
            respuesta=Integer.parseInt(teclado.next());
            
            if (respuesta == 1){
                System.out.println("\n-----------------------");
                System.out.println(" Eligio iniciar sesion");
                System.out.println("-----------------------\n");
                opcion2=1;
            }
            if(respuesta == 2){
                System.out.println("\n-----------------------");
                System.out.println("   Eligio Registrarse");
                System.out.println("-----------------------\n");
                opcion2=1;
            }
            else{
                System.out.println("Eleccion incorrecta.Vuelva a elegir una opcion: ");
            }
        }
        
        System.out.println(" ### RED SOCIAL: FailBook ###");
        System.out.println(" ## Registrado como: User123 ##");
        do{
            System.out.println("Escoja su opcion:");
            System.out.println("   1. Realizar una publicacion.");
            System.out.println("   2. Seguir a un usuario.");
            System.out.println("   3. Compartir una publicacion.");
            System.out.println("   4. Visualizar red social.");
            System.out.println("   5. Cerrar sesion.");
            System.out.println("   6. Salir del programa.");
            System.out.println("Introduzca su opcion:");
            opcion=Integer.parseInt(teclado.next());
            
            switch (opcion){
                case 1:
                    System.out.println("Primera opcion");
                    break;
                case 2:
                    System.out.println("Opcion 2");
                    break;
                case 3:
                    System.out.println("Opcion 3");
                    break;
                case 4:
                    System.out.println("Opcion 4");
                    break;
                case 5:
                    System.out.println("Opcion 5");
                    break;
            }
        }while(opcion!=6);   
    }
    
}
