
package examen2_delmerizaguirre_labprogra2;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuario implements Serializable {
    private String nombre;
    private int edad;
    private String nick;
    private String pass;
    private ArrayList<PlayList> playList = new ArrayList<>();
    private ArrayList<Cancion> favoritos = new ArrayList<>();

    public Usuario(String nombre, String nick, String pass, int edad) {
        this.nombre = nombre;
        this.nick = nick;
        this.pass = pass;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public ArrayList<PlayList> getPlayList() {
        return playList;
    }

    public void setPlayList(ArrayList<PlayList> playList) {
        this.playList = playList;
    }

   
    public ArrayList<Cancion> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(ArrayList<Cancion> favoritos) {
        this.favoritos = favoritos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    

    @Override
    public String toString() {
        return nick;
    }
    
    
}
