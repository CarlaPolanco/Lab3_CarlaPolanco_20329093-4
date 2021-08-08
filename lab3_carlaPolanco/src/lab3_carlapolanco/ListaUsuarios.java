/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_carlapolanco;

import java.util.ArrayList;

/**
 *
 * @author carla
 */
public class ListaUsuarios {
    
    private ArrayList <Usuario> listaUsuarios;
    
    public ListaUsuarios(){
        this.listaUsuarios = new ArrayList <Usuario>();
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
}
