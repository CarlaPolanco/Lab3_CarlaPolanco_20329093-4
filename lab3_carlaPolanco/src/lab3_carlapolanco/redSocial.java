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
public class redSocial {
    private String NombreRsocial;
    private Usuario listaUsuarioActivo;
    private ListaUsuarios listaUsuarios;
    private ListaPublicaciones listaPublicaciones;
    
    public redSocial(){
        this.NombreRsocial = "Failbook";
        this.listaUsuarioActivo = null;
        this.listaUsuarios = new ListaUsuarios();
        this.listaPublicaciones = new ListaPublicaciones();
    }
    
    public String getNombreRS(){
        return (this.NombreRsocial);
    }
    public List getListaUsuarioActivo(){
        return(List) (this.listaUsuarioActivo);
    }
    public List getListaUsuario(){
        return(List) (this.listaUsuarios);
    }
    public List getListaPublicacionesS(){
        return(List) (this.listaPublicaciones);
    }
    public int getTamanioUsuarios(){
        return(this.listaUsuarios.tamanioLista());
    }
    public void registar(Usuario userN){
        this.listaUsuarios.agregarUsuario(userN);
    }
    public int verificarUsuario(String name){
        if(this.listaUsuarios.existeUsuario(name)==1){
            return(1);
        }
        else{
            return(0);
        }
    }
    
    public int verificarUsuariologin(String username, String pass){
        if(this.listaUsuarios.existeUsuarioLogin(username, pass) == 1){
            return(1);
        }
        else{
            return(0);
        }
    }
    
    public void iniciarsesion(String username,String pass){
        this.listaUsuarioActivo =  this.listaUsuarios.datosUsuario(username, pass); 
    }
    
    public void redSocial(){
        
        Usuario user1 = new Usuario(1,"user1","pass1");
        this.listaUsuarios.agregarUsuario(user1);
        Usuario user2 = new Usuario(1,"user2","pass2");
        this.listaUsuarios.agregarUsuario(user2);
        Usuario user3 = new Usuario(1,"user3","pass3");
        this.listaUsuarios.agregarUsuario(user3);
        Usuario user4 = new Usuario(1,"user4","pass4");
        this.listaUsuarios.agregarUsuario(user4);
        Usuario user5 = new Usuario(1,"user5","pass5");
        this.listaUsuarios.agregarUsuario(user5);
        
        Publicaciones post1 = new Publicaciones(1,"user1","Esta es una prueba","Texo");
        this.listaPublicaciones.agregarPublicacion(post1);
        Publicaciones post2 = new Publicaciones(2,"user2","Me gusta tu foto!","Foto");
        this.listaPublicaciones.agregarPublicacion(post2);
        Publicaciones post3 = new Publicaciones(3,"user3","Gracias por venir a mi cumpleaños!","texto");
        this.listaPublicaciones.agregarPublicacion(post3);
        Publicaciones post4 = new Publicaciones(4,"user4","Amo a mi gato","Foto");
        this.listaPublicaciones.agregarPublicacion(post4);
        Publicaciones post5 = new Publicaciones(5,"user5","Tengo mucho sueño","Texto");
        this.listaPublicaciones.agregarPublicacion(post5);
        Publicaciones post6 = new Publicaciones(6,"user2","Hoy piñera se robo 30000 billones","Noticia");
        this.listaPublicaciones.agregarPublicacion(post6);
        Publicaciones post7 = new Publicaciones(7,"user3","Miren a mi perro!","Foto");
        this.listaPublicaciones.agregarPublicacion(post7);
        Publicaciones post8 = new Publicaciones(8,"user5","Yo perreo sola!","Cancion");
        this.listaPublicaciones.agregarPublicacion(post8);
        Publicaciones post9 = new Publicaciones(9,"user4","Miren este producto!, esta muy barato","link");
        this.listaPublicaciones.agregarPublicacion(post9);
        Publicaciones post10 = new Publicaciones(10,"user1","lo kero muxo","texto");
        this.listaPublicaciones.agregarPublicacion(post10);
        
    }  
}
