
package co.edu.uniminuto;

import java.util.Random;


public class EjercicioNo14 {

/**
* 14. Realizar un programa que genere un arreglo de 50 posiciones y se rellene de con
la función ramdom de Java (los números deben ser 1 a 99), luego de llenar hacer
la impresión de la matriz.
*/
    public static void main(String[] args) {
        // Declaracion de la varibale 
        int arrayRandom[] = new int [50];
        Random aleatorio = new Random();
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = aleatorio.nextInt(99) + 1;
        }
        System.out.println("El resultado generado es: ");
        for (int i = 0; i < arrayRandom.length; i++) {
            System.out.print(arrayRandom[i] + " ");
    }    
}
}