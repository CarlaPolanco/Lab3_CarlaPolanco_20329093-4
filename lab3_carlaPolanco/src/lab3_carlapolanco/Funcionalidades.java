/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_carlapolanco;

import java.util.List;

/**
 *
 * @author carla
 */
public class Funcionalidades {
    private redSocial socialRed;
    
    public Funcionalidades(){
        this.socialRed = new redSocial();
    }
    
    public redSocial getredSocial(){
        return(this.socialRed);
    }
    
    /*
     * Crea el usuario para registarlo 
     */
    public void register(String username,String pass){
        Usuario userN;
        int tamanio;
        tamanio = socialRed.getTamanioUsuarios();
        userN = new Usuario(tamanio+1,username,pass);
        socialRed.registar(userN);
    }
    
    public void login(String username, String pass){
        if(socialRed.getListaUsuarioActivo()==null){
            socialRed.iniciarsesion(username, pass);
        }
    }
    
    public void logout(String nombre, String Contra){
        if(socialRed.getListaUsuarioActivo()!= null){
            if(socialRed.getListaUsuarioActivo().getContrasena().equals(Contra) && socialRed.getListaUsuarioActivo().getNombre().equals(nombre)){
                socialRed.exit();
                System.out.println("----------------------------------");
                System.out.println("  Sesion Cerrada Correctamente");
                System.out.println("----------------------------------");
            }
            else{
                System.out.println("--------------------------------------------");
                System.out.println("  Datos ingresados erroneos para la salida");
                System.out.println("--------------------------------------------");
            }
        }
        else{
            System.out.println("--------------------------------------------");
            System.out.println("  No existe usuario con sesion iniciada");
            System.out.println("--------------------------------------------");
        }
    }
    
    public void post(String tipoP, String Contenido){
        if(socialRed.getListaUsuarioActivo()!= null){
            Publicaciones post;
            int tamaño = socialRed.getListaPublicaciones().tamanioLista();
            post = new Publicaciones(tamaño+1,socialRed.getListaUsuarioActivo().getNombre(),Contenido,tipoP);
            socialRed.getListaPublicaciones().agregarPublicacion(post);
            socialRed.getListaUsuarios().anadirPublicacionAutor(post, socialRed.getListaUsuarioActivo().getNombre());
            
        }
        else{
            System.out.println("--------------------------------------------");
            System.out.println("  No existe usuario con sesion iniciada");
            System.out.println("--------------------------------------------");
        }
    }
    
    public void post(String tipoP, String Contenido, List Dirigidos){
        if(socialRed.getListaUsuarioActivo()!= null){
            Publicaciones post;
            int tamaño = socialRed.getListaPublicaciones().tamanioLista();
            post = new Publicaciones(tamaño+1,socialRed.getListaUsuarioActivo().getNombre(),Contenido,tipoP);
            socialRed.getListaPublicaciones().agregarPublicacion(post);
            socialRed.getListaUsuarios().anadirPublicacionAutor(post, socialRed.getListaUsuarioActivo().getNombre());
            socialRed.getListaUsuarios().anadirPublicacionesCompartidas(Dirigidos, tamaño+1);
        }
        else{
            System.out.println("--------------------------------------------");
            System.out.println("  No existe usuario con sesion iniciada");
            System.out.println("--------------------------------------------");
        }
    }
}
