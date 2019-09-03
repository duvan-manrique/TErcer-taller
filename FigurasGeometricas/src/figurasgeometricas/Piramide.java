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
public class Piramide extends TresD{

    public Piramide(double areaBase, double altura, double ladoArea) {
        this.areaBase = areaBase;
        this.altura = altura;
        this.ladoArea = ladoArea;
    }


       private double areaBase;
       private double altura;
       private double ladoArea;
    
    @Override
    public double hallarVolumen() {
        
          return (areaBase*altura)/3;
    }

    @Override
    public double hallarArea() {
        return areaBase+ladoArea;
    }
      public void obtener() {
       System.out.println("piramide");   
       System.out.println("Area: "+hallarArea());
       System.out.println("Volumen: "+hallarVolumen());
    }
}
