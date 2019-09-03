/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import java.util.Scanner;

/**
 *
 * @author ivan camilo
 */
public class Triangulo extends DosD  {

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
   private double lado1;
   private double lado2;
   private double lado3;
   private double perimetro;
   private double area;
   
    @Override
    public double hallarPerimetro() {        
         perimetro = lado3 + lado1 + lado2;
        return perimetro;
    }
    
    public String hallarTipo(){
       
       if(lado3==lado2&lado3==lado1&lado2==lado1){
           return ("El triangulo es equilatero");          
       }else{
           if(lado3==lado2|lado3==lado1|lado1==lado2){
                return("El triangulo es isosceles"); 
               
           }else{
                return ("El triangulo es Escaleno");            }
       
       
       }       
    }

    @Override
    public double hallarArea() {
        double semiPerimetro= perimetro/2;
        area=Math.sqrt(semiPerimetro*(semiPerimetro-lado1)*(semiPerimetro-lado2)*(semiPerimetro-lado3));
        return area;
    }
    
     public void obtener() {
       System.out.println("triangulo");   
       System.out.println("tipo: "+hallarTipo());
        System.out.println("perietro: "+hallarPerimetro());
       System.out.println("Area: "+hallarArea());
      
    }
}
