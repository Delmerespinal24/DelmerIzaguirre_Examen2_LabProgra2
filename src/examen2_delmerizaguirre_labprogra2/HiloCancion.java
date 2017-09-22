/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_delmerizaguirre_labprogra2;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Delmer
 */
public class HiloCancion extends Thread{
    private JLabel tiempo;
    private int duracion;
    private JDialog ventana;
    private int cuenta = 0;

    public HiloCancion(JLabel tiempo, int duracion, JDialog ventana) {
        this.tiempo = tiempo;
        this.duracion = duracion;
        this.ventana = ventana;
    }

  
    
    public void run(){
        while(cuenta <= duracion){
            tiempo.setText("" + cuenta);
            cuenta++;
            if(cuenta==duracion){
                JOptionPane.showMessageDialog(ventana,"La cancion a termindado");
                ventana.dispose();
            }
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            
        }     
    }
    
}
