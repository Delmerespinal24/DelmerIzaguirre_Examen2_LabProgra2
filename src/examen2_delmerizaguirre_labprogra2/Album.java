
package examen2_delmerizaguirre_labprogra2;

import java.io.Serializable;
import java.util.ArrayList;

public class Album implements Serializable{
    private String NombreAlbum;
    private String Artista;
    private ArrayList<Cancion> lista = new ArrayList<>();

    public Album(String NombreAlbum, String Artista) {
        this.NombreAlbum = NombreAlbum;
        this.Artista = Artista;
    }

    
    public ArrayList<Cancion> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Cancion> lista) {
        this.lista = lista;
    }

    public String getNombreAlbum() {
        return NombreAlbum;
    }

    public void setNombreAlbum(String NombreAlbum) {
        this.NombreAlbum = NombreAlbum;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String Artista) {
        this.Artista = Artista;
    }
    
    

    @Override
    public String toString() {
        return NombreAlbum;
    }
    
    
    
    
    
}
