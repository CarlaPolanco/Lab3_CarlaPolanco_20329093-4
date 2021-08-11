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
    
    public String setListaPublicacionesString(){
        Publicaciones Publicacion;
        String listaString = "\n            ---------- Publicaciones Usuario ----------\n \n";
        int i = this.listaPublicaciones.size();
        for(int k = 0; k < i; k++){
            Publicacion = this.listaPublicaciones.get(k);
            listaString = listaString + Publicacion.PublicacionestoString();
        }
        return (listaString);
    }
    
    
    public String setListaPublicacionesStringCompartidas(){
        Publicaciones Publicacion;
        String listaString = "\n            --------- Publicaciones Compartidas Conmigo ----------\n \n";
        int i = this.listaPublicaciones.size();
        for(int k = 0; k < i; k++){
            Publicacion = this.listaPublicaciones.get(k);
            listaString = listaString + Publicacion.PublicacionestoString();
        }
        return (listaString);
    }
    
}
