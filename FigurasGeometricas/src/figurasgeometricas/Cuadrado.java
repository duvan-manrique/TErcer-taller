/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import java.util.Scanner;

/**
 * Clase encargada de las variables y metodos de la figura cuadrado
 * @author duvan
 * @author ivan camilo
 */
public class Cuadrado extends DosD {
    /**
     * Constructor de la clase
     */

    public Cuadrado(double lado,double lado2) {
        this.lado = lado;
        this.lado2 = lado;
    }
    
    private double lado;
    private double lado2;
    private double area;
    private double perimetro;

    @Override
    public double hallarArea() {
        area=(lado*lado);
        return area;
    }

    @Override
    public double hallarPerimetro() {
        perimetro=lado*lado2*2;
        return perimetro;
    }
    public void obtener() {
       if(lado!=lado2){
       System.out.println("rectangulo");   
       System.out.println("perietro: "+hallarPerimetro());
       System.out.println("Area: "+hallarArea());
   
       }else{
       System.out.println("cuadrado");   
       System.out.println("perietro: "+hallarPerimetro());
       System.out.println("Area: "+hallarArea());
       
       }
    }
    
}
