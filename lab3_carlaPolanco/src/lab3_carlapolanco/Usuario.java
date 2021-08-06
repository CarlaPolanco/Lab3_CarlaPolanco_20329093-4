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
public class Usuario {
    private int id;
    private String nombre;
    private String contrasena;
    private List<String> publicaciones;
    private List<String> seguidores;
    private List<String> PCcompartidas;
    
    public Usuario(int id, String nombre,String contrasena, List publicaciones, List seguidores,List PCcompartidas){
        this.id = id;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.publicaciones = publicaciones;
        this.seguidores = seguidores;
        this.PCcompartidas = PCcompartidas;
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
