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
public class Publicaciones {
    private int id;
    private String autor;
    private String contenido;
    private String tipoP;
    private List<String> fechaP;
    private List<String> usuarioCompartido;
    
    public Publicaciones(int id, String autor,String contenido, String tipoP, List fechaP,List usuarioCompartido){
        this.id = id;
        this.autor = autor;
        this.contenido = contenido;
        this.tipoP = tipoP;
        this.fechaP = fechaP;
        this.usuarioCompartido = usuarioCompartido;
    }
    
    public int getID(){
        return(this.id);
    }
    public String getAutor(){
        return(this.autor);
    }
    public String getContenido(){
        return(this.contenido);
    }
    public String getTipoP(){
        return(this.tipoP);
    }
    public List getFecha(){
        return(this.fechaP);
    }
    public List getUsuarioCompartido(){
        return(this.usuarioCompartido);
    }
}
