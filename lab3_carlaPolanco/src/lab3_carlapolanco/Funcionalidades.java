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
public class Funcionalidades {
    private redSocial socialRed;
    
    public Funcionalidades(){
        this.socialRed = new redSocial();
    }
    
    public redSocial getredSocial(){
        return(this.socialRed);
    }
    
    /**
     * 
     * @param nombre pertenece al nombre del usuario
     * @param contra pertenece la contrasena del usuario 
     * Crea el usuario para registarlo 
     */
    public void register(String username,String pass){
        Usuario userN;
        int tamanio;
        tamanio = socialRed.getTamanioUsuarios();
        userN = new Usuario(tamanio+1,username,pass);
        socialRed.registar(userN);
    }
}
