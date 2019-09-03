/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author ivan camilo
 */
public class Circulo extends DosD{

    public Circulo(double radio) {
        this.radio = radio;
    }
    private double radio;
    private double perimetro;
    private double diametro;
    private double area;

    @Override
    public double hallarPerimetro() {
        perimetro=PI*diametro;
        return perimetro;
    }
    public double hallarDiametro(){
        return diametro = 2*radio;
        
    }

    @Override
    public double hallarArea() {
        area=perimetro*radio;
        return area;
    }
     public void obtener() {
       System.out.println("circulo");   
       System.out.println("perimetro: "+hallarPerimetro());
       System.out.println("diametro: "+hallarDiametro());
       System.out.println("area: "+hallarArea());
    }
}
