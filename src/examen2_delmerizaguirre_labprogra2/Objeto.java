
package examen2_delmerizaguirre_labprogra2;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Delmer
 */
public class Objeto implements Serializable{
    private ArrayList<Album> listaAlbunes = new ArrayList<>();
    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    public Objeto() {
    }

    public ArrayList<Album> getListaAlbunes() {
        return listaAlbunes;
    }

    public void setListaAlbunes(ArrayList<Album> listaAlbunes) {
        this.listaAlbunes = listaAlbunes;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
    
}
