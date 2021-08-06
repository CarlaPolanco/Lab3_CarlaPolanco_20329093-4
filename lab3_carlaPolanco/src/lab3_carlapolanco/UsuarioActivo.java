/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_carlapolanco;

/**
 *
 * @author carla
 */
public class UsuarioActivo {
    private String nombre;
    private String contrasena;
    
    public UsuarioActivo(String nombre, String contrasena){
        this.nombre = nombre;
        this.contrasena = contrasena;
    }
    public String getNombreUA(){
        return(this.nombre);
    }
    public String getContrasenaUA(){
        return(this.contrasena);
    }
}
