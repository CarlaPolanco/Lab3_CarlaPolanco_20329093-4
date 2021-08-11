/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_carlapolanco;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carla
 */
public class ListaUsuarios {
    
    private ArrayList <Usuario> listaUsuarios;
    
    public ListaUsuarios(){
        this.listaUsuarios = new ArrayList ();
    }
    
    public void agregarUsuario(Usuario newUsuario){
        this.listaUsuarios.add(newUsuario);
    }
    public int tamanioLista(){
        return(this.listaUsuarios.size());
    }
    public Usuario datosUsuario(String username, String pass){
        Usuario user;
        int i = this.listaUsuarios.size();
        int j;
        for(j=0 ; j<i; j++){
            user = this.listaUsuarios.get(j);
            if(user.getNombre().equals(username) && user.getContrasena().equals(pass)){
                return(user);
            } 
        }
        return (null); 
    }
    public int existeUsuarioLogin(String Nombre, String Contrasena){
        Usuario user;
        int i = this.listaUsuarios.size();
        int j;
        for(j=0 ; j<i; j++){
            user = this.listaUsuarios.get(j);
            if(user.getNombre().equals(Nombre) && user.getContrasena().equals(Contrasena)){
                return(1);
            } 
        }
        return (0);
    }
    public int existeUsuario(String Nombre){
        Usuario user;
        int i = this.listaUsuarios.size();
        int j;
        for(j=0; j<i ; j++){
            user = this.listaUsuarios.get(j);
            if(user.getNombre().equals(Nombre)){
                return (1);
            }
        }
        return (0);           
    }
    
    public void anadirPublicacionesCompartidas(List Dirigidos,Publicaciones Post){
       int i = this.listaUsuarios.size();
       int j = Dirigidos.size();
       int k,l;
       Usuario user;
       for(k=0;k<j;k++){
           for(l=0;l<i;l++){
               user = this.listaUsuarios.get(l);
               if(Dirigidos.get(k).equals(user.getNombre())){
                   user.getPCcompartidas().agregarPublicacion(Post);
               }
           }
       }
    }
    
    public void anadirPublicacionAutor(Publicaciones post,String name){
        Usuario user;
        int i = this.listaUsuarios.size();
        int j;
        for(j=0; j<i ; j++){
            user = this.listaUsuarios.get(j);
            if(user.getNombre().equals(name)){
                user.getPublicaciones().agregarPublicacion(post);
            }
        }
    }
    
    
    
    public String setListaUsuariosString(){
        Usuario User;
        String listaString = "\n--------------------------------------- Usuarios Registrados ----------------------------------- \n\n";
        int i = this.listaUsuarios.size();
        for(int k = 0; k < i; k++){
            User = this.listaUsuarios.get(k);
            listaString = listaString + User.setUsuarioString();
        }
        return (listaString);
    }
    
    public String setListaUsuariosStringSeguidores(){
        Usuario User;
        String listaString = "\n                     ---------- Seguidores ----------\n \n";
        int i = this.listaUsuarios.size();
        for(int k = 0; k < i; k++){
            User = this.listaUsuarios.get(k);
            listaString = listaString + User.setUsuarioString();
        }
        return (listaString);
    }
    
}
