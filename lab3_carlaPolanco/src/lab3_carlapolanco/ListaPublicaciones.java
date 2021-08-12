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
public class ListaPublicaciones {
    private ArrayList <Publicaciones> listaPublicaciones;
    
    public ListaPublicaciones(){
        this.listaPublicaciones = new ArrayList();
    }
    public int tamanioLista(){
        return(this.listaPublicaciones.size());
    }
    
    public void agregarPublicacion(Publicaciones newPublicacion){
        this.listaPublicaciones.add(newPublicacion);
    }
    
    public Publicaciones datosPublicacion(int id){
        Publicaciones post;
        int i = this.listaPublicaciones.size();
        int j;
        for(j=0 ; j<i; j++){
            post = this.listaPublicaciones.get(j);
            if(post.getIDP() == id){
                return(post);
            } 
        }
        return (null); 
    }
    
    public void editarPublicacionesCompartidas(Usuario user, Publicaciones postE){
        Publicaciones post;
        int i = this.listaPublicaciones.size();
        int j;
        for(j=0 ; j<i; j++){
            post = this.listaPublicaciones.get(j);
            if(post.getIDP() == postE.getIDP()){
                post.getUsuarioCompartidoP().agregarUsuario(user);
            } 
        }
    }
    
    public String setListaPublicacionesString(){
        Publicaciones Publicacion;
        String listaString = " PUBLICACIONES DEL USUARIO: ";
        int i = this.listaPublicaciones.size();
        for(int k = 0; k < i; k++){
            Publicacion = this.listaPublicaciones.get(k);
            listaString = listaString + Publicacion.PublicacionestoString();
        }
        return (listaString);
    }
    
    public String setListaPublicacionesStringRedSocial(){
        Publicaciones Publicacion;
        String listaString = "------------------------------- PUBLICACIONES ------------------------------------ \n";
        int i = this.listaPublicaciones.size();
        for(int k = 0; k < i; k++){
            Publicacion = this.listaPublicaciones.get(k);
            listaString = listaString + Publicacion.PublicacionestoString();
        }
        return (listaString);
    }
    
    
    public String setListaPublicacionesStringCompartidas(){
        Publicaciones Publicacion;
        String listaString = " PUBLICACIONES COMPARTIDAS CONMIGO: ";
        int i = this.listaPublicaciones.size();
        for(int k = 0; k < i; k++){
            Publicacion = this.listaPublicaciones.get(k);
            listaString = listaString + Publicacion.PublicacionestoString();
        }
        return (listaString);
    }
    
}
