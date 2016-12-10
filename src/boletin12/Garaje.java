
package boletin12;

import java.time.*;
import javax.swing.JOptionPane;

public class Garaje {
    private int numeroCoches, matricula;
    private long timeEntrada, timeSalida, tiempo;
    private float precio, dineroRecibido, dineroDevuelto, cambio;
    
    public boolean comprobarSitio(){
        int plazas;
        numeroCoches = Integer.parseInt(JOptionPane.showInputDialog("Nº de coches: "));
            if(numeroCoches <= 5){
                numeroCoches++;
            return true;    
            }
            else
            return false;
    }
    public void pedirMatricula(){
        matricula=Integer.parseInt(JOptionPane.showInputDialog("Introduce la matricula"));
    }
    public void entrada(){
        if(comprobarSitio() == true){
            System.out.println("Plazas disponibles ");
            timeEntrada = System.currentTimeMillis();
        }
        else
            System.out.println("Completo ");
            
    }
    public long tiempo(){
        timeSalida=System.currentTimeMillis();
        numeroCoches--;
        tiempo = (timeSalida - timeEntrada);
        return tiempo;
    }
    public float precio(){
        if (tiempo <= 3) {
            precio = 1.5f;
        } 
        else
            precio = (float) (1.5+(0.2 * (tiempo-3)));
    return precio;
    }
    public float recibido(){
        return dineroRecibido = Float.parseFloat(JOptionPane.showInputDialog("Introduzca " +precio+ " euros"));
    }
   
    public float devuelto(){
        return dineroRecibido-precio; 
       
    }
    public void mostrar(){
        System.out.println("FACTURA \nMATRÍCULA COCHE: " +matricula+ "\nTIEMPO: " +tiempo+ "\nPRECIO: " +precio+ "\nDINERO RECIBIDO: " +dineroRecibido+ "\nDINERO DEVUELTO: " +dineroDevuelto);
    }



}