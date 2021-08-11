/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_carlapolanco;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author carla
 */
public class Usuario {
    private int id;
    private String nombre;
    private String contrasena;
    private Date fecha;
    private ListaPublicaciones publicaciones;
    private ListaUsuarios seguidores;
    private ListaPublicaciones PCcompartidas;
    
    
    public Usuario(int id, String nombre,String contrasena){
        this.id = id;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.fecha = new Date();
        this.publicaciones = new ListaPublicaciones();
        this.seguidores = new ListaUsuarios();
        this.PCcompartidas = new ListaPublicaciones();
    }
    public int getID(){
        return(this.id);
    }
    public String getNombre(){
        return(this.nombre);
    }
    public String getContrasena(){
        return(this.contrasena);
    }
    public ListaPublicaciones getPublicaciones(){
        return(this.publicaciones);
    }
    public ListaUsuarios getSeguidores(){
        return(this.seguidores);
    }
    
    public ListaPublicaciones getPCcompartidas(){
        return(this.PCcompartidas);
    }

    public Date getFecha() {
        return fecha;
    }

    public String setUsuarioString(){
        return "ID: " + id + " FECHA: " + fecha +  " NOMBRE: " + nombre + " CONTRASEÑA: " + contrasena  + this.publicaciones.setListaPublicacionesString() + this.seguidores.setListaUsuariosStringSeguidores()+ this.PCcompartidas.setListaPublicacionesStringCompartidas()+ '\n';
    }
    
    
    
    
    
    
    
    
}
