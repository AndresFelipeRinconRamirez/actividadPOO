
package co.edu.uniminuto;

import java.util.Random;


public class EjercicioNo17 {

/* Generar un arreglo unidimensional de 50 
    posiciones que se llene con valores
aleatorios y contar la cantidad de positivos, 
    negativos y ceros del arreglo.
*/
    public static void main(String[] args) {
        // Declaracion de varibales
        int arrayRandom[] = new int [50];
        int cantidadPositivos = 0;
        int cantidadNegativos = 0;
        int cantidadCeros = 0;
        Random random = new Random();
        for (int i=0; i<arrayRandom.length;i++){
            arrayRandom [i] = random.nextInt(150)-99;
            }
        for (int numero : arrayRandom){
            if ( numero > 0 ){
            cantidadPositivos++;
            }
            else if (numero < 0){
                   cantidadNegativos++;
                   }
            else {
                cantidadCeros++;
                }
           }
        for (int numero: arrayRandom ){
            System.out.print(numero+ " " );  
        }
        
            System.out.println("La cantidad de numeros positvos es: " +cantidadPositivos);
            System.out.println("La cantidad de numeros negativos es: " +cantidadNegativos);
            System.out.println("La cantidad de numeros ceros es: " +cantidadCeros);
    }
}   
            
        
           