/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import static java.lang.Math.PI;
import static java.lang.Math.pow;


/**
 * Clase encargada de las variables y metodos de la figura Esfera
 * @author duvan
 * @author ivan camilo
 */
public class Esfera extends TresD{
 private double radio;
    public Esfera(double radio) {
        this.radio = radio;
    }

    @Override
    public double hallarVolumen() {
       return (4/3)*PI*pow(radio,3);
    }

    @Override
    public double hallarArea() {
       return 4*PI*pow(radio,2); 
    }
   public void obtener() {
       System.out.println("esfera");   
       System.out.println("Area: "+hallarArea());
       System.out.println("volumen: "+hallarVolumen());
    }
}
