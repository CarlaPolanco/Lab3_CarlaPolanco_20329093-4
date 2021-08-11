/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_carlapolanco;

import java.util.ArrayList;
import java.util.List;
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
        
        Funcionalidades failbook = new Funcionalidades();
        failbook.getredSocial().redSocial();
        
        Scanner teclado=new Scanner(System.in); 
        int opcion;
        int opcion2=0;
        int respuesta;
        
        while(opcion2==0){
            System.out.println(" *********** BIENVENIDO ************");
            System.out.println("    ¿Que desea hacer?");    
            System.out.println("   1. Inicial sesion.");
            System.out.println("   2. Registrarse.");
            System.out.println("   3. Visualizar red social");
            respuesta=Integer.parseInt(teclado.next());
            
            if (respuesta == 1){
                System.out.println("\n-----------------------");
                System.out.println(" Eligio iniciar sesion");
                System.out.println("-----------------------\n");
                
                int k = 0;
                while(k !=1){
                    System.out.println("Ingrese el nombre se usuario");
                    Scanner nom = new Scanner(System.in);
                    String nombre = nom.nextLine();
                
                    System.out.println("Ingrese la contraseña: ");
                    Scanner con = new Scanner(System.in);
                    String contraseña = con.nextLine();
                    
                    if(failbook.getredSocial().verificarUsuariologin(nombre, contraseña)==1){
                        
                        failbook.login(nombre, contraseña);
                        k=1;
                        System.out.println("**********************************");
                        System.out.println("  Sesion iniciada correctamente");
                        System.out.println("**********************************");
                        
                    }
                    else{
                        System.out.println("Datos incorrectos,vuelva a escribirlos");
                    }
                }
                
                
                
                opcion2=1;
            }
            else if(respuesta == 2){
                System.out.println("\n-----------------------");
                System.out.println("   Eligio Registrarse");
                System.out.println("-----------------------\n");
                
                int i = 0;
                while(i!= 1){
                    System.out.println("Ingrese el nombre se usuario");
                    Scanner nom = new Scanner(System.in);
                    String nombre = nom.nextLine();
                
                    System.out.println("Ingrese la contraseña: ");
                    Scanner con = new Scanner(System.in);
                    String contraseña = con.nextLine();
                    
                    if(failbook.getredSocial().verificarUsuario(nombre)==1){
                        System.out.println("Usuario ya exisente, eliga un nuevo nombre");
                    }
                    else{
                        failbook.register(nombre, contraseña);
                        System.out.println("********************************");
                        System.out.println(" Usuario registado con exito!");
                        System.out.println("********************************");
                        i=1;
                    }
                }
                opcion2=1;
            }
            
            else if(respuesta == 3){
                String string,string2;
                string = failbook.getredSocial().ToStringRedSocialUsuarios();
                string2 = failbook.getredSocial().ToStringRedSocialPublicaciones();
                System.out.println("----------- Bienvenidos a  " + failbook.getredSocial().getNombreRsocial()+ "---------");
                System.out.println(string);
                System.out.println(string2);
            }
            
            else{
                System.out.println("Eleccion incorrecta.Vuelva a elegir una opcion: ");
            }
        }
        
        System.out.println(" ### RED SOCIAL: " + failbook.getredSocial().getNombreRsocial());
        System.out.println(" ## Registrado como: " + failbook.getredSocial().getListaUsuarioActivo().getNombre() );
        
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
                    List<String> Dirigidos = new ArrayList<String>();
                    int m=0;
                    int cantidadU;
                    
                    
                    System.out.println("Ingrese el tipo de publicacion:");
                    Scanner ti = new Scanner(System.in);
                    String tipoP = ti.nextLine();
                    System.out.println("Ingrese el contenido:");
                    Scanner con = new Scanner(System.in);
                    String contenido = con.nextLine(); 
                    
                    System.out.println("Ingrese la cantidad de personas que va dirigida la publicacion");
                    cantidadU=Integer.parseInt(teclado.next());
                    
                    if(cantidadU == 0){
                        failbook.post(tipoP, contenido);
                        
                        System.out.println("-------------------------------------");
                        System.out.println("  Publicacion realizada con exito");
                        System.out.println("-------------------------------------");
                    }
                    else{
                        // no puedo poner mi mismo nombre.
                        Scanner use = new Scanner(System.in);
                        while(m < cantidadU){
                            System.out.println("Ingrese el nombre del usuario");
                            String usuario = use.nextLine(); 
                            if(failbook.getredSocial().getListaUsuarios().existeUsuario(usuario) == 1){
                                System.out.println(" ACTIVO " + failbook.getredSocial().getListaUsuarioActivo().getNombre() + " INGRESADO: " + usuario);
                                if(failbook.getredSocial().getListaUsuarioActivo().getNombre() == usuario){
                                    System.out.println("--------------------------------------------------------");
                                    System.out.println("    No puede ingresar su mismo nombre de usuario.");
                                    System.out.println("--------------------------------------------------------");
                                    
                                }
                                else{
                                    Dirigidos.add(usuario);
                                    m=m+1;
                                    
                                }
                                
                            }
                            else{
                                System.out.println("--------------------------------------------------------");
                                System.out.println("  No existe usuario con ese nombre, intente otra vez");
                                System.out.println("--------------------------------------------------------");
                            } 
                        }
                        failbook.post(tipoP, contenido, Dirigidos);
                        System.out.println("-------------------------------------");
                        System.out.println("  Publicacion realizada con exito");
                        System.out.println("-------------------------------------");
                        
                    }
                    break;
                    
                case 2:
                    System.out.println("Opcion 2");
                    break;
                case 3:
                    System.out.println("Opcion 3");
                    break;
                case 4:
                    String string,string2;
                    string = failbook.getredSocial().ToStringRedSocialUsuarios();
                    string2 = failbook.getredSocial().ToStringRedSocialPublicaciones();
                    System.out.println("----------- Bienvenidos a  " + failbook.getredSocial().getNombreRsocial()+ "---------");
                    System.out.println(string);
                    System.out.println(string2);
                    break;
                case 5:
                    System.out.println("Ingrese nombre de usuario:");
                    Scanner nom = new Scanner(System.in);
                    String nombre = nom.nextLine();
                    System.out.println("Ingrese contrasena:");
                    Scanner cont = new Scanner(System.in);
                    String contraseña = cont.nextLine(); 
                    if ((failbook.getredSocial().getListaUsuarioActivo().getNombre().equals(nombre)) && failbook.getredSocial().getListaUsuarioActivo().getContrasena().equals(contraseña)){
                        failbook.logout(nombre, contraseña);
                        opcion=6;
                        
                    }
                    else{
                        System.out.println("Datos Erroneos");
                    }
                    break;
            }
        }while(opcion!=6);   
    }
    
}
