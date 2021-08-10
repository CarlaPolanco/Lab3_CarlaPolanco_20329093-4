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
public class Publicaciones {
    private int id;
    private String autor;
    private String contenido;
    private String tipoP;
    private Date fechaP;
    private List<String> usuarioCompartido;
    private List<String> reacciones;
    
    public Publicaciones(int id, String autor,String contenido, String tipoP){
        this.id = id;
        this.autor = autor;
        this.contenido = contenido;
        this.tipoP = tipoP;
        this.fechaP =  new Date();
        this.usuarioCompartido = new ArrayList<>();
        this.reacciones = new ArrayList<>();
    }
    
    public int getIDP(){
        return(this.id);
    }
    public String getAutorP(){
        return(this.autor);
    }
    public String getContenidoP(){
        return(this.contenido);
    }
    public String getTipoP(){
        return(this.tipoP);
    }
    public Date getFechaP(){
        return(this.fechaP);
    }
    public List getUsuarioCompartidoP(){
        return(this.usuarioCompartido);
    }
    public List getReaccionesP(){
        return(this.reacciones);
    }

    public String PublicacionestoString() {
        return "ID: " + id + " AUTOR: " + autor + " CONTENIDO: " + contenido + " TIPO: " + tipoP + " FECHA: " + fechaP + " COMPARTIDO" + usuarioCompartido + " REACCIONES: " + reacciones + '\n';
    }
    
    
}
