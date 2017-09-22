
package examen2_delmerizaguirre_labprogra2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Owner
 */
public class ArchivosBinarios {

    private Objeto binario = new Objeto();
    private File archivo = null;

    public ArchivosBinarios(String path) {
        archivo = new File(path);
    }

    public Objeto getBinario() {
        return binario;
    }

    public void setBinario(Objeto binario) {
        this.binario = binario;
    }

    

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Binarios";
    }

    public void CargarArchivo() {
        try {
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    binario = (Objeto) objeto.readObject();
                } catch (EOFException e) {
                    //Encontro el final del archivo
                }
                objeto.close();
                entrada.close();

            } //Fin if
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            bw.writeObject(binario);
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }

    }

}
