/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 *
 * @author duvan
 */
public class Cubo extends TresD{

    public Cubo(double largo, double ancho, double alto) {
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
    }
    private double largo;
    private double ancho;
    private double alto;

    @Override
    public double hallarVolumen() {
           return largo*ancho*alto;
    }

    @Override
    public double hallarArea() {
        return 2*(largo*alto+largo*ancho+ancho*alto); 
    }
    
     public void obtener() {
       if(largo!=ancho||largo!=alto||ancho!=alto){
       System.out.println("bloque");   
       System.out.println("Area: "+hallarArea());
       System.out.println("volumen: "+hallarVolumen());
       }else{
       System.out.println("cubo");   
       System.out.println("Area: "+hallarArea());
       System.out.println("volumen: "+hallarVolumen());
       }
    }
}
