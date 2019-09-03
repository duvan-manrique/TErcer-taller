/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import java.util.Scanner;

/**
 *
 * @author duvan
 */
public class Logica {
    private Figuras[] vector;
    private Scanner entrada ;
    public Logica() {
       System.out.print("Cuantas figuras quiere: ");
       entrada=new Scanner(System.in);
       int cantidad = entrada.nextInt(); 
        vector =new Figuras[cantidad];
        int i=0;
        while(cantidad>0){
        System.out.println("que figura desea ");
        System.out.println("a) circulo ");
        System.out.println("b) cuadrado ");
        System.out.println("c) triangulo ");
        System.out.println("d) esfera ");
        System.out.println("e) cubo ");
        System.out.println("f) piramide ");
        char tipo = entrada.next().charAt(0); 
        metodo1(tipo,i);
        cantidad--;
        i++;
        }
        mostrar();
        
    }

    private void metodo1(char tipo,int i) {
       switch(tipo){
           case 'a':
                System.out.println("Inserte el radio: "); 
                vector[i]=new Circulo(entrada.nextDouble());
           break;
            case 'b':
                 System.out.println("Inserte lado: "); 
                vector[i]=new Cuadrado(entrada.nextDouble(),entrada.nextDouble());
           break;
            case 'c':
            System.out.println("Inserte los tres lados del triangulo(a,b,c):"); 
            vector[i]=new Triangulo(entrada.nextDouble(),entrada.nextDouble(),entrada.nextDouble());
           break;
            case 'd':
                System.out.println("Inserte el radio: "); 
                vector[i]=new Esfera(entrada.nextDouble());
           break;
            case 'e':
            System.out.println("Inserte el largo,ancho,alto del cubo:"); 
            vector[i]=new Cubo(entrada.nextInt(),entrada.nextInt(),entrada.nextInt());
           break;
            case 'f':
            System.out.println("Inserte el area de la basa,altura de la piramide,area de un lado:"); 
            vector[i]=new Piramide(entrada.nextDouble(),entrada.nextDouble(),entrada.nextDouble());
           break;                           
       }              
    }

    private void mostrar() {
        for (Figuras recorido : vector) {
            if(recorido instanceof Circulo) {
                ((Circulo) recorido).obtener();
            } else if (recorido instanceof Triangulo) {
                ((Triangulo) recorido).obtener();
            } else if (recorido instanceof Cuadrado) {
                ((Cuadrado) recorido).obtener();
            } else if (recorido instanceof Piramide) {
                ((Piramide) recorido).obtener();
            } else if (recorido instanceof Cubo) {
                ((Cubo) recorido).obtener();
            } else if (recorido instanceof Esfera) {
                ((Esfera) recorido).obtener();
            } else {
            }
        }
    }
  
    
}
