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
        this.listaPublicaciones = new ArrayList <Publicaciones>();
    }
    public void agregarPublicacion(Publicaciones newPublicacion){
        this.listaPublicaciones.add(newPublicacion);
    }
}
