
package examen2_delmerizaguirre_labprogra2;

import java.io.Serializable;
import java.util.ArrayList;

public class PlayList implements Serializable{
    private String nombre;
    private ArrayList<Cancion> lista = new ArrayList<>();

    public PlayList(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancion> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Cancion> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
     
}
