/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_carlapolanco;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carla
 */
public class Usuario {
    private int id;
    private String nombre;
    private String contrasena;
    private SimpleDateFormat fecha;
    private List<String> publicaciones;
    private List<String> seguidores;
    private List<String> PCcompartidas;
    
    public Usuario(int id, String nombre,String contrasena){
        this.id = id;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.fecha = new SimpleDateFormat("dd/MM/yyyy");
        this.publicaciones = new ArrayList<>();
        this.seguidores = new ArrayList<>();
        this.PCcompartidas = new ArrayList<>();
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
    public List getPublicaciones(){
        return(this.publicaciones);
    }
    public List getSeguidores(){
        return(this.seguidores);
    }
    public List getPCcompartidas(){
        return(this.PCcompartidas);
    }
    
}
