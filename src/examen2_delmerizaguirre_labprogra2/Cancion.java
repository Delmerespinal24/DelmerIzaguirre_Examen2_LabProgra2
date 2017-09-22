
package examen2_delmerizaguirre_labprogra2;

import java.io.Serializable;

public class Cancion implements Serializable{
    private String nombre;
    private String artista;
    private int duracion;
    private String genero;

    public Cancion(String nombre, String artista,String genero, int duracion) {
        this.nombre = nombre;
        this.artista = artista;
        this.duracion = duracion;
        this.genero = genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
}
